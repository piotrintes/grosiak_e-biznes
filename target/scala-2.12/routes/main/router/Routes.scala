// @GENERATOR:play-routes-compiler
// @SOURCE:/home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project_silhouette/conf/routes
// @DATE:Tue Jun 09 18:59:01 CEST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ApplicationController_7: controllers.ApplicationController,
  // @LINE:8
  SocialAuthController_0: controllers.SocialAuthController,
  // @LINE:10
  SignUpController_8: controllers.SignUpController,
  // @LINE:13
  SignInController_1: controllers.SignInController,
  // @LINE:16
  TotpController_2: controllers.TotpController,
  // @LINE:22
  TotpRecoveryController_6: controllers.TotpRecoveryController,
  // @LINE:25
  ForgotPasswordController_4: controllers.ForgotPasswordController,
  // @LINE:27
  ResetPasswordController_5: controllers.ResetPasswordController,
  // @LINE:29
  ChangePasswordController_3: controllers.ChangePasswordController,
  // @LINE:32
  ActivateAccountController_9: controllers.ActivateAccountController,
  // @LINE:38
  HomeController_11: controllers.HomeController,
  // @LINE:146
  Assets_10: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ApplicationController_7: controllers.ApplicationController,
    // @LINE:8
    SocialAuthController_0: controllers.SocialAuthController,
    // @LINE:10
    SignUpController_8: controllers.SignUpController,
    // @LINE:13
    SignInController_1: controllers.SignInController,
    // @LINE:16
    TotpController_2: controllers.TotpController,
    // @LINE:22
    TotpRecoveryController_6: controllers.TotpRecoveryController,
    // @LINE:25
    ForgotPasswordController_4: controllers.ForgotPasswordController,
    // @LINE:27
    ResetPasswordController_5: controllers.ResetPasswordController,
    // @LINE:29
    ChangePasswordController_3: controllers.ChangePasswordController,
    // @LINE:32
    ActivateAccountController_9: controllers.ActivateAccountController,
    // @LINE:38
    HomeController_11: controllers.HomeController,
    // @LINE:146
    Assets_10: controllers.Assets
  ) = this(errorHandler, ApplicationController_7, SocialAuthController_0, SignUpController_8, SignInController_1, TotpController_2, TotpRecoveryController_6, ForgotPasswordController_4, ResetPasswordController_5, ChangePasswordController_3, ActivateAccountController_9, HomeController_11, Assets_10, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ApplicationController_7, SocialAuthController_0, SignUpController_8, SignInController_1, TotpController_2, TotpRecoveryController_6, ForgotPasswordController_4, ResetPasswordController_5, ChangePasswordController_3, ActivateAccountController_9, HomeController_11, Assets_10, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ApplicationController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signOut""", """controllers.ApplicationController.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>""", """controllers.SocialAuthController.authenticate(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """totp""", """controllers.TotpController.view(userId:java.util.UUID, sharedKey:String, rememberMe:Boolean)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """enableTotp""", """controllers.TotpController.enableTotp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """disableTotp""", """controllers.TotpController.disableTotp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """totpSubmit""", """controllers.TotpController.submit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """enableTotpSubmit""", """controllers.TotpController.enableTotpSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """totpRecovery""", """controllers.TotpRecoveryController.view(userID:java.util.UUID, sharedKey:String, rememberMe:Boolean)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """totpRecoverySubmit""", """controllers.TotpRecoveryController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/forgot""", """controllers.ForgotPasswordController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/forgot""", """controllers.ForgotPasswordController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/reset/""" + "$" + """token<[^/]+>""", """controllers.ResetPasswordController.view(token:java.util.UUID)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/reset/""" + "$" + """token<[^/]+>""", """controllers.ResetPasswordController.submit(token:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/change""", """controllers.ChangePasswordController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/change""", """controllers.ChangePasswordController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/email/""" + "$" + """email<[^/]+>""", """controllers.ActivateAccountController.send(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/activate/""" + "$" + """token<[^/]+>""", """controllers.ActivateAccountController.activate(token:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategory""", """controllers.HomeController.addCategory"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategoryhandle""", """controllers.HomeController.addCategoryHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecategory/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateCategory(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecategoryhandle""", """controllers.HomeController.updateCategoryHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletecategory/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteCategory(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/""" + "$" + """id<[^/]+>""", """controllers.HomeController.getCategory(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.HomeController.getCategorys"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.HomeController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproducthandle""", """controllers.HomeController.addProductHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproducthandle""", """controllers.HomeController.updateProductHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.HomeController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""" + "$" + """category<[^/]+>""", """controllers.HomeController.getProductsByCat(category:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.HomeController.getProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete/""" + "$" + """id<[^/]+>""", """controllers.HomeController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addopinion/""" + "$" + """productid<[^/]+>""", """controllers.HomeController.addOpinion(productid:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addopinionhandle""", """controllers.HomeController.addOpinionHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateopinion/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateOpinion(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateopinionhandle""", """controllers.HomeController.updateOpinionHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteopinion/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteOpinion(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions/""" + "$" + """productid<[^/]+>""", """controllers.HomeController.opinions(productid:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addpromotion/""" + "$" + """productid<[^/]+>""", """controllers.HomeController.addPromotion(productid:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addpromotionhandle""", """controllers.HomeController.addPromotionHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatepromotion/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updatePromotion(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatepromotionhandle""", """controllers.HomeController.updatePromotionHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletepromotion/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deletePromotion(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """promotion/""" + "$" + """id<[^/]+>""", """controllers.HomeController.promotion(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """promotionpr/""" + "$" + """id<[^/]+>""", """controllers.HomeController.promotionpr(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """promotions""", """controllers.HomeController.promotions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcomment""", """controllers.HomeController.addComment"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcommenthandle""", """controllers.HomeController.addCommentHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecomment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateComment(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecommenthandle""", """controllers.HomeController.updateCommentHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletecomment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteComment(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.comment(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comments""", """controllers.HomeController.comments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtocart/""" + "$" + """id<[^/]+>""", """controllers.HomeController.addToCart(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtocarthandle""", """controllers.HomeController.addToCartHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecart/""" + "$" + """id<[^/]+>""", """controllers.HomeController.addToCart(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecarthandle""", """controllers.HomeController.addToCartHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletefromcart/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteFromCart(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.HomeController.cart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtransaction""", """controllers.HomeController.addTransaction"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtransactionhandle""", """controllers.HomeController.addTransactionHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatetransaction/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateTransaction(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatetransactionhandle""", """controllers.HomeController.updateTransactionHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletetransaction/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteTransaction(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transaction/""" + "$" + """id<[^/]+>""", """controllers.HomeController.transaction(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactions""", """controllers.HomeController.transactions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactionsusr""", """controllers.HomeController.transactionsUsr"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addpayment""", """controllers.HomeController.addPayment"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addpaymenthandle""", """controllers.HomeController.addPaymentHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatepayment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updatePayment(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatepaymenthandle""", """controllers.HomeController.updatePaymentHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletepayment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deletePayment(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.payment(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paymentbyt/""" + "$" + """id<[^/]+>""", """controllers.HomeController.paymentTrans(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adddelivery""", """controllers.HomeController.addDelivery"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adddeliveryhandle""", """controllers.HomeController.addDeliveryHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatedelivery/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateDelivery(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatedeliveryhandle""", """controllers.HomeController.updateDeliveryHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletedelivery/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteDelivery(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delivery/""" + "$" + """id<[^/]+>""", """controllers.HomeController.delivery(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deliverybyt/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deliveryTrans(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ApplicationController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ApplicationController_index0_invoker = createInvoker(
    ApplicationController_7.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ApplicationController_signOut1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signOut")))
  )
  private[this] lazy val controllers_ApplicationController_signOut1_invoker = createInvoker(
    ApplicationController_7.signOut,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signOut",
      Nil,
      "GET",
      this.prefix + """signOut""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_SocialAuthController_authenticate2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate2_invoker = createInvoker(
    SocialAuthController_0.authenticate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_SignUpController_view3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_view3_invoker = createInvoker(
    SignUpController_8.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "view",
      Nil,
      "GET",
      this.prefix + """signUp""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_SignUpController_submit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_submit4_invoker = createInvoker(
    SignUpController_8.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "submit",
      Nil,
      "POST",
      this.prefix + """signUp""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_SignInController_view5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_view5_invoker = createInvoker(
    SignInController_1.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "view",
      Nil,
      "GET",
      this.prefix + """signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_SignInController_submit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_submit6_invoker = createInvoker(
    SignInController_1.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "submit",
      Nil,
      "POST",
      this.prefix + """signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_TotpController_view7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("totp")))
  )
  private[this] lazy val controllers_TotpController_view7_invoker = createInvoker(
    TotpController_2.view(fakeValue[java.util.UUID], fakeValue[String], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpController",
      "view",
      Seq(classOf[java.util.UUID], classOf[String], classOf[Boolean]),
      "GET",
      this.prefix + """totp""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_TotpController_enableTotp8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("enableTotp")))
  )
  private[this] lazy val controllers_TotpController_enableTotp8_invoker = createInvoker(
    TotpController_2.enableTotp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpController",
      "enableTotp",
      Nil,
      "GET",
      this.prefix + """enableTotp""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_TotpController_disableTotp9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("disableTotp")))
  )
  private[this] lazy val controllers_TotpController_disableTotp9_invoker = createInvoker(
    TotpController_2.disableTotp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpController",
      "disableTotp",
      Nil,
      "GET",
      this.prefix + """disableTotp""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_TotpController_submit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("totpSubmit")))
  )
  private[this] lazy val controllers_TotpController_submit10_invoker = createInvoker(
    TotpController_2.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpController",
      "submit",
      Nil,
      "POST",
      this.prefix + """totpSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_TotpController_enableTotpSubmit11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("enableTotpSubmit")))
  )
  private[this] lazy val controllers_TotpController_enableTotpSubmit11_invoker = createInvoker(
    TotpController_2.enableTotpSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpController",
      "enableTotpSubmit",
      Nil,
      "POST",
      this.prefix + """enableTotpSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_TotpRecoveryController_view12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("totpRecovery")))
  )
  private[this] lazy val controllers_TotpRecoveryController_view12_invoker = createInvoker(
    TotpRecoveryController_6.view(fakeValue[java.util.UUID], fakeValue[String], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpRecoveryController",
      "view",
      Seq(classOf[java.util.UUID], classOf[String], classOf[Boolean]),
      "GET",
      this.prefix + """totpRecovery""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_TotpRecoveryController_submit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("totpRecoverySubmit")))
  )
  private[this] lazy val controllers_TotpRecoveryController_submit13_invoker = createInvoker(
    TotpRecoveryController_6.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TotpRecoveryController",
      "submit",
      Nil,
      "POST",
      this.prefix + """totpRecoverySubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ForgotPasswordController_view14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/forgot")))
  )
  private[this] lazy val controllers_ForgotPasswordController_view14_invoker = createInvoker(
    ForgotPasswordController_4.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ForgotPasswordController",
      "view",
      Nil,
      "GET",
      this.prefix + """password/forgot""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ForgotPasswordController_submit15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/forgot")))
  )
  private[this] lazy val controllers_ForgotPasswordController_submit15_invoker = createInvoker(
    ForgotPasswordController_4.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ForgotPasswordController",
      "submit",
      Nil,
      "POST",
      this.prefix + """password/forgot""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ResetPasswordController_view16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ResetPasswordController_view16_invoker = createInvoker(
    ResetPasswordController_5.view(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ResetPasswordController",
      "view",
      Seq(classOf[java.util.UUID]),
      "GET",
      this.prefix + """password/reset/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ResetPasswordController_submit17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ResetPasswordController_submit17_invoker = createInvoker(
    ResetPasswordController_5.submit(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ResetPasswordController",
      "submit",
      Seq(classOf[java.util.UUID]),
      "POST",
      this.prefix + """password/reset/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ChangePasswordController_view18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/change")))
  )
  private[this] lazy val controllers_ChangePasswordController_view18_invoker = createInvoker(
    ChangePasswordController_3.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChangePasswordController",
      "view",
      Nil,
      "GET",
      this.prefix + """password/change""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ChangePasswordController_submit19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/change")))
  )
  private[this] lazy val controllers_ChangePasswordController_submit19_invoker = createInvoker(
    ChangePasswordController_3.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChangePasswordController",
      "submit",
      Nil,
      "POST",
      this.prefix + """password/change""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ActivateAccountController_send20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/email/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActivateAccountController_send20_invoker = createInvoker(
    ActivateAccountController_9.send(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivateAccountController",
      "send",
      Seq(classOf[String]),
      "GET",
      this.prefix + """account/email/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ActivateAccountController_activate21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/activate/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActivateAccountController_activate21_invoker = createInvoker(
    ActivateAccountController_9.activate(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivateAccountController",
      "activate",
      Seq(classOf[java.util.UUID]),
      "GET",
      this.prefix + """account/activate/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_addCategory22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategory")))
  )
  private[this] lazy val controllers_HomeController_addCategory22_invoker = createInvoker(
    HomeController_11.addCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCategory",
      Nil,
      "GET",
      this.prefix + """addcategory""",
      """ Categories""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_addCategoryHandle23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategoryhandle")))
  )
  private[this] lazy val controllers_HomeController_addCategoryHandle23_invoker = createInvoker(
    HomeController_11.addCategoryHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCategoryHandle",
      Nil,
      "POST",
      this.prefix + """addcategoryhandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:41
  private[this] lazy val controllers_HomeController_updateCategory24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateCategory24_invoker = createInvoker(
    HomeController_11.updateCategory(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateCategory",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updatecategory/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_HomeController_updateCategoryHandle25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecategoryhandle")))
  )
  private[this] lazy val controllers_HomeController_updateCategoryHandle25_invoker = createInvoker(
    HomeController_11.updateCategoryHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateCategoryHandle",
      Nil,
      "POST",
      this.prefix + """updatecategoryhandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:44
  private[this] lazy val controllers_HomeController_deleteCategory26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletecategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteCategory26_invoker = createInvoker(
    HomeController_11.deleteCategory(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteCategory",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deletecategory/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_HomeController_getCategory27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getCategory27_invoker = createInvoker(
    HomeController_11.getCategory(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getCategory",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """category/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_HomeController_getCategorys28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_HomeController_getCategorys28_invoker = createInvoker(
    HomeController_11.getCategorys,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getCategorys",
      Nil,
      "GET",
      this.prefix + """categories""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_HomeController_addProduct29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_HomeController_addProduct29_invoker = createInvoker(
    HomeController_11.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """addproduct""",
      """ Products""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_HomeController_addProductHandle30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproducthandle")))
  )
  private[this] lazy val controllers_HomeController_addProductHandle30_invoker = createInvoker(
    HomeController_11.addProductHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProductHandle",
      Nil,
      "POST",
      this.prefix + """addproducthandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:52
  private[this] lazy val controllers_HomeController_updateProduct31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProduct31_invoker = createInvoker(
    HomeController_11.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateproduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_HomeController_updateProductHandle32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproducthandle")))
  )
  private[this] lazy val controllers_HomeController_updateProductHandle32_invoker = createInvoker(
    HomeController_11.updateProductHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProductHandle",
      Nil,
      "POST",
      this.prefix + """updateproducthandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:55
  private[this] lazy val controllers_HomeController_getProducts33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_getProducts33_invoker = createInvoker(
    HomeController_11.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_HomeController_getProductsByCat34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("category", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getProductsByCat34_invoker = createInvoker(
    HomeController_11.getProductsByCat(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProductsByCat",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """products/""" + "$" + """category<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_HomeController_getProduct35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getProduct35_invoker = createInvoker(
    HomeController_11.getProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_HomeController_delete36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_delete36_invoker = createInvoker(
    HomeController_11.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_HomeController_addOpinion37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addopinion/"), DynamicPart("productid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addOpinion37_invoker = createInvoker(
    HomeController_11.addOpinion(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addOpinion",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addopinion/""" + "$" + """productid<[^/]+>""",
      """ Product Opinions""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_HomeController_addOpinionHandle38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addopinionhandle")))
  )
  private[this] lazy val controllers_HomeController_addOpinionHandle38_invoker = createInvoker(
    HomeController_11.addOpinionHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addOpinionHandle",
      Nil,
      "POST",
      this.prefix + """addopinionhandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:64
  private[this] lazy val controllers_HomeController_updateOpinion39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateopinion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateOpinion39_invoker = createInvoker(
    HomeController_11.updateOpinion(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateOpinion",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updateopinion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_HomeController_updateOpinionHandle40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateopinionhandle")))
  )
  private[this] lazy val controllers_HomeController_updateOpinionHandle40_invoker = createInvoker(
    HomeController_11.updateOpinionHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateOpinionHandle",
      Nil,
      "POST",
      this.prefix + """updateopinionhandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:67
  private[this] lazy val controllers_HomeController_deleteOpinion41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteopinion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteOpinion41_invoker = createInvoker(
    HomeController_11.deleteOpinion(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteOpinion",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deleteopinion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_HomeController_opinions42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions/"), DynamicPart("productid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_opinions42_invoker = createInvoker(
    HomeController_11.opinions(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "opinions",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """opinions/""" + "$" + """productid<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_HomeController_addPromotion43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpromotion/"), DynamicPart("productid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addPromotion43_invoker = createInvoker(
    HomeController_11.addPromotion(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPromotion",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addpromotion/""" + "$" + """productid<[^/]+>""",
      """ Promotions""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_HomeController_addPromotionHandle44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpromotionhandle")))
  )
  private[this] lazy val controllers_HomeController_addPromotionHandle44_invoker = createInvoker(
    HomeController_11.addPromotionHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPromotionHandle",
      Nil,
      "POST",
      this.prefix + """addpromotionhandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:74
  private[this] lazy val controllers_HomeController_updatePromotion45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepromotion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updatePromotion45_invoker = createInvoker(
    HomeController_11.updatePromotion(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updatePromotion",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updatepromotion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_HomeController_updatePromotionHandle46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepromotionhandle")))
  )
  private[this] lazy val controllers_HomeController_updatePromotionHandle46_invoker = createInvoker(
    HomeController_11.updatePromotionHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updatePromotionHandle",
      Nil,
      "POST",
      this.prefix + """updatepromotionhandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:77
  private[this] lazy val controllers_HomeController_deletePromotion47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletepromotion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deletePromotion47_invoker = createInvoker(
    HomeController_11.deletePromotion(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deletePromotion",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deletepromotion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_HomeController_promotion48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("promotion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_promotion48_invoker = createInvoker(
    HomeController_11.promotion(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "promotion",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """promotion/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_HomeController_promotionpr49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("promotionpr/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_promotionpr49_invoker = createInvoker(
    HomeController_11.promotionpr(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "promotionpr",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """promotionpr/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_HomeController_promotions50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("promotions")))
  )
  private[this] lazy val controllers_HomeController_promotions50_invoker = createInvoker(
    HomeController_11.promotions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "promotions",
      Nil,
      "GET",
      this.prefix + """promotions""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_HomeController_addComment51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcomment")))
  )
  private[this] lazy val controllers_HomeController_addComment51_invoker = createInvoker(
    HomeController_11.addComment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addComment",
      Nil,
      "GET",
      this.prefix + """addcomment""",
      """ Comments""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_HomeController_addCommentHandle52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcommenthandle")))
  )
  private[this] lazy val controllers_HomeController_addCommentHandle52_invoker = createInvoker(
    HomeController_11.addCommentHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCommentHandle",
      Nil,
      "POST",
      this.prefix + """addcommenthandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:86
  private[this] lazy val controllers_HomeController_updateComment53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecomment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateComment53_invoker = createInvoker(
    HomeController_11.updateComment(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateComment",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updatecomment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_HomeController_updateCommentHandle54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecommenthandle")))
  )
  private[this] lazy val controllers_HomeController_updateCommentHandle54_invoker = createInvoker(
    HomeController_11.updateCommentHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateCommentHandle",
      Nil,
      "GET",
      this.prefix + """updatecommenthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:88
  private[this] lazy val controllers_HomeController_deleteComment55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletecomment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteComment55_invoker = createInvoker(
    HomeController_11.deleteComment(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteComment",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deletecomment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_HomeController_comment56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_comment56_invoker = createInvoker(
    HomeController_11.comment(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "comment",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """comment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_HomeController_comments57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comments")))
  )
  private[this] lazy val controllers_HomeController_comments57_invoker = createInvoker(
    HomeController_11.comments,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "comments",
      Nil,
      "GET",
      this.prefix + """comments""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_HomeController_addToCart58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtocart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addToCart58_invoker = createInvoker(
    HomeController_11.addToCart(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addToCart",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """addtocart/""" + "$" + """id<[^/]+>""",
      """ Cart""",
      Seq()
    )
  )

  // @LINE:105
  private[this] lazy val controllers_HomeController_addToCartHandle59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtocarthandle")))
  )
  private[this] lazy val controllers_HomeController_addToCartHandle59_invoker = createInvoker(
    HomeController_11.addToCartHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addToCartHandle",
      Nil,
      "POST",
      this.prefix + """addtocarthandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:106
  private[this] lazy val controllers_HomeController_addToCart60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addToCart60_invoker = createInvoker(
    HomeController_11.addToCart(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addToCart",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updatecart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:108
  private[this] lazy val controllers_HomeController_addToCartHandle61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecarthandle")))
  )
  private[this] lazy val controllers_HomeController_addToCartHandle61_invoker = createInvoker(
    HomeController_11.addToCartHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addToCartHandle",
      Nil,
      "POST",
      this.prefix + """updatecarthandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:109
  private[this] lazy val controllers_HomeController_deleteFromCart62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletefromcart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteFromCart62_invoker = createInvoker(
    HomeController_11.deleteFromCart(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteFromCart",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deletefromcart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:110
  private[this] lazy val controllers_HomeController_cart63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_HomeController_cart63_invoker = createInvoker(
    HomeController_11.cart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cart",
      Nil,
      "GET",
      this.prefix + """cart""",
      """""",
      Seq()
    )
  )

  // @LINE:113
  private[this] lazy val controllers_HomeController_addTransaction64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtransaction")))
  )
  private[this] lazy val controllers_HomeController_addTransaction64_invoker = createInvoker(
    HomeController_11.addTransaction,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTransaction",
      Nil,
      "GET",
      this.prefix + """addtransaction""",
      """ Transactions""",
      Seq()
    )
  )

  // @LINE:115
  private[this] lazy val controllers_HomeController_addTransactionHandle65_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtransactionhandle")))
  )
  private[this] lazy val controllers_HomeController_addTransactionHandle65_invoker = createInvoker(
    HomeController_11.addTransactionHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTransactionHandle",
      Nil,
      "POST",
      this.prefix + """addtransactionhandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:116
  private[this] lazy val controllers_HomeController_updateTransaction66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatetransaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateTransaction66_invoker = createInvoker(
    HomeController_11.updateTransaction(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateTransaction",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updatetransaction/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:117
  private[this] lazy val controllers_HomeController_updateTransactionHandle67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatetransactionhandle")))
  )
  private[this] lazy val controllers_HomeController_updateTransactionHandle67_invoker = createInvoker(
    HomeController_11.updateTransactionHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateTransactionHandle",
      Nil,
      "GET",
      this.prefix + """updatetransactionhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:118
  private[this] lazy val controllers_HomeController_deleteTransaction68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletetransaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteTransaction68_invoker = createInvoker(
    HomeController_11.deleteTransaction(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteTransaction",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deletetransaction/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:119
  private[this] lazy val controllers_HomeController_transaction69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_transaction69_invoker = createInvoker(
    HomeController_11.transaction(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "transaction",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """transaction/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:120
  private[this] lazy val controllers_HomeController_transactions70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactions")))
  )
  private[this] lazy val controllers_HomeController_transactions70_invoker = createInvoker(
    HomeController_11.transactions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "transactions",
      Nil,
      "GET",
      this.prefix + """transactions""",
      """""",
      Seq()
    )
  )

  // @LINE:121
  private[this] lazy val controllers_HomeController_transactionsUsr71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactionsusr")))
  )
  private[this] lazy val controllers_HomeController_transactionsUsr71_invoker = createInvoker(
    HomeController_11.transactionsUsr,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "transactionsUsr",
      Nil,
      "GET",
      this.prefix + """transactionsusr""",
      """""",
      Seq()
    )
  )

  // @LINE:124
  private[this] lazy val controllers_HomeController_addPayment72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpayment")))
  )
  private[this] lazy val controllers_HomeController_addPayment72_invoker = createInvoker(
    HomeController_11.addPayment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPayment",
      Nil,
      "GET",
      this.prefix + """addpayment""",
      """ Payments""",
      Seq()
    )
  )

  // @LINE:126
  private[this] lazy val controllers_HomeController_addPaymentHandle73_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpaymenthandle")))
  )
  private[this] lazy val controllers_HomeController_addPaymentHandle73_invoker = createInvoker(
    HomeController_11.addPaymentHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPaymentHandle",
      Nil,
      "POST",
      this.prefix + """addpaymenthandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:127
  private[this] lazy val controllers_HomeController_updatePayment74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updatePayment74_invoker = createInvoker(
    HomeController_11.updatePayment(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updatePayment",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updatepayment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:128
  private[this] lazy val controllers_HomeController_updatePaymentHandle75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepaymenthandle")))
  )
  private[this] lazy val controllers_HomeController_updatePaymentHandle75_invoker = createInvoker(
    HomeController_11.updatePaymentHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updatePaymentHandle",
      Nil,
      "GET",
      this.prefix + """updatepaymenthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:129
  private[this] lazy val controllers_HomeController_deletePayment76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletepayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deletePayment76_invoker = createInvoker(
    HomeController_11.deletePayment(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deletePayment",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deletepayment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:130
  private[this] lazy val controllers_HomeController_payment77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_payment77_invoker = createInvoker(
    HomeController_11.payment(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "payment",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """payment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:131
  private[this] lazy val controllers_HomeController_paymentTrans78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paymentbyt/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_paymentTrans78_invoker = createInvoker(
    HomeController_11.paymentTrans(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "paymentTrans",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """paymentbyt/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:134
  private[this] lazy val controllers_HomeController_addDelivery79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddelivery")))
  )
  private[this] lazy val controllers_HomeController_addDelivery79_invoker = createInvoker(
    HomeController_11.addDelivery,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addDelivery",
      Nil,
      "GET",
      this.prefix + """adddelivery""",
      """ Deliverys""",
      Seq()
    )
  )

  // @LINE:136
  private[this] lazy val controllers_HomeController_addDeliveryHandle80_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddeliveryhandle")))
  )
  private[this] lazy val controllers_HomeController_addDeliveryHandle80_invoker = createInvoker(
    HomeController_11.addDeliveryHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addDeliveryHandle",
      Nil,
      "POST",
      this.prefix + """adddeliveryhandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:137
  private[this] lazy val controllers_HomeController_updateDelivery81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatedelivery/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateDelivery81_invoker = createInvoker(
    HomeController_11.updateDelivery(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateDelivery",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updatedelivery/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:138
  private[this] lazy val controllers_HomeController_updateDeliveryHandle82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatedeliveryhandle")))
  )
  private[this] lazy val controllers_HomeController_updateDeliveryHandle82_invoker = createInvoker(
    HomeController_11.updateDeliveryHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateDeliveryHandle",
      Nil,
      "GET",
      this.prefix + """updatedeliveryhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:139
  private[this] lazy val controllers_HomeController_deleteDelivery83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletedelivery/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteDelivery83_invoker = createInvoker(
    HomeController_11.deleteDelivery(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteDelivery",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deletedelivery/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:140
  private[this] lazy val controllers_HomeController_delivery84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delivery/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_delivery84_invoker = createInvoker(
    HomeController_11.delivery(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delivery",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """delivery/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:141
  private[this] lazy val controllers_HomeController_deliveryTrans85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deliverybyt/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deliveryTrans85_invoker = createInvoker(
    HomeController_11.deliveryTrans(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deliveryTrans",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deliverybyt/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:146
  private[this] lazy val controllers_Assets_versioned86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned86_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ApplicationController_index0_route(params@_) =>
      call { 
        controllers_ApplicationController_index0_invoker.call(ApplicationController_7.index)
      }
  
    // @LINE:7
    case controllers_ApplicationController_signOut1_route(params@_) =>
      call { 
        controllers_ApplicationController_signOut1_invoker.call(ApplicationController_7.signOut)
      }
  
    // @LINE:8
    case controllers_SocialAuthController_authenticate2_route(params@_) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate2_invoker.call(SocialAuthController_0.authenticate(provider))
      }
  
    // @LINE:10
    case controllers_SignUpController_view3_route(params@_) =>
      call { 
        controllers_SignUpController_view3_invoker.call(SignUpController_8.view)
      }
  
    // @LINE:11
    case controllers_SignUpController_submit4_route(params@_) =>
      call { 
        controllers_SignUpController_submit4_invoker.call(SignUpController_8.submit)
      }
  
    // @LINE:13
    case controllers_SignInController_view5_route(params@_) =>
      call { 
        controllers_SignInController_view5_invoker.call(SignInController_1.view)
      }
  
    // @LINE:14
    case controllers_SignInController_submit6_route(params@_) =>
      call { 
        controllers_SignInController_submit6_invoker.call(SignInController_1.submit)
      }
  
    // @LINE:16
    case controllers_TotpController_view7_route(params@_) =>
      call(params.fromQuery[java.util.UUID]("userId", None), params.fromQuery[String]("sharedKey", None), params.fromQuery[Boolean]("rememberMe", None)) { (userId, sharedKey, rememberMe) =>
        controllers_TotpController_view7_invoker.call(TotpController_2.view(userId, sharedKey, rememberMe))
      }
  
    // @LINE:17
    case controllers_TotpController_enableTotp8_route(params@_) =>
      call { 
        controllers_TotpController_enableTotp8_invoker.call(TotpController_2.enableTotp)
      }
  
    // @LINE:18
    case controllers_TotpController_disableTotp9_route(params@_) =>
      call { 
        controllers_TotpController_disableTotp9_invoker.call(TotpController_2.disableTotp)
      }
  
    // @LINE:19
    case controllers_TotpController_submit10_route(params@_) =>
      call { 
        controllers_TotpController_submit10_invoker.call(TotpController_2.submit)
      }
  
    // @LINE:20
    case controllers_TotpController_enableTotpSubmit11_route(params@_) =>
      call { 
        controllers_TotpController_enableTotpSubmit11_invoker.call(TotpController_2.enableTotpSubmit)
      }
  
    // @LINE:22
    case controllers_TotpRecoveryController_view12_route(params@_) =>
      call(params.fromQuery[java.util.UUID]("userID", None), params.fromQuery[String]("sharedKey", None), params.fromQuery[Boolean]("rememberMe", None)) { (userID, sharedKey, rememberMe) =>
        controllers_TotpRecoveryController_view12_invoker.call(TotpRecoveryController_6.view(userID, sharedKey, rememberMe))
      }
  
    // @LINE:23
    case controllers_TotpRecoveryController_submit13_route(params@_) =>
      call { 
        controllers_TotpRecoveryController_submit13_invoker.call(TotpRecoveryController_6.submit)
      }
  
    // @LINE:25
    case controllers_ForgotPasswordController_view14_route(params@_) =>
      call { 
        controllers_ForgotPasswordController_view14_invoker.call(ForgotPasswordController_4.view)
      }
  
    // @LINE:26
    case controllers_ForgotPasswordController_submit15_route(params@_) =>
      call { 
        controllers_ForgotPasswordController_submit15_invoker.call(ForgotPasswordController_4.submit)
      }
  
    // @LINE:27
    case controllers_ResetPasswordController_view16_route(params@_) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ResetPasswordController_view16_invoker.call(ResetPasswordController_5.view(token))
      }
  
    // @LINE:28
    case controllers_ResetPasswordController_submit17_route(params@_) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ResetPasswordController_submit17_invoker.call(ResetPasswordController_5.submit(token))
      }
  
    // @LINE:29
    case controllers_ChangePasswordController_view18_route(params@_) =>
      call { 
        controllers_ChangePasswordController_view18_invoker.call(ChangePasswordController_3.view)
      }
  
    // @LINE:30
    case controllers_ChangePasswordController_submit19_route(params@_) =>
      call { 
        controllers_ChangePasswordController_submit19_invoker.call(ChangePasswordController_3.submit)
      }
  
    // @LINE:32
    case controllers_ActivateAccountController_send20_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_ActivateAccountController_send20_invoker.call(ActivateAccountController_9.send(email))
      }
  
    // @LINE:33
    case controllers_ActivateAccountController_activate21_route(params@_) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ActivateAccountController_activate21_invoker.call(ActivateAccountController_9.activate(token))
      }
  
    // @LINE:38
    case controllers_HomeController_addCategory22_route(params@_) =>
      call { 
        controllers_HomeController_addCategory22_invoker.call(HomeController_11.addCategory)
      }
  
    // @LINE:40
    case controllers_HomeController_addCategoryHandle23_route(params@_) =>
      call { 
        controllers_HomeController_addCategoryHandle23_invoker.call(HomeController_11.addCategoryHandle)
      }
  
    // @LINE:41
    case controllers_HomeController_updateCategory24_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateCategory24_invoker.call(HomeController_11.updateCategory(id))
      }
  
    // @LINE:43
    case controllers_HomeController_updateCategoryHandle25_route(params@_) =>
      call { 
        controllers_HomeController_updateCategoryHandle25_invoker.call(HomeController_11.updateCategoryHandle)
      }
  
    // @LINE:44
    case controllers_HomeController_deleteCategory26_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteCategory26_invoker.call(HomeController_11.deleteCategory(id))
      }
  
    // @LINE:45
    case controllers_HomeController_getCategory27_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_getCategory27_invoker.call(HomeController_11.getCategory(id))
      }
  
    // @LINE:46
    case controllers_HomeController_getCategorys28_route(params@_) =>
      call { 
        controllers_HomeController_getCategorys28_invoker.call(HomeController_11.getCategorys)
      }
  
    // @LINE:49
    case controllers_HomeController_addProduct29_route(params@_) =>
      call { 
        controllers_HomeController_addProduct29_invoker.call(HomeController_11.addProduct)
      }
  
    // @LINE:51
    case controllers_HomeController_addProductHandle30_route(params@_) =>
      call { 
        controllers_HomeController_addProductHandle30_invoker.call(HomeController_11.addProductHandle)
      }
  
    // @LINE:52
    case controllers_HomeController_updateProduct31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProduct31_invoker.call(HomeController_11.updateProduct(id))
      }
  
    // @LINE:54
    case controllers_HomeController_updateProductHandle32_route(params@_) =>
      call { 
        controllers_HomeController_updateProductHandle32_invoker.call(HomeController_11.updateProductHandle)
      }
  
    // @LINE:55
    case controllers_HomeController_getProducts33_route(params@_) =>
      call { 
        controllers_HomeController_getProducts33_invoker.call(HomeController_11.getProducts)
      }
  
    // @LINE:56
    case controllers_HomeController_getProductsByCat34_route(params@_) =>
      call(params.fromPath[Int]("category", None)) { (category) =>
        controllers_HomeController_getProductsByCat34_invoker.call(HomeController_11.getProductsByCat(category))
      }
  
    // @LINE:57
    case controllers_HomeController_getProduct35_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_getProduct35_invoker.call(HomeController_11.getProduct(id))
      }
  
    // @LINE:58
    case controllers_HomeController_delete36_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_delete36_invoker.call(HomeController_11.delete(id))
      }
  
    // @LINE:61
    case controllers_HomeController_addOpinion37_route(params@_) =>
      call(params.fromPath[Long]("productid", None)) { (productid) =>
        controllers_HomeController_addOpinion37_invoker.call(HomeController_11.addOpinion(productid))
      }
  
    // @LINE:63
    case controllers_HomeController_addOpinionHandle38_route(params@_) =>
      call { 
        controllers_HomeController_addOpinionHandle38_invoker.call(HomeController_11.addOpinionHandle)
      }
  
    // @LINE:64
    case controllers_HomeController_updateOpinion39_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateOpinion39_invoker.call(HomeController_11.updateOpinion(id))
      }
  
    // @LINE:66
    case controllers_HomeController_updateOpinionHandle40_route(params@_) =>
      call { 
        controllers_HomeController_updateOpinionHandle40_invoker.call(HomeController_11.updateOpinionHandle)
      }
  
    // @LINE:67
    case controllers_HomeController_deleteOpinion41_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteOpinion41_invoker.call(HomeController_11.deleteOpinion(id))
      }
  
    // @LINE:68
    case controllers_HomeController_opinions42_route(params@_) =>
      call(params.fromPath[Long]("productid", None)) { (productid) =>
        controllers_HomeController_opinions42_invoker.call(HomeController_11.opinions(productid))
      }
  
    // @LINE:71
    case controllers_HomeController_addPromotion43_route(params@_) =>
      call(params.fromPath[Long]("productid", None)) { (productid) =>
        controllers_HomeController_addPromotion43_invoker.call(HomeController_11.addPromotion(productid))
      }
  
    // @LINE:73
    case controllers_HomeController_addPromotionHandle44_route(params@_) =>
      call { 
        controllers_HomeController_addPromotionHandle44_invoker.call(HomeController_11.addPromotionHandle)
      }
  
    // @LINE:74
    case controllers_HomeController_updatePromotion45_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updatePromotion45_invoker.call(HomeController_11.updatePromotion(id))
      }
  
    // @LINE:76
    case controllers_HomeController_updatePromotionHandle46_route(params@_) =>
      call { 
        controllers_HomeController_updatePromotionHandle46_invoker.call(HomeController_11.updatePromotionHandle)
      }
  
    // @LINE:77
    case controllers_HomeController_deletePromotion47_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deletePromotion47_invoker.call(HomeController_11.deletePromotion(id))
      }
  
    // @LINE:78
    case controllers_HomeController_promotion48_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_promotion48_invoker.call(HomeController_11.promotion(id))
      }
  
    // @LINE:79
    case controllers_HomeController_promotionpr49_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_promotionpr49_invoker.call(HomeController_11.promotionpr(id))
      }
  
    // @LINE:80
    case controllers_HomeController_promotions50_route(params@_) =>
      call { 
        controllers_HomeController_promotions50_invoker.call(HomeController_11.promotions)
      }
  
    // @LINE:83
    case controllers_HomeController_addComment51_route(params@_) =>
      call { 
        controllers_HomeController_addComment51_invoker.call(HomeController_11.addComment)
      }
  
    // @LINE:85
    case controllers_HomeController_addCommentHandle52_route(params@_) =>
      call { 
        controllers_HomeController_addCommentHandle52_invoker.call(HomeController_11.addCommentHandle)
      }
  
    // @LINE:86
    case controllers_HomeController_updateComment53_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateComment53_invoker.call(HomeController_11.updateComment(id))
      }
  
    // @LINE:87
    case controllers_HomeController_updateCommentHandle54_route(params@_) =>
      call { 
        controllers_HomeController_updateCommentHandle54_invoker.call(HomeController_11.updateCommentHandle)
      }
  
    // @LINE:88
    case controllers_HomeController_deleteComment55_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteComment55_invoker.call(HomeController_11.deleteComment(id))
      }
  
    // @LINE:89
    case controllers_HomeController_comment56_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_comment56_invoker.call(HomeController_11.comment(id))
      }
  
    // @LINE:90
    case controllers_HomeController_comments57_route(params@_) =>
      call { 
        controllers_HomeController_comments57_invoker.call(HomeController_11.comments)
      }
  
    // @LINE:103
    case controllers_HomeController_addToCart58_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_addToCart58_invoker.call(HomeController_11.addToCart(id))
      }
  
    // @LINE:105
    case controllers_HomeController_addToCartHandle59_route(params@_) =>
      call { 
        controllers_HomeController_addToCartHandle59_invoker.call(HomeController_11.addToCartHandle)
      }
  
    // @LINE:106
    case controllers_HomeController_addToCart60_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_addToCart60_invoker.call(HomeController_11.addToCart(id))
      }
  
    // @LINE:108
    case controllers_HomeController_addToCartHandle61_route(params@_) =>
      call { 
        controllers_HomeController_addToCartHandle61_invoker.call(HomeController_11.addToCartHandle)
      }
  
    // @LINE:109
    case controllers_HomeController_deleteFromCart62_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteFromCart62_invoker.call(HomeController_11.deleteFromCart(id))
      }
  
    // @LINE:110
    case controllers_HomeController_cart63_route(params@_) =>
      call { 
        controllers_HomeController_cart63_invoker.call(HomeController_11.cart)
      }
  
    // @LINE:113
    case controllers_HomeController_addTransaction64_route(params@_) =>
      call { 
        controllers_HomeController_addTransaction64_invoker.call(HomeController_11.addTransaction)
      }
  
    // @LINE:115
    case controllers_HomeController_addTransactionHandle65_route(params@_) =>
      call { 
        controllers_HomeController_addTransactionHandle65_invoker.call(HomeController_11.addTransactionHandle)
      }
  
    // @LINE:116
    case controllers_HomeController_updateTransaction66_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateTransaction66_invoker.call(HomeController_11.updateTransaction(id))
      }
  
    // @LINE:117
    case controllers_HomeController_updateTransactionHandle67_route(params@_) =>
      call { 
        controllers_HomeController_updateTransactionHandle67_invoker.call(HomeController_11.updateTransactionHandle)
      }
  
    // @LINE:118
    case controllers_HomeController_deleteTransaction68_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteTransaction68_invoker.call(HomeController_11.deleteTransaction(id))
      }
  
    // @LINE:119
    case controllers_HomeController_transaction69_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_transaction69_invoker.call(HomeController_11.transaction(id))
      }
  
    // @LINE:120
    case controllers_HomeController_transactions70_route(params@_) =>
      call { 
        controllers_HomeController_transactions70_invoker.call(HomeController_11.transactions)
      }
  
    // @LINE:121
    case controllers_HomeController_transactionsUsr71_route(params@_) =>
      call { 
        controllers_HomeController_transactionsUsr71_invoker.call(HomeController_11.transactionsUsr)
      }
  
    // @LINE:124
    case controllers_HomeController_addPayment72_route(params@_) =>
      call { 
        controllers_HomeController_addPayment72_invoker.call(HomeController_11.addPayment)
      }
  
    // @LINE:126
    case controllers_HomeController_addPaymentHandle73_route(params@_) =>
      call { 
        controllers_HomeController_addPaymentHandle73_invoker.call(HomeController_11.addPaymentHandle)
      }
  
    // @LINE:127
    case controllers_HomeController_updatePayment74_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updatePayment74_invoker.call(HomeController_11.updatePayment(id))
      }
  
    // @LINE:128
    case controllers_HomeController_updatePaymentHandle75_route(params@_) =>
      call { 
        controllers_HomeController_updatePaymentHandle75_invoker.call(HomeController_11.updatePaymentHandle)
      }
  
    // @LINE:129
    case controllers_HomeController_deletePayment76_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deletePayment76_invoker.call(HomeController_11.deletePayment(id))
      }
  
    // @LINE:130
    case controllers_HomeController_payment77_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_payment77_invoker.call(HomeController_11.payment(id))
      }
  
    // @LINE:131
    case controllers_HomeController_paymentTrans78_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_paymentTrans78_invoker.call(HomeController_11.paymentTrans(id))
      }
  
    // @LINE:134
    case controllers_HomeController_addDelivery79_route(params@_) =>
      call { 
        controllers_HomeController_addDelivery79_invoker.call(HomeController_11.addDelivery)
      }
  
    // @LINE:136
    case controllers_HomeController_addDeliveryHandle80_route(params@_) =>
      call { 
        controllers_HomeController_addDeliveryHandle80_invoker.call(HomeController_11.addDeliveryHandle)
      }
  
    // @LINE:137
    case controllers_HomeController_updateDelivery81_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateDelivery81_invoker.call(HomeController_11.updateDelivery(id))
      }
  
    // @LINE:138
    case controllers_HomeController_updateDeliveryHandle82_route(params@_) =>
      call { 
        controllers_HomeController_updateDeliveryHandle82_invoker.call(HomeController_11.updateDeliveryHandle)
      }
  
    // @LINE:139
    case controllers_HomeController_deleteDelivery83_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteDelivery83_invoker.call(HomeController_11.deleteDelivery(id))
      }
  
    // @LINE:140
    case controllers_HomeController_delivery84_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_delivery84_invoker.call(HomeController_11.delivery(id))
      }
  
    // @LINE:141
    case controllers_HomeController_deliveryTrans85_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deliveryTrans85_invoker.call(HomeController_11.deliveryTrans(id))
      }
  
    // @LINE:146
    case controllers_Assets_versioned86_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned86_invoker.call(Assets_10.versioned(file))
      }
  }
}
