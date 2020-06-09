// @GENERATOR:play-routes-compiler
// @SOURCE:/home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project_silhouette/conf/routes
// @DATE:Tue Jun 09 18:59:01 CEST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

// @LINE:6
package controllers.javascript {

  // @LINE:146
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:146
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseSignInController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignInController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
        }
      """
    )
  
    // @LINE:14
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignInController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseTotpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def enableTotpSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TotpController.enableTotpSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "enableTotpSubmit"})
        }
      """
    )
  
    // @LINE:19
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TotpController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "totpSubmit"})
        }
      """
    )
  
    // @LINE:17
    def enableTotp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TotpController.enableTotp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enableTotp"})
        }
      """
    )
  
    // @LINE:18
    def disableTotp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TotpController.disableTotp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "disableTotp"})
        }
      """
    )
  
    // @LINE:16
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TotpController.view",
      """
        function(userId0,sharedKey1,rememberMe2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "totp" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.UUID]].javascriptUnbind + """)("userId", userId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sharedKey", sharedKey1), (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("rememberMe", rememberMe2)])})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseTotpRecoveryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TotpRecoveryController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "totpRecoverySubmit"})
        }
      """
    )
  
    // @LINE:22
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TotpRecoveryController.view",
      """
        function(userID0,sharedKey1,rememberMe2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "totpRecovery" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.UUID]].javascriptUnbind + """)("userID", userID0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sharedKey", sharedKey1), (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("rememberMe", rememberMe2)])})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseSocialAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocialAuthController.authenticate",
      """
        function(provider0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("provider", provider0))})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseResetPasswordController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ResetPasswordController.submit",
      """
        function(token0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "password/reset/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("token", token0))})
        }
      """
    )
  
    // @LINE:27
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ResetPasswordController.view",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "password/reset/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("token", token0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signOut"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseActivateAccountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def activate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActivateAccountController.activate",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/activate/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("token", token0))})
        }
      """
    )
  
    // @LINE:32
    def send: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActivateAccountController.send",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/email/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email0))})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseForgotPasswordController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ForgotPasswordController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "password/forgot"})
        }
      """
    )
  
    // @LINE:26
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ForgotPasswordController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "password/forgot"})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:110
    def cart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.cart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
    // @LINE:113
    def addTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTransaction",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addtransaction"})
        }
      """
    )
  
    // @LINE:109
    def deleteFromCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteFromCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletefromcart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:56
    def getProductsByCat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProductsByCat",
      """
        function(category0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("category", category0))})
        }
      """
    )
  
    // @LINE:58
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:78
    def promotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.promotion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "promotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:121
    def transactionsUsr: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.transactionsUsr",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactionsusr"})
        }
      """
    )
  
    // @LINE:134
    def addDelivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addDelivery",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adddelivery"})
        }
      """
    )
  
    // @LINE:124
    def addPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPayment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addpayment"})
        }
      """
    )
  
    // @LINE:131
    def paymentTrans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.paymentTrans",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentbyt/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:79
    def promotionpr: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.promotionpr",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "promotionpr/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:57
    def getProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:118
    def deleteTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteTransaction",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletetransaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:105
    def addToCartHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addToCartHandle",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addtocarthandle"})
          }
        
        }
      """
    )
  
    // @LINE:55
    def getProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:41
    def updateCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:126
    def addPaymentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPaymentHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addpaymenthandle"})
        }
      """
    )
  
    // @LINE:54
    def updateProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproducthandle"})
        }
      """
    )
  
    // @LINE:117
    def updateTransactionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateTransactionHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatetransactionhandle"})
        }
      """
    )
  
    // @LINE:63
    def addOpinionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addOpinionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addopinionhandle"})
        }
      """
    )
  
    // @LINE:137
    def updateDelivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateDelivery",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatedelivery/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:64
    def updateOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateOpinion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateopinion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:139
    def deleteDelivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteDelivery",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletedelivery/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:66
    def updateOpinionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateOpinionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateopinionhandle"})
        }
      """
    )
  
    // @LINE:51
    def addProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addproducthandle"})
        }
      """
    )
  
    // @LINE:67
    def deleteOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteOpinion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteopinion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:87
    def updateCommentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateCommentHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecommenthandle"})
        }
      """
    )
  
    // @LINE:83
    def addComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addComment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcomment"})
        }
      """
    )
  
    // @LINE:68
    def opinions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.opinions",
      """
        function(productid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "opinions/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productid", productid0))})
        }
      """
    )
  
    // @LINE:136
    def addDeliveryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addDeliveryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adddeliveryhandle"})
        }
      """
    )
  
    // @LINE:130
    def payment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.payment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:115
    def addTransactionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTransactionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addtransactionhandle"})
        }
      """
    )
  
    // @LINE:73
    def addPromotionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPromotionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addpromotionhandle"})
        }
      """
    )
  
    // @LINE:38
    def addCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategory"})
        }
      """
    )
  
    // @LINE:52
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:88
    def deleteComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteComment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletecomment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:116
    def updateTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateTransaction",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatetransaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:77
    def deletePromotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deletePromotion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletepromotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:85
    def addCommentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addCommentHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcommenthandle"})
        }
      """
    )
  
    // @LINE:76
    def updatePromotionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePromotionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepromotionhandle"})
        }
      """
    )
  
    // @LINE:120
    def transactions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.transactions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactions"})
        }
      """
    )
  
    // @LINE:141
    def deliveryTrans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deliveryTrans",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deliverybyt/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:40
    def addCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategoryhandle"})
        }
      """
    )
  
    // @LINE:46
    def getCategorys: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getCategorys",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
        }
      """
    )
  
    // @LINE:89
    def comment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.comment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:74
    def updatePromotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePromotion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepromotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:49
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addproduct"})
        }
      """
    )
  
    // @LINE:61
    def addOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addOpinion",
      """
        function(productid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addopinion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productid", productid0))})
        }
      """
    )
  
    // @LINE:43
    def updateCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecategoryhandle"})
        }
      """
    )
  
    // @LINE:127
    def updatePayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepayment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:80
    def promotions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.promotions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "promotions"})
        }
      """
    )
  
    // @LINE:71
    def addPromotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPromotion",
      """
        function(productid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addpromotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productid", productid0))})
        }
      """
    )
  
    // @LINE:140
    def delivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delivery",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delivery/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:119
    def transaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.transaction",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:129
    def deletePayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deletePayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletepayment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:45
    def getCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:90
    def comments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.comments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments"})
        }
      """
    )
  
    // @LINE:103
    def addToCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addToCart",
      """
        function(id0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addtocart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
          }
        
        }
      """
    )
  
    // @LINE:128
    def updatePaymentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePaymentHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepaymenthandle"})
        }
      """
    )
  
    // @LINE:44
    def deleteCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletecategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:138
    def updateDeliveryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateDeliveryHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatedeliveryhandle"})
        }
      """
    )
  
    // @LINE:86
    def updateComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateComment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecomment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseChangePasswordController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChangePasswordController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "password/change"})
        }
      """
    )
  
    // @LINE:30
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChangePasswordController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "password/change"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseSignUpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
    // @LINE:11
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
  }


}
