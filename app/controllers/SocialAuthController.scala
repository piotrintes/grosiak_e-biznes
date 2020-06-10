package controllers

import com.mohiva.play.silhouette.api._
import com.mohiva.play.silhouette.api.exceptions.ProviderException
import com.mohiva.play.silhouette.impl.providers._
import models.UserClassRepository
import javax.inject.Inject
import play.api.i18n.Messages
import play.api.mvc.{ AnyContent, Request }
import utils.route.Calls

import scala.concurrent.{ ExecutionContext, Future }

/**
 * The social auth controller.
 */
class SocialAuthController @Inject() (
  scc: SilhouetteControllerComponents, userRepo: UserClassRepository
)(implicit ex: ExecutionContext) extends SilhouetteController(scc) {

  /**
   * Authenticates a user against a social provider.
   *
   * @param provider The ID of the provider to authenticate against.
   * @return The result to display.
   */
  def authenticate(provider: String) = Action.async { implicit request: Request[AnyContent] =>
    (socialProviderRegistry.get[SocialProvider](provider) match {
      case Some(p: SocialProvider with CommonSocialProfileBuilder) =>
        p.authenticate().flatMap {
          case Left(result) => Future.successful(result)
          case Right(authInfo) => for {
            profile <- p.retrieveProfile(authInfo)
            user <- userService.save(profile)
            authInfo <- authInfoRepository.save(profile.loginInfo, authInfo)
            authenticator <- authenticatorService.create(profile.loginInfo)
            value <- authenticatorService.init(authenticator)
            result <- authenticatorService.embed(value, Redirect("http://localhost:3000"))
          } yield {
            userRepo.getByProvider(user.loginInfo.providerID, user.loginInfo.providerKey).flatMap(elem =>
              {
                elem match {
                  case Some(_) => Future.successful(true)
                  case None => userRepo.create(user.loginInfo.providerID, user.loginInfo.providerKey,
                    user.fullName.getOrElse("name surname"), user.firstName.getOrElse("name"),
                    user.lastName.getOrElse("surname"), user.email.getOrElse("email"), false)
                }
              })
            eventBus.publish(LoginEvent(user, request))
            result
          }
        }
      case _ => Future.failed(new ProviderException(s"Cannot authenticate with unexpected social provider $provider"))
    }).recover {
      case e: ProviderException =>
        logger.error("Unexpected provider error", e)
        Redirect(Calls.signin).flashing("error" -> Messages("could.not.authenticate"))
    }
  }
}
