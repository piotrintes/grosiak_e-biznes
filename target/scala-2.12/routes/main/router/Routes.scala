// @GENERATOR:play-routes-compiler
// @SOURCE:/home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/conf/routes
// @DATE:Thu May 14 17:00:07 CEST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_3: controllers.HomeController,
  // @LINE:112
  CountController_2: controllers.CountController,
  // @LINE:114
  AsyncController_0: controllers.AsyncController,
  // @LINE:117
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_3: controllers.HomeController,
    // @LINE:112
    CountController_2: controllers.CountController,
    // @LINE:114
    AsyncController_0: controllers.AsyncController,
    // @LINE:117
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_3, CountController_2, AsyncController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, CountController_2, AsyncController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.HomeController.cart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtransaction""", """controllers.HomeController.addTransaction"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtransactionhandle""", """controllers.HomeController.addTransactionHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatetransaction/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateTransaction(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatetransactionhandle""", """controllers.HomeController.updateTransactionHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletetransaction/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteTransaction(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transaction/""" + "$" + """id<[^/]+>""", """controllers.HomeController.transaction(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactions""", """controllers.HomeController.transactions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addpayment""", """controllers.HomeController.addPayment"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addpaymenthandle""", """controllers.HomeController.addPaymentHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatepayment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updatePayment(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatepaymenthandle""", """controllers.HomeController.updatePaymentHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletepayment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deletePayment(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.payment(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adddelivery""", """controllers.HomeController.addDelivery"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adddeliveryhandle""", """controllers.HomeController.addDeliveryHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatedelivery/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateDelivery(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatedeliveryhandle""", """controllers.HomeController.updateDeliveryHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletedelivery/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteDelivery(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delivery/""" + "$" + """id<[^/]+>""", """controllers.HomeController.delivery(id:Int)"""),
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
    HomeController_3.index,
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

  // @LINE:10
  private[this] lazy val controllers_HomeController_addCategory1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategory")))
  )
  private[this] lazy val controllers_HomeController_addCategory1_invoker = createInvoker(
    HomeController_3.addCategory,
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

  // @LINE:12
  private[this] lazy val controllers_HomeController_addCategoryHandle2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategoryhandle")))
  )
  private[this] lazy val controllers_HomeController_addCategoryHandle2_invoker = createInvoker(
    HomeController_3.addCategoryHandle,
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

  // @LINE:13
  private[this] lazy val controllers_HomeController_updateCategory3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateCategory3_invoker = createInvoker(
    HomeController_3.updateCategory(fakeValue[Int]),
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

  // @LINE:15
  private[this] lazy val controllers_HomeController_updateCategoryHandle4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecategoryhandle")))
  )
  private[this] lazy val controllers_HomeController_updateCategoryHandle4_invoker = createInvoker(
    HomeController_3.updateCategoryHandle,
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

  // @LINE:16
  private[this] lazy val controllers_HomeController_deleteCategory5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletecategory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteCategory5_invoker = createInvoker(
    HomeController_3.deleteCategory(fakeValue[Int]),
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

  // @LINE:17
  private[this] lazy val controllers_HomeController_getCategory6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getCategory6_invoker = createInvoker(
    HomeController_3.getCategory(fakeValue[Int]),
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

  // @LINE:18
  private[this] lazy val controllers_HomeController_getCategorys7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_HomeController_getCategorys7_invoker = createInvoker(
    HomeController_3.getCategorys,
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

  // @LINE:21
  private[this] lazy val controllers_HomeController_addProduct8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_HomeController_addProduct8_invoker = createInvoker(
    HomeController_3.addProduct,
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

  // @LINE:23
  private[this] lazy val controllers_HomeController_addProductHandle9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproducthandle")))
  )
  private[this] lazy val controllers_HomeController_addProductHandle9_invoker = createInvoker(
    HomeController_3.addProductHandle,
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

  // @LINE:24
  private[this] lazy val controllers_HomeController_updateProduct10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProduct10_invoker = createInvoker(
    HomeController_3.updateProduct(fakeValue[Long]),
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

  // @LINE:26
  private[this] lazy val controllers_HomeController_updateProductHandle11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproducthandle")))
  )
  private[this] lazy val controllers_HomeController_updateProductHandle11_invoker = createInvoker(
    HomeController_3.updateProductHandle,
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

  // @LINE:27
  private[this] lazy val controllers_HomeController_getProducts12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_getProducts12_invoker = createInvoker(
    HomeController_3.getProducts,
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

  // @LINE:28
  private[this] lazy val controllers_HomeController_getProduct13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getProduct13_invoker = createInvoker(
    HomeController_3.getProduct(fakeValue[Long]),
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

  // @LINE:29
  private[this] lazy val controllers_HomeController_delete14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_delete14_invoker = createInvoker(
    HomeController_3.delete(fakeValue[Long]),
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

  // @LINE:32
  private[this] lazy val controllers_HomeController_addOpinion15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addopinion/"), DynamicPart("productid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addOpinion15_invoker = createInvoker(
    HomeController_3.addOpinion(fakeValue[Long]),
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

  // @LINE:34
  private[this] lazy val controllers_HomeController_addOpinionHandle16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addopinionhandle")))
  )
  private[this] lazy val controllers_HomeController_addOpinionHandle16_invoker = createInvoker(
    HomeController_3.addOpinionHandle,
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

  // @LINE:35
  private[this] lazy val controllers_HomeController_updateOpinion17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateopinion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateOpinion17_invoker = createInvoker(
    HomeController_3.updateOpinion(fakeValue[Int]),
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

  // @LINE:37
  private[this] lazy val controllers_HomeController_updateOpinionHandle18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateopinionhandle")))
  )
  private[this] lazy val controllers_HomeController_updateOpinionHandle18_invoker = createInvoker(
    HomeController_3.updateOpinionHandle,
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

  // @LINE:38
  private[this] lazy val controllers_HomeController_deleteOpinion19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteopinion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteOpinion19_invoker = createInvoker(
    HomeController_3.deleteOpinion(fakeValue[Int]),
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

  // @LINE:39
  private[this] lazy val controllers_HomeController_opinions20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions/"), DynamicPart("productid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_opinions20_invoker = createInvoker(
    HomeController_3.opinions(fakeValue[Long]),
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

  // @LINE:42
  private[this] lazy val controllers_HomeController_addPromotion21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpromotion/"), DynamicPart("productid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addPromotion21_invoker = createInvoker(
    HomeController_3.addPromotion(fakeValue[Long]),
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

  // @LINE:44
  private[this] lazy val controllers_HomeController_addPromotionHandle22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpromotionhandle")))
  )
  private[this] lazy val controllers_HomeController_addPromotionHandle22_invoker = createInvoker(
    HomeController_3.addPromotionHandle,
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

  // @LINE:45
  private[this] lazy val controllers_HomeController_updatePromotion23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepromotion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updatePromotion23_invoker = createInvoker(
    HomeController_3.updatePromotion(fakeValue[Int]),
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

  // @LINE:47
  private[this] lazy val controllers_HomeController_updatePromotionHandle24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepromotionhandle")))
  )
  private[this] lazy val controllers_HomeController_updatePromotionHandle24_invoker = createInvoker(
    HomeController_3.updatePromotionHandle,
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

  // @LINE:48
  private[this] lazy val controllers_HomeController_deletePromotion25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletepromotion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deletePromotion25_invoker = createInvoker(
    HomeController_3.deletePromotion(fakeValue[Int]),
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

  // @LINE:49
  private[this] lazy val controllers_HomeController_promotion26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("promotion/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_promotion26_invoker = createInvoker(
    HomeController_3.promotion(fakeValue[Int]),
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

  // @LINE:50
  private[this] lazy val controllers_HomeController_promotions27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("promotions")))
  )
  private[this] lazy val controllers_HomeController_promotions27_invoker = createInvoker(
    HomeController_3.promotions,
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

  // @LINE:53
  private[this] lazy val controllers_HomeController_addComment28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcomment")))
  )
  private[this] lazy val controllers_HomeController_addComment28_invoker = createInvoker(
    HomeController_3.addComment,
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

  // @LINE:55
  private[this] lazy val controllers_HomeController_addCommentHandle29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcommenthandle")))
  )
  private[this] lazy val controllers_HomeController_addCommentHandle29_invoker = createInvoker(
    HomeController_3.addCommentHandle,
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

  // @LINE:56
  private[this] lazy val controllers_HomeController_updateComment30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecomment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateComment30_invoker = createInvoker(
    HomeController_3.updateComment(fakeValue[Int]),
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

  // @LINE:57
  private[this] lazy val controllers_HomeController_updateCommentHandle31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecommenthandle")))
  )
  private[this] lazy val controllers_HomeController_updateCommentHandle31_invoker = createInvoker(
    HomeController_3.updateCommentHandle,
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

  // @LINE:58
  private[this] lazy val controllers_HomeController_deleteComment32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletecomment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteComment32_invoker = createInvoker(
    HomeController_3.deleteComment(fakeValue[Int]),
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

  // @LINE:59
  private[this] lazy val controllers_HomeController_comment33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_comment33_invoker = createInvoker(
    HomeController_3.comment(fakeValue[Int]),
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

  // @LINE:60
  private[this] lazy val controllers_HomeController_comments34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comments")))
  )
  private[this] lazy val controllers_HomeController_comments34_invoker = createInvoker(
    HomeController_3.comments,
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

  // @LINE:63
  private[this] lazy val controllers_HomeController_addUser35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_HomeController_addUser35_invoker = createInvoker(
    HomeController_3.addUser,
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

  // @LINE:65
  private[this] lazy val controllers_HomeController_addUserHandle36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduserhandle")))
  )
  private[this] lazy val controllers_HomeController_addUserHandle36_invoker = createInvoker(
    HomeController_3.addUserHandle,
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

  // @LINE:66
  private[this] lazy val controllers_HomeController_updateUser37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateUser37_invoker = createInvoker(
    HomeController_3.updateUser(fakeValue[Int]),
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

  // @LINE:67
  private[this] lazy val controllers_HomeController_updateUserHandle38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuserhandle")))
  )
  private[this] lazy val controllers_HomeController_updateUserHandle38_invoker = createInvoker(
    HomeController_3.updateUserHandle,
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

  // @LINE:68
  private[this] lazy val controllers_HomeController_deleteUser39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteUser39_invoker = createInvoker(
    HomeController_3.deleteUser(fakeValue[Int]),
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

  // @LINE:69
  private[this] lazy val controllers_HomeController_user40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_user40_invoker = createInvoker(
    HomeController_3.user(fakeValue[Int]),
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

  // @LINE:70
  private[this] lazy val controllers_HomeController_users41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_HomeController_users41_invoker = createInvoker(
    HomeController_3.users,
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

  // @LINE:73
  private[this] lazy val controllers_HomeController_addToCart42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtocart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addToCart42_invoker = createInvoker(
    HomeController_3.addToCart(fakeValue[Int]),
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

  // @LINE:75
  private[this] lazy val controllers_HomeController_addToCartHandle43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtocarthandle")))
  )
  private[this] lazy val controllers_HomeController_addToCartHandle43_invoker = createInvoker(
    HomeController_3.addToCartHandle,
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

  // @LINE:76
  private[this] lazy val controllers_HomeController_addToCart44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addToCart44_invoker = createInvoker(
    HomeController_3.addToCart(fakeValue[Int]),
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

  // @LINE:78
  private[this] lazy val controllers_HomeController_addToCartHandle45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecarthandle")))
  )
  private[this] lazy val controllers_HomeController_addToCartHandle45_invoker = createInvoker(
    HomeController_3.addToCartHandle,
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

  // @LINE:79
  private[this] lazy val controllers_HomeController_deleteFromCart46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletefromcart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteFromCart46_invoker = createInvoker(
    HomeController_3.deleteFromCart(fakeValue[Int]),
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

  // @LINE:80
  private[this] lazy val controllers_HomeController_cart47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_HomeController_cart47_invoker = createInvoker(
    HomeController_3.cart,
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

  // @LINE:83
  private[this] lazy val controllers_HomeController_addTransaction48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtransaction")))
  )
  private[this] lazy val controllers_HomeController_addTransaction48_invoker = createInvoker(
    HomeController_3.addTransaction,
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

  // @LINE:85
  private[this] lazy val controllers_HomeController_addTransactionHandle49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtransactionhandle")))
  )
  private[this] lazy val controllers_HomeController_addTransactionHandle49_invoker = createInvoker(
    HomeController_3.addTransactionHandle,
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

  // @LINE:86
  private[this] lazy val controllers_HomeController_updateTransaction50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatetransaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateTransaction50_invoker = createInvoker(
    HomeController_3.updateTransaction(fakeValue[Int]),
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

  // @LINE:87
  private[this] lazy val controllers_HomeController_updateTransactionHandle51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatetransactionhandle")))
  )
  private[this] lazy val controllers_HomeController_updateTransactionHandle51_invoker = createInvoker(
    HomeController_3.updateTransactionHandle,
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

  // @LINE:88
  private[this] lazy val controllers_HomeController_deleteTransaction52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletetransaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteTransaction52_invoker = createInvoker(
    HomeController_3.deleteTransaction(fakeValue[Int]),
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

  // @LINE:89
  private[this] lazy val controllers_HomeController_transaction53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_transaction53_invoker = createInvoker(
    HomeController_3.transaction(fakeValue[Int]),
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

  // @LINE:90
  private[this] lazy val controllers_HomeController_transactions54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactions")))
  )
  private[this] lazy val controllers_HomeController_transactions54_invoker = createInvoker(
    HomeController_3.transactions,
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

  // @LINE:93
  private[this] lazy val controllers_HomeController_addPayment55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpayment")))
  )
  private[this] lazy val controllers_HomeController_addPayment55_invoker = createInvoker(
    HomeController_3.addPayment,
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

  // @LINE:95
  private[this] lazy val controllers_HomeController_addPaymentHandle56_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpaymenthandle")))
  )
  private[this] lazy val controllers_HomeController_addPaymentHandle56_invoker = createInvoker(
    HomeController_3.addPaymentHandle,
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

  // @LINE:96
  private[this] lazy val controllers_HomeController_updatePayment57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updatePayment57_invoker = createInvoker(
    HomeController_3.updatePayment(fakeValue[Int]),
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

  // @LINE:97
  private[this] lazy val controllers_HomeController_updatePaymentHandle58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepaymenthandle")))
  )
  private[this] lazy val controllers_HomeController_updatePaymentHandle58_invoker = createInvoker(
    HomeController_3.updatePaymentHandle,
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

  // @LINE:98
  private[this] lazy val controllers_HomeController_deletePayment59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletepayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deletePayment59_invoker = createInvoker(
    HomeController_3.deletePayment(fakeValue[Int]),
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

  // @LINE:99
  private[this] lazy val controllers_HomeController_payment60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_payment60_invoker = createInvoker(
    HomeController_3.payment(fakeValue[Int]),
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

  // @LINE:102
  private[this] lazy val controllers_HomeController_addDelivery61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddelivery")))
  )
  private[this] lazy val controllers_HomeController_addDelivery61_invoker = createInvoker(
    HomeController_3.addDelivery,
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

  // @LINE:104
  private[this] lazy val controllers_HomeController_addDeliveryHandle62_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddeliveryhandle")))
  )
  private[this] lazy val controllers_HomeController_addDeliveryHandle62_invoker = createInvoker(
    HomeController_3.addDeliveryHandle,
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

  // @LINE:105
  private[this] lazy val controllers_HomeController_updateDelivery63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatedelivery/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateDelivery63_invoker = createInvoker(
    HomeController_3.updateDelivery(fakeValue[Int]),
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

  // @LINE:106
  private[this] lazy val controllers_HomeController_updateDeliveryHandle64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatedeliveryhandle")))
  )
  private[this] lazy val controllers_HomeController_updateDeliveryHandle64_invoker = createInvoker(
    HomeController_3.updateDeliveryHandle,
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

  // @LINE:107
  private[this] lazy val controllers_HomeController_deleteDelivery65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletedelivery/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteDelivery65_invoker = createInvoker(
    HomeController_3.deleteDelivery(fakeValue[Int]),
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

  // @LINE:108
  private[this] lazy val controllers_HomeController_delivery66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delivery/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_delivery66_invoker = createInvoker(
    HomeController_3.delivery(fakeValue[Int]),
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

  // @LINE:112
  private[this] lazy val controllers_CountController_count67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count67_invoker = createInvoker(
    CountController_2.count,
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

  // @LINE:114
  private[this] lazy val controllers_AsyncController_message68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message68_invoker = createInvoker(
    AsyncController_0.message,
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

  // @LINE:117
  private[this] lazy val controllers_Assets_versioned69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned69_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:10
    case controllers_HomeController_addCategory1_route(params@_) =>
      call { 
        controllers_HomeController_addCategory1_invoker.call(HomeController_3.addCategory)
      }
  
    // @LINE:12
    case controllers_HomeController_addCategoryHandle2_route(params@_) =>
      call { 
        controllers_HomeController_addCategoryHandle2_invoker.call(HomeController_3.addCategoryHandle)
      }
  
    // @LINE:13
    case controllers_HomeController_updateCategory3_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateCategory3_invoker.call(HomeController_3.updateCategory(id))
      }
  
    // @LINE:15
    case controllers_HomeController_updateCategoryHandle4_route(params@_) =>
      call { 
        controllers_HomeController_updateCategoryHandle4_invoker.call(HomeController_3.updateCategoryHandle)
      }
  
    // @LINE:16
    case controllers_HomeController_deleteCategory5_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteCategory5_invoker.call(HomeController_3.deleteCategory(id))
      }
  
    // @LINE:17
    case controllers_HomeController_getCategory6_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_getCategory6_invoker.call(HomeController_3.getCategory(id))
      }
  
    // @LINE:18
    case controllers_HomeController_getCategorys7_route(params@_) =>
      call { 
        controllers_HomeController_getCategorys7_invoker.call(HomeController_3.getCategorys)
      }
  
    // @LINE:21
    case controllers_HomeController_addProduct8_route(params@_) =>
      call { 
        controllers_HomeController_addProduct8_invoker.call(HomeController_3.addProduct)
      }
  
    // @LINE:23
    case controllers_HomeController_addProductHandle9_route(params@_) =>
      call { 
        controllers_HomeController_addProductHandle9_invoker.call(HomeController_3.addProductHandle)
      }
  
    // @LINE:24
    case controllers_HomeController_updateProduct10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProduct10_invoker.call(HomeController_3.updateProduct(id))
      }
  
    // @LINE:26
    case controllers_HomeController_updateProductHandle11_route(params@_) =>
      call { 
        controllers_HomeController_updateProductHandle11_invoker.call(HomeController_3.updateProductHandle)
      }
  
    // @LINE:27
    case controllers_HomeController_getProducts12_route(params@_) =>
      call { 
        controllers_HomeController_getProducts12_invoker.call(HomeController_3.getProducts)
      }
  
    // @LINE:28
    case controllers_HomeController_getProduct13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_getProduct13_invoker.call(HomeController_3.getProduct(id))
      }
  
    // @LINE:29
    case controllers_HomeController_delete14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_delete14_invoker.call(HomeController_3.delete(id))
      }
  
    // @LINE:32
    case controllers_HomeController_addOpinion15_route(params@_) =>
      call(params.fromPath[Long]("productid", None)) { (productid) =>
        controllers_HomeController_addOpinion15_invoker.call(HomeController_3.addOpinion(productid))
      }
  
    // @LINE:34
    case controllers_HomeController_addOpinionHandle16_route(params@_) =>
      call { 
        controllers_HomeController_addOpinionHandle16_invoker.call(HomeController_3.addOpinionHandle)
      }
  
    // @LINE:35
    case controllers_HomeController_updateOpinion17_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateOpinion17_invoker.call(HomeController_3.updateOpinion(id))
      }
  
    // @LINE:37
    case controllers_HomeController_updateOpinionHandle18_route(params@_) =>
      call { 
        controllers_HomeController_updateOpinionHandle18_invoker.call(HomeController_3.updateOpinionHandle)
      }
  
    // @LINE:38
    case controllers_HomeController_deleteOpinion19_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteOpinion19_invoker.call(HomeController_3.deleteOpinion(id))
      }
  
    // @LINE:39
    case controllers_HomeController_opinions20_route(params@_) =>
      call(params.fromPath[Long]("productid", None)) { (productid) =>
        controllers_HomeController_opinions20_invoker.call(HomeController_3.opinions(productid))
      }
  
    // @LINE:42
    case controllers_HomeController_addPromotion21_route(params@_) =>
      call(params.fromPath[Long]("productid", None)) { (productid) =>
        controllers_HomeController_addPromotion21_invoker.call(HomeController_3.addPromotion(productid))
      }
  
    // @LINE:44
    case controllers_HomeController_addPromotionHandle22_route(params@_) =>
      call { 
        controllers_HomeController_addPromotionHandle22_invoker.call(HomeController_3.addPromotionHandle)
      }
  
    // @LINE:45
    case controllers_HomeController_updatePromotion23_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updatePromotion23_invoker.call(HomeController_3.updatePromotion(id))
      }
  
    // @LINE:47
    case controllers_HomeController_updatePromotionHandle24_route(params@_) =>
      call { 
        controllers_HomeController_updatePromotionHandle24_invoker.call(HomeController_3.updatePromotionHandle)
      }
  
    // @LINE:48
    case controllers_HomeController_deletePromotion25_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deletePromotion25_invoker.call(HomeController_3.deletePromotion(id))
      }
  
    // @LINE:49
    case controllers_HomeController_promotion26_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_promotion26_invoker.call(HomeController_3.promotion(id))
      }
  
    // @LINE:50
    case controllers_HomeController_promotions27_route(params@_) =>
      call { 
        controllers_HomeController_promotions27_invoker.call(HomeController_3.promotions)
      }
  
    // @LINE:53
    case controllers_HomeController_addComment28_route(params@_) =>
      call { 
        controllers_HomeController_addComment28_invoker.call(HomeController_3.addComment)
      }
  
    // @LINE:55
    case controllers_HomeController_addCommentHandle29_route(params@_) =>
      call { 
        controllers_HomeController_addCommentHandle29_invoker.call(HomeController_3.addCommentHandle)
      }
  
    // @LINE:56
    case controllers_HomeController_updateComment30_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateComment30_invoker.call(HomeController_3.updateComment(id))
      }
  
    // @LINE:57
    case controllers_HomeController_updateCommentHandle31_route(params@_) =>
      call { 
        controllers_HomeController_updateCommentHandle31_invoker.call(HomeController_3.updateCommentHandle)
      }
  
    // @LINE:58
    case controllers_HomeController_deleteComment32_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteComment32_invoker.call(HomeController_3.deleteComment(id))
      }
  
    // @LINE:59
    case controllers_HomeController_comment33_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_comment33_invoker.call(HomeController_3.comment(id))
      }
  
    // @LINE:60
    case controllers_HomeController_comments34_route(params@_) =>
      call { 
        controllers_HomeController_comments34_invoker.call(HomeController_3.comments)
      }
  
    // @LINE:63
    case controllers_HomeController_addUser35_route(params@_) =>
      call { 
        controllers_HomeController_addUser35_invoker.call(HomeController_3.addUser)
      }
  
    // @LINE:65
    case controllers_HomeController_addUserHandle36_route(params@_) =>
      call { 
        controllers_HomeController_addUserHandle36_invoker.call(HomeController_3.addUserHandle)
      }
  
    // @LINE:66
    case controllers_HomeController_updateUser37_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateUser37_invoker.call(HomeController_3.updateUser(id))
      }
  
    // @LINE:67
    case controllers_HomeController_updateUserHandle38_route(params@_) =>
      call { 
        controllers_HomeController_updateUserHandle38_invoker.call(HomeController_3.updateUserHandle)
      }
  
    // @LINE:68
    case controllers_HomeController_deleteUser39_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteUser39_invoker.call(HomeController_3.deleteUser(id))
      }
  
    // @LINE:69
    case controllers_HomeController_user40_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_user40_invoker.call(HomeController_3.user(id))
      }
  
    // @LINE:70
    case controllers_HomeController_users41_route(params@_) =>
      call { 
        controllers_HomeController_users41_invoker.call(HomeController_3.users)
      }
  
    // @LINE:73
    case controllers_HomeController_addToCart42_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_addToCart42_invoker.call(HomeController_3.addToCart(id))
      }
  
    // @LINE:75
    case controllers_HomeController_addToCartHandle43_route(params@_) =>
      call { 
        controllers_HomeController_addToCartHandle43_invoker.call(HomeController_3.addToCartHandle)
      }
  
    // @LINE:76
    case controllers_HomeController_addToCart44_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_addToCart44_invoker.call(HomeController_3.addToCart(id))
      }
  
    // @LINE:78
    case controllers_HomeController_addToCartHandle45_route(params@_) =>
      call { 
        controllers_HomeController_addToCartHandle45_invoker.call(HomeController_3.addToCartHandle)
      }
  
    // @LINE:79
    case controllers_HomeController_deleteFromCart46_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteFromCart46_invoker.call(HomeController_3.deleteFromCart(id))
      }
  
    // @LINE:80
    case controllers_HomeController_cart47_route(params@_) =>
      call { 
        controllers_HomeController_cart47_invoker.call(HomeController_3.cart)
      }
  
    // @LINE:83
    case controllers_HomeController_addTransaction48_route(params@_) =>
      call { 
        controllers_HomeController_addTransaction48_invoker.call(HomeController_3.addTransaction)
      }
  
    // @LINE:85
    case controllers_HomeController_addTransactionHandle49_route(params@_) =>
      call { 
        controllers_HomeController_addTransactionHandle49_invoker.call(HomeController_3.addTransactionHandle)
      }
  
    // @LINE:86
    case controllers_HomeController_updateTransaction50_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateTransaction50_invoker.call(HomeController_3.updateTransaction(id))
      }
  
    // @LINE:87
    case controllers_HomeController_updateTransactionHandle51_route(params@_) =>
      call { 
        controllers_HomeController_updateTransactionHandle51_invoker.call(HomeController_3.updateTransactionHandle)
      }
  
    // @LINE:88
    case controllers_HomeController_deleteTransaction52_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteTransaction52_invoker.call(HomeController_3.deleteTransaction(id))
      }
  
    // @LINE:89
    case controllers_HomeController_transaction53_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_transaction53_invoker.call(HomeController_3.transaction(id))
      }
  
    // @LINE:90
    case controllers_HomeController_transactions54_route(params@_) =>
      call { 
        controllers_HomeController_transactions54_invoker.call(HomeController_3.transactions)
      }
  
    // @LINE:93
    case controllers_HomeController_addPayment55_route(params@_) =>
      call { 
        controllers_HomeController_addPayment55_invoker.call(HomeController_3.addPayment)
      }
  
    // @LINE:95
    case controllers_HomeController_addPaymentHandle56_route(params@_) =>
      call { 
        controllers_HomeController_addPaymentHandle56_invoker.call(HomeController_3.addPaymentHandle)
      }
  
    // @LINE:96
    case controllers_HomeController_updatePayment57_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updatePayment57_invoker.call(HomeController_3.updatePayment(id))
      }
  
    // @LINE:97
    case controllers_HomeController_updatePaymentHandle58_route(params@_) =>
      call { 
        controllers_HomeController_updatePaymentHandle58_invoker.call(HomeController_3.updatePaymentHandle)
      }
  
    // @LINE:98
    case controllers_HomeController_deletePayment59_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deletePayment59_invoker.call(HomeController_3.deletePayment(id))
      }
  
    // @LINE:99
    case controllers_HomeController_payment60_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_payment60_invoker.call(HomeController_3.payment(id))
      }
  
    // @LINE:102
    case controllers_HomeController_addDelivery61_route(params@_) =>
      call { 
        controllers_HomeController_addDelivery61_invoker.call(HomeController_3.addDelivery)
      }
  
    // @LINE:104
    case controllers_HomeController_addDeliveryHandle62_route(params@_) =>
      call { 
        controllers_HomeController_addDeliveryHandle62_invoker.call(HomeController_3.addDeliveryHandle)
      }
  
    // @LINE:105
    case controllers_HomeController_updateDelivery63_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_updateDelivery63_invoker.call(HomeController_3.updateDelivery(id))
      }
  
    // @LINE:106
    case controllers_HomeController_updateDeliveryHandle64_route(params@_) =>
      call { 
        controllers_HomeController_updateDeliveryHandle64_invoker.call(HomeController_3.updateDeliveryHandle)
      }
  
    // @LINE:107
    case controllers_HomeController_deleteDelivery65_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_deleteDelivery65_invoker.call(HomeController_3.deleteDelivery(id))
      }
  
    // @LINE:108
    case controllers_HomeController_delivery66_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_delivery66_invoker.call(HomeController_3.delivery(id))
      }
  
    // @LINE:112
    case controllers_CountController_count67_route(params@_) =>
      call { 
        controllers_CountController_count67_invoker.call(CountController_2.count)
      }
  
    // @LINE:114
    case controllers_AsyncController_message68_route(params@_) =>
      call { 
        controllers_AsyncController_message68_invoker.call(AsyncController_0.message)
      }
  
    // @LINE:117
    case controllers_Assets_versioned69_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned69_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
