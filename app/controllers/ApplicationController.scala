package controllers

import com.mohiva.play.silhouette
import com.mohiva.play.silhouette.api.LogoutEvent
import com.mohiva.play.silhouette.api.actions._
import com.mohiva.play.silhouette.impl.providers.GoogleTotpInfo
import javax.inject.Inject
import play.api.mvc._
import utils.route.Calls
import utils.auth.DefaultEnv
import play.api.libs.json.Json
import models.UserClassRepository
import models.CartRepository
import models.CommentRepository
import models.PrOpinionRepository

import scala.concurrent.{ ExecutionContext, Future }

/**
 * The basic application controller.
 */
class ApplicationController @Inject() (
  scc: SilhouetteControllerComponents,
  userRepo: UserClassRepository,
  cartRepo: CartRepository,
  commentRepo: CommentRepository,
  prOpinionRepo: PrOpinionRepository,
  home: views.html.home
)(implicit ex: ExecutionContext) extends SilhouetteController(scc) {

  /**
   * Handles the index action.
   *
   * @return The result to display.
   */
  def index = SecuredAction.async { implicit request: SecuredRequest[EnvType, AnyContent] =>
    authInfoRepository.find[GoogleTotpInfo](request.identity.loginInfo).map { totpInfoOpt =>
      Ok(home(request.identity, totpInfoOpt))
    }
  }

  /**
   * Handles the Sign Out action.
   *
   * @return The result to display.
   */
  def signOut = SecuredAction.async { implicit request: SecuredRequest[EnvType, AnyContent] =>
    val result = Redirect(Calls.home)
    eventBus.publish(LogoutEvent(request.identity, request))
    authenticatorService.discard(request.authenticator, result)
  }

  def isLogged = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    val provider = request.identity.loginInfo.providerID
    val key = request.identity.loginInfo.providerKey
    val user = userRepo.getByProvider(provider, key)
    user.map(user => Ok(Json.toJson(user)))
  }

  def cart = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    val provider = request.identity.loginInfo.providerID
    val key = request.identity.loginInfo.providerKey
    userRepo.getByProvider(provider, key).flatMap(elem => {
      elem match {
        case Some(user) => {
          val cart = cartRepo.list(user.id)
          cart.map(cart => Ok(Json.toJson(cart)))
        }
        case None => Future.successful(Ok(Json.toJson("{status: \"success\"}")))
      }
    })
  }

  def addToCartHandle = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    val product = request.body.asJson.get("product").as[Long]
    val count = request.body.asJson.get("count").as[Int]

    val provider = request.identity.loginInfo.providerID
    val key = request.identity.loginInfo.providerKey
    userRepo.getByProvider(provider, key).flatMap(elem => {
      elem match {
        case Some(user) => {
          cartRepo.create(user.id, product, count).map { cart =>
            Ok(Json.toJson(cart))
          }
        }
        case None => Future.successful(Ok(Json.toJson("{status: \"success\"}")))
      }
    })
  }

  def addCommentHandle = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    val stars = request.body.asJson.get("stars").as[Int]
    val text = request.body.asJson.get("text").as[String]

    val provider = request.identity.loginInfo.providerID
    val key = request.identity.loginInfo.providerKey
    userRepo.getByProvider(provider, key).flatMap(elem => {
      elem match {
        case Some(user) => {
          commentRepo.create(user.id, stars, text).map { comment =>
            Ok(Json.toJson(comment))
          }
        }
        case None => Future.successful(Ok(Json.toJson("{status: \"success\"}")))
      }
    })

  }

  def addOpinionHandle = silhouette.SecuredAction.async { implicit request: SecuredRequest[DefaultEnv, AnyContent] =>
    val product = request.body.asJson.get("product").as[Long]
    val stars = request.body.asJson.get("stars").as[Int]
    val text = request.body.asJson.get("text").as[String]

    val provider = request.identity.loginInfo.providerID
    val key = request.identity.loginInfo.providerKey
    userRepo.getByProvider(provider, key).flatMap(elem => {
      elem match {
        case Some(user) => {
          prOpinionRepo.create(user.id, product, stars, text).map { opinion =>
            Ok(Json.toJson(opinion))
          }
        }
        case None => Future.successful(Ok(Json.toJson("{status: \"success\"}")))
      }
    })

  }
}
