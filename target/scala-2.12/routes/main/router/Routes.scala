// @GENERATOR:play-routes-compiler
// @SOURCE:/home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/conf/routes
// @DATE:Sun Jun 07 17:55:37 CEST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_4: controllers.HomeController,
  // @LINE:13
  SignUpController_0: controllers.SignUpController,
  // @LINE:124
  CountController_1: controllers.CountController,
  // @LINE:126
  AsyncController_3: controllers.AsyncController,
  // @LINE:129
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_4: controllers.HomeController,
    // @LINE:13
    SignUpController_0: controllers.SignUpController,
    // @LINE:124
    CountController_1: controllers.CountController,
    // @LINE:126
    AsyncController_3: controllers.AsyncController,
    // @LINE:129
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_4, SignUpController_0, CountController_1, AsyncController_3, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, SignUpController_0, CountController_1, AsyncController_3, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.SignUpController.submit"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.HomeController.addUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduserhandle""", """controllers.HomeController.addUserHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateuser/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateUser(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateuserhandle""", """controllers.HomeController.updateUserHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteuser/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteUser(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.HomeController.user(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.HomeController.users"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtocart/""" + "$" + """id<[^/]+>""", """controllers.HomeController.addToCart(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtocarthandle""", """controllers.HomeController.addToCartHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecart/""" + "$" + """id<[^/]+>""", """controllers.HomeController.addToCart(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecarthandle""", """controllers.HomeController.addToCartHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletefromcart/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteFromCart(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/""" + "$" + """userId<[^/]+>""", """controllers.HomeController.cart(userId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtransaction""", """controllers.HomeController.addTransaction"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtransactionhandle""", """controllers.HomeController.addTransactionHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatetransaction/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateTransaction(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatetransactionhandle""", """controllers.HomeController.updateTransactionHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletetransaction/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteTransaction(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transaction/""" + "$" + """id<[^/]+>""", """controllers.HomeController.transaction(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactions""", """controllers.HomeController.transactions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactionsusr/""" + "$" + """id<[^/]+>""", """controllers.HomeController.transactionsUsr(id:Int)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_SignUpController_submit1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_SignUpController_submit1_invoker = createInvoker(
    SignUpController_0.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "submit",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_addCategory2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategory")))
  )
  private[this] lazy val controllers_HomeController_addCategory2_invoker = createInvoker(
    HomeController_4.addCategory,
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

  // @LINE:19
  private[this] lazy val controllers_HomeController_addCategoryHandle3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategoryhandle")))
  )
  private[this] lazy val controllers_HomeController_addCategoryHandle3_invoker = createInvoker(
    HomeController_4.addCategoryHandle,
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

  // @LINE:20
  private[this] lazy val controllers_HomeController_updateCategory4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateCategory4_invoker = createInvoker(
    HomeController_4.updateCategory(fakeValue[Int]),
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

  // @LINE:22
  private[this] lazy val controllers_HomeController_updateCategoryHandle5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecategoryhandle")))
  )
  private[this] lazy val controllers_HomeController_updateCategoryHandle5_invoker = createInvoker(
    HomeController_4.updateCategoryHandle,
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

  // @LINE:23
  private[this] lazy val controllers_HomeController_deleteCategory6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletecategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteCategory6_invoker = createInvoker(
    HomeController_4.deleteCategory(fakeValue[Int]),
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

  // @LINE:24
  private[this] lazy val controllers_HomeController_getCategory7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getCategory7_invoker = createInvoker(
    HomeController_4.getCategory(fakeValue[Int]),
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

  // @LINE:25
  private[this] lazy val controllers_HomeController_getCategorys8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_HomeController_getCategorys8_invoker = createInvoker(
    HomeController_4.getCategorys,
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

  // @LINE:28
  private[this] lazy val controllers_HomeController_addProduct9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_HomeController_addProduct9_invoker = createInvoker(
    HomeController_4.addProduct,
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

  // @LINE:30
  private[this] lazy val controllers_HomeController_addProductHandle10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproducthandle")))
  )
  private[this] lazy val controllers_HomeController_addProductHandle10_invoker = createInvoker(
    HomeController_4.addProductHandle,
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

  // @LINE:31
  private[this] lazy val controllers_HomeController_updateProduct11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProduct11_invoker = createInvoker(
    HomeController_4.updateProduct(fakeValue[Long]),
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

  // @LINE:33
  private[this] lazy val controllers_HomeController_updateProductHandle12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproducthandle")))
  )
  private[this] lazy val controllers_HomeController_updateProductHandle12_invoker = createInvoker(
    HomeController_4.updateProductHandle,
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

  // @LINE:34
  private[this] lazy val controllers_HomeController_getProducts13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_getProducts13_invoker = createInvoker(
    HomeController_4.getProducts,
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

  // @LINE:35
  private[this] lazy val controllers_HomeController_getProductsByCat14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("category", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getProductsByCat14_invoker = createInvoker(
    HomeController_4.getProductsByCat(fakeValue[Int]),
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

  // @LINE:36
  private[this] lazy val controllers_HomeController_getProduct15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getProduct15_invoker = createInvoker(
    HomeController_4.getProduct(fakeValue[Long]),
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

  // @LINE:37
  private[this] lazy val controllers_HomeController_delete16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_delete16_invoker = createInvoker(
    HomeController_4.delete(fakeValue[Long]),
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

  // @LINE:40
  private[this] lazy val controllers_HomeController_addOpinion17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addopinion/"), DynamicPart("productid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addOpinion17_invoker = createInvoker(
    HomeController_4.addOpinion(fakeValue[Long]),
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

  // @LINE:42
  private[this] lazy val controllers_HomeController_addOpinionHandle18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addopinionhandle")))
  )
  private[this] lazy val controllers_HomeController_addOpinionHandle18_invoker = createInvoker(
    HomeController_4.addOpinionHandle,
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

  // @LINE:43
  private[this] lazy val controllers_HomeController_updateOpinion19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateopinion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateOpinion19_invoker = createInvoker(
    HomeController_4.updateOpinion(fakeValue[Int]),
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

  // @LINE:45
  private[this] lazy val controllers_HomeController_updateOpinionHandle20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateopinionhandle")))
  )
  private[this] lazy val controllers_HomeController_updateOpinionHandle20_invoker = createInvoker(
    HomeController_4.updateOpinionHandle,
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

  // @LINE:46
  private[this] lazy val controllers_HomeController_deleteOpinion21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteopinion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteOpinion21_invoker = createInvoker(
    HomeController_4.deleteOpinion(fakeValue[Int]),
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

  // @LINE:47
  private[this] lazy val controllers_HomeController_opinions22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions/"), DynamicPart("productid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_opinions22_invoker = createInvoker(
    HomeController_4.opinions(fakeValue[Long]),
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

  // @LINE:50
  private[this] lazy val controllers_HomeController_addPromotion23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpromotion/"), DynamicPart("productid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addPromotion23_invoker = createInvoker(
    HomeController_4.addPromotion(fakeValue[Long]),
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

  // @LINE:52
  private[this] lazy val controllers_HomeController_addPromotionHandle24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpromotionhandle")))
  )
  private[this] lazy val controllers_HomeController_addPromotionHandle24_invoker = createInvoker(
    HomeController_4.addPromotionHandle,
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

  // @LINE:53
  private[this] lazy val controllers_HomeController_updatePromotion25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepromotion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updatePromotion25_invoker = createInvoker(
    HomeController_4.updatePromotion(fakeValue[Int]),
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

  // @LINE:55
  private[this] lazy val controllers_HomeController_updatePromotionHandle26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepromotionhandle")))
  )
  private[this] lazy val controllers_HomeController_updatePromotionHandle26_invoker = createInvoker(
    HomeController_4.updatePromotionHandle,
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

  // @LINE:56
  private[this] lazy val controllers_HomeController_deletePromotion27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletepromotion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deletePromotion27_invoker = createInvoker(
    HomeController_4.deletePromotion(fakeValue[Int]),
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

  // @LINE:57
  private[this] lazy val controllers_HomeController_promotion28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("promotion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_promotion28_invoker = createInvoker(
    HomeController_4.promotion(fakeValue[Int]),
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

  // @LINE:58
  private[this] lazy val controllers_HomeController_promotionpr29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("promotionpr/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_promotionpr29_invoker = createInvoker(
    HomeController_4.promotionpr(fakeValue[Long]),
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

  // @LINE:59
  private[this] lazy val controllers_HomeController_promotions30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("promotions")))
  )
  private[this] lazy val controllers_HomeController_promotions30_invoker = createInvoker(
    HomeController_4.promotions,
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

  // @LINE:62
  private[this] lazy val controllers_HomeController_addComment31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcomment")))
  )
  private[this] lazy val controllers_HomeController_addComment31_invoker = createInvoker(
    HomeController_4.addComment,
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

  // @LINE:64
  private[this] lazy val controllers_HomeController_addCommentHandle32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcommenthandle")))
  )
  private[this] lazy val controllers_HomeController_addCommentHandle32_invoker = createInvoker(
    HomeController_4.addCommentHandle,
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

  // @LINE:65
  private[this] lazy val controllers_HomeController_updateComment33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecomment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateComment33_invoker = createInvoker(
    HomeController_4.updateComment(fakeValue[Int]),
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

  // @LINE:66
  private[this] lazy val controllers_HomeController_updateCommentHandle34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecommenthandle")))
  )
  private[this] lazy val controllers_HomeController_updateCommentHandle34_invoker = createInvoker(
    HomeController_4.updateCommentHandle,
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

  // @LINE:67
  private[this] lazy val controllers_HomeController_deleteComment35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletecomment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteComment35_invoker = createInvoker(
    HomeController_4.deleteComment(fakeValue[Int]),
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

  // @LINE:68
  private[this] lazy val controllers_HomeController_comment36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_comment36_invoker = createInvoker(
    HomeController_4.comment(fakeValue[Int]),
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

  // @LINE:69
  private[this] lazy val controllers_HomeController_comments37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comments")))
  )
  private[this] lazy val controllers_HomeController_comments37_invoker = createInvoker(
    HomeController_4.comments,
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

  // @LINE:72
  private[this] lazy val controllers_HomeController_addUser38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_HomeController_addUser38_invoker = createInvoker(
    HomeController_4.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUser",
      Nil,
      "GET",
      this.prefix + """adduser""",
      """ Users""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_HomeController_addUserHandle39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduserhandle")))
  )
  private[this] lazy val controllers_HomeController_addUserHandle39_invoker = createInvoker(
    HomeController_4.addUserHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUserHandle",
      Nil,
      "POST",
      this.prefix + """adduserhandle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:75
  private[this] lazy val controllers_HomeController_updateUser40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateUser40_invoker = createInvoker(
    HomeController_4.updateUser(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateUser",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """updateuser/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_HomeController_updateUserHandle41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuserhandle")))
  )
  private[this] lazy val controllers_HomeController_updateUserHandle41_invoker = createInvoker(
    HomeController_4.updateUserHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateUserHandle",
      Nil,
      "GET",
      this.prefix + """updateuserhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_HomeController_deleteUser42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteUser42_invoker = createInvoker(
    HomeController_4.deleteUser(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteUser",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """deleteuser/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_HomeController_user43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_user43_invoker = createInvoker(
    HomeController_4.user(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "user",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_HomeController_users44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_HomeController_users44_invoker = createInvoker(
    HomeController_4.users,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "users",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val controllers_HomeController_addToCart45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtocart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addToCart45_invoker = createInvoker(
    HomeController_4.addToCart(fakeValue[Int]),
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

  // @LINE:84
  private[this] lazy val controllers_HomeController_addToCartHandle46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtocarthandle")))
  )
  private[this] lazy val controllers_HomeController_addToCartHandle46_invoker = createInvoker(
    HomeController_4.addToCartHandle,
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

  // @LINE:85
  private[this] lazy val controllers_HomeController_addToCart47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addToCart47_invoker = createInvoker(
    HomeController_4.addToCart(fakeValue[Int]),
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

  // @LINE:87
  private[this] lazy val controllers_HomeController_addToCartHandle48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecarthandle")))
  )
  private[this] lazy val controllers_HomeController_addToCartHandle48_invoker = createInvoker(
    HomeController_4.addToCartHandle,
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

  // @LINE:88
  private[this] lazy val controllers_HomeController_deleteFromCart49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletefromcart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteFromCart49_invoker = createInvoker(
    HomeController_4.deleteFromCart(fakeValue[Int]),
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

  // @LINE:89
  private[this] lazy val controllers_HomeController_cart50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_cart50_invoker = createInvoker(
    HomeController_4.cart(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cart",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """cart/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_HomeController_addTransaction51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtransaction")))
  )
  private[this] lazy val controllers_HomeController_addTransaction51_invoker = createInvoker(
    HomeController_4.addTransaction,
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

  // @LINE:94
  private[this] lazy val controllers_HomeController_addTransactionHandle52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtransactionhandle")))
  )
  private[this] lazy val controllers_HomeController_addTransactionHandle52_invoker = createInvoker(
    HomeController_4.addTransactionHandle,
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

  // @LINE:95
  private[this] lazy val controllers_HomeController_updateTransaction53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatetransaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateTransaction53_invoker = createInvoker(
    HomeController_4.updateTransaction(fakeValue[Int]),
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

  // @LINE:96
  private[this] lazy val controllers_HomeController_updateTransactionHandle54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatetransactionhandle")))
  )
  private[this] lazy val controllers_HomeController_updateTransactionHandle54_invoker = createInvoker(
    HomeController_4.updateTransactionHandle,
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

  // @LINE:97
  private[this] lazy val controllers_HomeController_deleteTransaction55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletetransaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteTransaction55_invoker = createInvoker(
    HomeController_4.deleteTransaction(fakeValue[Int]),
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

  // @LINE:98
  private[this] lazy val controllers_HomeController_transaction56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_transaction56_invoker = createInvoker(
    HomeController_4.transaction(fakeValue[Int]),
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

  // @LINE:99
  private[this] lazy val controllers_HomeController_transactions57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactions")))
  )
  private[this] lazy val controllers_HomeController_transactions57_invoker = createInvoker(
    HomeController_4.transactions,
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

  // @LINE:100
  private[this] lazy val controllers_HomeController_transactionsUsr58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactionsusr/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_transactionsUsr58_invoker = createInvoker(
    HomeController_4.transactionsUsr(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "transactionsUsr",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """transactionsusr/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_HomeController_addPayment59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpayment")))
  )
  private[this] lazy val controllers_HomeController_addPayment59_invoker = createInvoker(
    HomeController_4.addPayment,
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

  // @LINE:105
  private[this] lazy val controllers_HomeController_addPaymentHandle60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpaymenthandle")))
  )
  private[this] lazy val controllers_HomeController_addPaymentHandle60_invoker = createInvoker(
    HomeController_4.addPaymentHandle,
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

  // @LINE:106
  private[this] lazy val controllers_HomeController_updatePayment61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updatePayment61_invoker = createInvoker(
    HomeController_4.updatePayment(fakeValue[Int]),
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

  // @LINE:107
  private[this] lazy val controllers_HomeController_updatePaymentHandle62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepaymenthandle")))
  )
  private[this] lazy val controllers_HomeController_updatePaymentHandle62_invoker = createInvoker(
    HomeController_4.updatePaymentHandle,
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

  // @LINE:108
  private[this] lazy val controllers_HomeController_deletePayment63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletepayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deletePayment63_invoker = createInvoker(
    HomeController_4.deletePayment(fakeValue[Int]),
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

  // @LINE:109
  private[this] lazy val controllers_HomeController_payment64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_payment64_invoker = createInvoker(
    HomeController_4.payment(fakeValue[Int]),
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

  // @LINE:110
  private[this] lazy val controllers_HomeController_paymentTrans65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paymentbyt/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_paymentTrans65_invoker = createInvoker(
    HomeController_4.paymentTrans(fakeValue[Int]),
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

  // @LINE:113
  private[this] lazy val controllers_HomeController_addDelivery66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddelivery")))
  )
  private[this] lazy val controllers_HomeController_addDelivery66_invoker = createInvoker(
    HomeController_4.addDelivery,
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

  // @LINE:115
  private[this] lazy val controllers_HomeController_addDeliveryHandle67_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddeliveryhandle")))
  )
  private[this] lazy val controllers_HomeController_addDeliveryHandle67_invoker = createInvoker(
    HomeController_4.addDeliveryHandle,
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

  // @LINE:116
  private[this] lazy val controllers_HomeController_updateDelivery68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatedelivery/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateDelivery68_invoker = createInvoker(
    HomeController_4.updateDelivery(fakeValue[Int]),
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

  // @LINE:117
  private[this] lazy val controllers_HomeController_updateDeliveryHandle69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatedeliveryhandle")))
  )
  private[this] lazy val controllers_HomeController_updateDeliveryHandle69_invoker = createInvoker(
    HomeController_4.updateDeliveryHandle,
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

  // @LINE:118
  private[this] lazy val controllers_HomeController_deleteDelivery70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletedelivery/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteDelivery70_invoker = createInvoker(
    HomeController_4.deleteDelivery(fakeValue[Int]),
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

  // @LINE:119
  private[this] lazy val controllers_HomeController_delivery71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delivery/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_delivery71_invoker = createInvoker(
    HomeController_4.delivery(fakeValue[Int]),
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

  // @LINE:120
  private[this] lazy val controllers_HomeController_deliveryTrans72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deliverybyt/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deliveryTrans72_invoker = createInvoker(
    HomeController_4.deliveryTrans(fakeValue[Int]),
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

  // @LINE:124
  private[this] lazy val controllers_CountController_count73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count73_invoker = createInvoker(
    CountController_1.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:126
  private[this] lazy val controllers_AsyncController_message74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message74_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:129
  private[this] lazy val controllers_Assets_versioned75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned75_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_4.index)
      }
  
    // @LINE:13
    case controllers_SignUpController_submit1_route(params@_) =>
      call { 
        controllers_SignUpController_submit1_invoker.call(SignUpController_0.submit)
      }
  
    // @LINE:17
    case controllers_HomeController_addCategory2_route(params@_) =>
      call { 
        controllers_HomeController_addCategory2_invoker.call(HomeController_4.addCategory)
      }
  
    // @LINE:19
    case controllers_HomeController_addCategoryHandle3_route(params@_) =>
      call { 
        controllers_HomeController_addCategoryHandle3_invoker.call(HomeController_4.addCategoryHandle)
      }
  
    // @LINE:20
    case controllers_HomeController_updateCategory4_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateCategory4_invoker.call(HomeController_4.updateCategory(id))
      }
  
    // @LINE:22
    case controllers_HomeController_updateCategoryHandle5_route(params@_) =>
      call { 
        controllers_HomeController_updateCategoryHandle5_invoker.call(HomeController_4.updateCategoryHandle)
      }
  
    // @LINE:23
    case controllers_HomeController_deleteCategory6_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteCategory6_invoker.call(HomeController_4.deleteCategory(id))
      }
  
    // @LINE:24
    case controllers_HomeController_getCategory7_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_getCategory7_invoker.call(HomeController_4.getCategory(id))
      }
  
    // @LINE:25
    case controllers_HomeController_getCategorys8_route(params@_) =>
      call { 
        controllers_HomeController_getCategorys8_invoker.call(HomeController_4.getCategorys)
      }
  
    // @LINE:28
    case controllers_HomeController_addProduct9_route(params@_) =>
      call { 
        controllers_HomeController_addProduct9_invoker.call(HomeController_4.addProduct)
      }
  
    // @LINE:30
    case controllers_HomeController_addProductHandle10_route(params@_) =>
      call { 
        controllers_HomeController_addProductHandle10_invoker.call(HomeController_4.addProductHandle)
      }
  
    // @LINE:31
    case controllers_HomeController_updateProduct11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProduct11_invoker.call(HomeController_4.updateProduct(id))
      }
  
    // @LINE:33
    case controllers_HomeController_updateProductHandle12_route(params@_) =>
      call { 
        controllers_HomeController_updateProductHandle12_invoker.call(HomeController_4.updateProductHandle)
      }
  
    // @LINE:34
    case controllers_HomeController_getProducts13_route(params@_) =>
      call { 
        controllers_HomeController_getProducts13_invoker.call(HomeController_4.getProducts)
      }
  
    // @LINE:35
    case controllers_HomeController_getProductsByCat14_route(params@_) =>
      call(params.fromPath[Int]("category", None)) { (category) =>
        controllers_HomeController_getProductsByCat14_invoker.call(HomeController_4.getProductsByCat(category))
      }
  
    // @LINE:36
    case controllers_HomeController_getProduct15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_getProduct15_invoker.call(HomeController_4.getProduct(id))
      }
  
    // @LINE:37
    case controllers_HomeController_delete16_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_delete16_invoker.call(HomeController_4.delete(id))
      }
  
    // @LINE:40
    case controllers_HomeController_addOpinion17_route(params@_) =>
      call(params.fromPath[Long]("productid", None)) { (productid) =>
        controllers_HomeController_addOpinion17_invoker.call(HomeController_4.addOpinion(productid))
      }
  
    // @LINE:42
    case controllers_HomeController_addOpinionHandle18_route(params@_) =>
      call { 
        controllers_HomeController_addOpinionHandle18_invoker.call(HomeController_4.addOpinionHandle)
      }
  
    // @LINE:43
    case controllers_HomeController_updateOpinion19_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateOpinion19_invoker.call(HomeController_4.updateOpinion(id))
      }
  
    // @LINE:45
    case controllers_HomeController_updateOpinionHandle20_route(params@_) =>
      call { 
        controllers_HomeController_updateOpinionHandle20_invoker.call(HomeController_4.updateOpinionHandle)
      }
  
    // @LINE:46
    case controllers_HomeController_deleteOpinion21_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteOpinion21_invoker.call(HomeController_4.deleteOpinion(id))
      }
  
    // @LINE:47
    case controllers_HomeController_opinions22_route(params@_) =>
      call(params.fromPath[Long]("productid", None)) { (productid) =>
        controllers_HomeController_opinions22_invoker.call(HomeController_4.opinions(productid))
      }
  
    // @LINE:50
    case controllers_HomeController_addPromotion23_route(params@_) =>
      call(params.fromPath[Long]("productid", None)) { (productid) =>
        controllers_HomeController_addPromotion23_invoker.call(HomeController_4.addPromotion(productid))
      }
  
    // @LINE:52
    case controllers_HomeController_addPromotionHandle24_route(params@_) =>
      call { 
        controllers_HomeController_addPromotionHandle24_invoker.call(HomeController_4.addPromotionHandle)
      }
  
    // @LINE:53
    case controllers_HomeController_updatePromotion25_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updatePromotion25_invoker.call(HomeController_4.updatePromotion(id))
      }
  
    // @LINE:55
    case controllers_HomeController_updatePromotionHandle26_route(params@_) =>
      call { 
        controllers_HomeController_updatePromotionHandle26_invoker.call(HomeController_4.updatePromotionHandle)
      }
  
    // @LINE:56
    case controllers_HomeController_deletePromotion27_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deletePromotion27_invoker.call(HomeController_4.deletePromotion(id))
      }
  
    // @LINE:57
    case controllers_HomeController_promotion28_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_promotion28_invoker.call(HomeController_4.promotion(id))
      }
  
    // @LINE:58
    case controllers_HomeController_promotionpr29_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_promotionpr29_invoker.call(HomeController_4.promotionpr(id))
      }
  
    // @LINE:59
    case controllers_HomeController_promotions30_route(params@_) =>
      call { 
        controllers_HomeController_promotions30_invoker.call(HomeController_4.promotions)
      }
  
    // @LINE:62
    case controllers_HomeController_addComment31_route(params@_) =>
      call { 
        controllers_HomeController_addComment31_invoker.call(HomeController_4.addComment)
      }
  
    // @LINE:64
    case controllers_HomeController_addCommentHandle32_route(params@_) =>
      call { 
        controllers_HomeController_addCommentHandle32_invoker.call(HomeController_4.addCommentHandle)
      }
  
    // @LINE:65
    case controllers_HomeController_updateComment33_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateComment33_invoker.call(HomeController_4.updateComment(id))
      }
  
    // @LINE:66
    case controllers_HomeController_updateCommentHandle34_route(params@_) =>
      call { 
        controllers_HomeController_updateCommentHandle34_invoker.call(HomeController_4.updateCommentHandle)
      }
  
    // @LINE:67
    case controllers_HomeController_deleteComment35_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteComment35_invoker.call(HomeController_4.deleteComment(id))
      }
  
    // @LINE:68
    case controllers_HomeController_comment36_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_comment36_invoker.call(HomeController_4.comment(id))
      }
  
    // @LINE:69
    case controllers_HomeController_comments37_route(params@_) =>
      call { 
        controllers_HomeController_comments37_invoker.call(HomeController_4.comments)
      }
  
    // @LINE:72
    case controllers_HomeController_addUser38_route(params@_) =>
      call { 
        controllers_HomeController_addUser38_invoker.call(HomeController_4.addUser)
      }
  
    // @LINE:74
    case controllers_HomeController_addUserHandle39_route(params@_) =>
      call { 
        controllers_HomeController_addUserHandle39_invoker.call(HomeController_4.addUserHandle)
      }
  
    // @LINE:75
    case controllers_HomeController_updateUser40_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateUser40_invoker.call(HomeController_4.updateUser(id))
      }
  
    // @LINE:76
    case controllers_HomeController_updateUserHandle41_route(params@_) =>
      call { 
        controllers_HomeController_updateUserHandle41_invoker.call(HomeController_4.updateUserHandle)
      }
  
    // @LINE:77
    case controllers_HomeController_deleteUser42_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteUser42_invoker.call(HomeController_4.deleteUser(id))
      }
  
    // @LINE:78
    case controllers_HomeController_user43_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_user43_invoker.call(HomeController_4.user(id))
      }
  
    // @LINE:79
    case controllers_HomeController_users44_route(params@_) =>
      call { 
        controllers_HomeController_users44_invoker.call(HomeController_4.users)
      }
  
    // @LINE:82
    case controllers_HomeController_addToCart45_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_addToCart45_invoker.call(HomeController_4.addToCart(id))
      }
  
    // @LINE:84
    case controllers_HomeController_addToCartHandle46_route(params@_) =>
      call { 
        controllers_HomeController_addToCartHandle46_invoker.call(HomeController_4.addToCartHandle)
      }
  
    // @LINE:85
    case controllers_HomeController_addToCart47_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_addToCart47_invoker.call(HomeController_4.addToCart(id))
      }
  
    // @LINE:87
    case controllers_HomeController_addToCartHandle48_route(params@_) =>
      call { 
        controllers_HomeController_addToCartHandle48_invoker.call(HomeController_4.addToCartHandle)
      }
  
    // @LINE:88
    case controllers_HomeController_deleteFromCart49_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteFromCart49_invoker.call(HomeController_4.deleteFromCart(id))
      }
  
    // @LINE:89
    case controllers_HomeController_cart50_route(params@_) =>
      call(params.fromPath[Int]("userId", None)) { (userId) =>
        controllers_HomeController_cart50_invoker.call(HomeController_4.cart(userId))
      }
  
    // @LINE:92
    case controllers_HomeController_addTransaction51_route(params@_) =>
      call { 
        controllers_HomeController_addTransaction51_invoker.call(HomeController_4.addTransaction)
      }
  
    // @LINE:94
    case controllers_HomeController_addTransactionHandle52_route(params@_) =>
      call { 
        controllers_HomeController_addTransactionHandle52_invoker.call(HomeController_4.addTransactionHandle)
      }
  
    // @LINE:95
    case controllers_HomeController_updateTransaction53_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateTransaction53_invoker.call(HomeController_4.updateTransaction(id))
      }
  
    // @LINE:96
    case controllers_HomeController_updateTransactionHandle54_route(params@_) =>
      call { 
        controllers_HomeController_updateTransactionHandle54_invoker.call(HomeController_4.updateTransactionHandle)
      }
  
    // @LINE:97
    case controllers_HomeController_deleteTransaction55_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteTransaction55_invoker.call(HomeController_4.deleteTransaction(id))
      }
  
    // @LINE:98
    case controllers_HomeController_transaction56_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_transaction56_invoker.call(HomeController_4.transaction(id))
      }
  
    // @LINE:99
    case controllers_HomeController_transactions57_route(params@_) =>
      call { 
        controllers_HomeController_transactions57_invoker.call(HomeController_4.transactions)
      }
  
    // @LINE:100
    case controllers_HomeController_transactionsUsr58_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_transactionsUsr58_invoker.call(HomeController_4.transactionsUsr(id))
      }
  
    // @LINE:103
    case controllers_HomeController_addPayment59_route(params@_) =>
      call { 
        controllers_HomeController_addPayment59_invoker.call(HomeController_4.addPayment)
      }
  
    // @LINE:105
    case controllers_HomeController_addPaymentHandle60_route(params@_) =>
      call { 
        controllers_HomeController_addPaymentHandle60_invoker.call(HomeController_4.addPaymentHandle)
      }
  
    // @LINE:106
    case controllers_HomeController_updatePayment61_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updatePayment61_invoker.call(HomeController_4.updatePayment(id))
      }
  
    // @LINE:107
    case controllers_HomeController_updatePaymentHandle62_route(params@_) =>
      call { 
        controllers_HomeController_updatePaymentHandle62_invoker.call(HomeController_4.updatePaymentHandle)
      }
  
    // @LINE:108
    case controllers_HomeController_deletePayment63_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deletePayment63_invoker.call(HomeController_4.deletePayment(id))
      }
  
    // @LINE:109
    case controllers_HomeController_payment64_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_payment64_invoker.call(HomeController_4.payment(id))
      }
  
    // @LINE:110
    case controllers_HomeController_paymentTrans65_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_paymentTrans65_invoker.call(HomeController_4.paymentTrans(id))
      }
  
    // @LINE:113
    case controllers_HomeController_addDelivery66_route(params@_) =>
      call { 
        controllers_HomeController_addDelivery66_invoker.call(HomeController_4.addDelivery)
      }
  
    // @LINE:115
    case controllers_HomeController_addDeliveryHandle67_route(params@_) =>
      call { 
        controllers_HomeController_addDeliveryHandle67_invoker.call(HomeController_4.addDeliveryHandle)
      }
  
    // @LINE:116
    case controllers_HomeController_updateDelivery68_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateDelivery68_invoker.call(HomeController_4.updateDelivery(id))
      }
  
    // @LINE:117
    case controllers_HomeController_updateDeliveryHandle69_route(params@_) =>
      call { 
        controllers_HomeController_updateDeliveryHandle69_invoker.call(HomeController_4.updateDeliveryHandle)
      }
  
    // @LINE:118
    case controllers_HomeController_deleteDelivery70_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteDelivery70_invoker.call(HomeController_4.deleteDelivery(id))
      }
  
    // @LINE:119
    case controllers_HomeController_delivery71_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_delivery71_invoker.call(HomeController_4.delivery(id))
      }
  
    // @LINE:120
    case controllers_HomeController_deliveryTrans72_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deliveryTrans72_invoker.call(HomeController_4.deliveryTrans(id))
      }
  
    // @LINE:124
    case controllers_CountController_count73_route(params@_) =>
      call { 
        controllers_CountController_count73_invoker.call(CountController_1.count)
      }
  
    // @LINE:126
    case controllers_AsyncController_message74_route(params@_) =>
      call { 
        controllers_AsyncController_message74_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:129
    case controllers_Assets_versioned75_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned75_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
