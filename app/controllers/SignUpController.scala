package controllers

import java.util.UUID

import com.mohiva.play.silhouette.api._
import com.mohiva.play.silhouette.api.repositories.AuthInfoRepository
import com.mohiva.play.silhouette.api.util.PasswordHasherRegistry
import com.mohiva.play.silhouette.impl.providers._
import javax.inject.Inject
import models.User
import models.services.{AuthTokenService, UserService}
import play.api.i18n.{I18nSupport, Messages}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}
import utils.auth.DefaultEnv

import scala.concurrent.{ExecutionContext, Future}

/**
 * The `Sign Up` controller.
 *
 * @param components             The Play controller components.
 * @param silhouette             The Silhouette stack.
 * @param userService            The user service implementation.
 * @param authInfoRepository     The auth info repository implementation.
 * @param authTokenService       The auth token service implementation.
 * @param passwordHasherRegistry The password hasher registry.
 * @param assets                 The Play assets finder.
 * @param ex                     The execution context.
 */
class SignUpController @Inject() (
  components: ControllerComponents,
  silhouette: Silhouette[DefaultEnv],
  userService: UserService,
  authInfoRepository: AuthInfoRepository,
  authTokenService: AuthTokenService,
  passwordHasherRegistry: PasswordHasherRegistry
)(
  implicit
  assets: AssetsFinder,
  ex: ExecutionContext
) extends AbstractController(components) with I18nSupport {


  def view = silhouette.UnsecuredAction.async { implicit request: Request[AnyContent] =>
    Future.successful(Ok("register"))
  }


  def submit = silhouette.UnsecuredAction.async { implicit request =>
    val password = request.body.asJson.get("usrName").as[String]
    val name = request.body.asJson.get("name").as[String]
    val surname = request.body.asJson.get("surname").as[String]
    val email = request.body.asJson.get("email").as[String]



    val result = Redirect(routes.SignUpController.view()).flashing("info" -> Messages("sign.up.email.sent", email))
    val loginInfo = LoginInfo(CredentialsProvider.ID, email)

    userService.retrieve(loginInfo).flatMap {
      case None =>
        val authInfo = passwordHasherRegistry.current.hash(password)
        val user = User(
          id = UUID.randomUUID(),
          loginInfo = loginInfo,
          usrName = Some(name + " " + surname),
          name = Some(name),
          surname = Some(surname),
          email = Some(email),
          admin = false
        )
        Future.successful(result)
    }

    Future.successful(Ok("register"))
  }
}

    /*implicit request: Request[AnyContent] =>
    SignUpForm.form.bindFromRequest.fold(
      form => Future.successful(BadRequest("login")),
      success = data => {
        val result = Redirect(routes.HomeController.users()).flashing("info" -> Messages("sign.up.email.sent", data.email))
        val loginInfo = LoginInfo(CredentialsProvider.ID, data.email)
        userService.retrieve(loginInfo).flatMap {
          case Some(user) =>
            Future.successful(result)
          case None =>
            val authInfo = passwordHasherRegistry.current.hash(data.password)
            val user = User(
              /*
              id = UUID.randomUUID(),
              usrName = loginInfo,*/
              id = 1,
              usrName = data.usrName,
              name = data.name,
              surname = data.surname,
              email = data.email,
              admin = false
            )
        }
      }
    )
  }*/
