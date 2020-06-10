// @GENERATOR:play-routes-compiler
// @SOURCE:/home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/conf/routes
// @DATE:Wed Jun 10 20:01:45 CEST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

// @LINE:6
package controllers.javascript {

  // @LINE:149
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:149
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

  
    // @LINE:113
    def cart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.cart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
    // @LINE:108
    def addToCartHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.addToCartHandle",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addtocarthandle"})
          }
        
        }
      """
    )
  
    // @LINE:66
    def addOpinionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.addOpinionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addopinionhandle"})
        }
      """
    )
  
    // @LINE:7
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signOut"})
        }
      """
    )
  
    // @LINE:88
    def addCommentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.addCommentHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcommenthandle"})
        }
      """
    )
  
    // @LINE:36
    def isLogged: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.isLogged",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "isLogged"})
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

  // @LINE:41
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:116
    def addTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTransaction",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addtransaction"})
        }
      """
    )
  
    // @LINE:112
    def deleteFromCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteFromCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletefromcart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:59
    def getProductsByCat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProductsByCat",
      """
        function(category0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("category", category0))})
        }
      """
    )
  
    // @LINE:61
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:81
    def promotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.promotion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "promotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:137
    def addDelivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addDelivery",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adddelivery"})
        }
      """
    )
  
    // @LINE:127
    def addPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPayment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addpayment"})
        }
      """
    )
  
    // @LINE:134
    def paymentTrans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.paymentTrans",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentbyt/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:82
    def promotionpr: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.promotionpr",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "promotionpr/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:60
    def getProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:124
    def transactionsUsr: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.transactionsUsr",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactionsusr/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:98
    def addUserHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUserHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adduserhandle"})
        }
      """
    )
  
    // @LINE:96
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adduser"})
        }
      """
    )
  
    // @LINE:121
    def deleteTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteTransaction",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletetransaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:58
    def getProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:44
    def updateCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:129
    def addPaymentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPaymentHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addpaymenthandle"})
        }
      """
    )
  
    // @LINE:57
    def updateProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproducthandle"})
        }
      """
    )
  
    // @LINE:120
    def updateTransactionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateTransactionHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatetransactionhandle"})
        }
      """
    )
  
    // @LINE:140
    def updateDelivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateDelivery",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatedelivery/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:99
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:67
    def updateOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateOpinion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateopinion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:142
    def deleteDelivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteDelivery",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletedelivery/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:102
    def user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.user",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:69
    def updateOpinionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateOpinionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateopinionhandle"})
        }
      """
    )
  
    // @LINE:54
    def addProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addproducthandle"})
        }
      """
    )
  
    // @LINE:70
    def deleteOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteOpinion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteopinion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:90
    def updateCommentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateCommentHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecommenthandle"})
        }
      """
    )
  
    // @LINE:86
    def addComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addComment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcomment"})
        }
      """
    )
  
    // @LINE:71
    def opinions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.opinions",
      """
        function(productid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "opinions/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productid", productid0))})
        }
      """
    )
  
    // @LINE:139
    def addDeliveryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addDeliveryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adddeliveryhandle"})
        }
      """
    )
  
    // @LINE:133
    def payment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.payment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:118
    def addTransactionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTransactionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addtransactionhandle"})
        }
      """
    )
  
    // @LINE:76
    def addPromotionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPromotionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addpromotionhandle"})
        }
      """
    )
  
    // @LINE:41
    def addCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategory"})
        }
      """
    )
  
    // @LINE:55
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:91
    def deleteComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteComment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletecomment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:119
    def updateTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateTransaction",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatetransaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:80
    def deletePromotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deletePromotion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletepromotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:79
    def updatePromotionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePromotionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepromotionhandle"})
        }
      """
    )
  
    // @LINE:103
    def users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.users",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:123
    def transactions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.transactions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactions"})
        }
      """
    )
  
    // @LINE:101
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteuser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:144
    def deliveryTrans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deliveryTrans",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deliverybyt/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:43
    def addCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategoryhandle"})
        }
      """
    )
  
    // @LINE:49
    def getCategorys: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getCategorys",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
        }
      """
    )
  
    // @LINE:92
    def comment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.comment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:77
    def updatePromotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePromotion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepromotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:52
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addproduct"})
        }
      """
    )
  
    // @LINE:64
    def addOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addOpinion",
      """
        function(productid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addopinion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productid", productid0))})
        }
      """
    )
  
    // @LINE:46
    def updateCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecategoryhandle"})
        }
      """
    )
  
    // @LINE:130
    def updatePayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepayment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:83
    def promotions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.promotions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "promotions"})
        }
      """
    )
  
    // @LINE:74
    def addPromotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPromotion",
      """
        function(productid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addpromotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productid", productid0))})
        }
      """
    )
  
    // @LINE:100
    def updateUserHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateUserHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuserhandle"})
        }
      """
    )
  
    // @LINE:143
    def delivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delivery",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delivery/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:122
    def transaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.transaction",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:132
    def deletePayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deletePayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletepayment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:48
    def getCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:93
    def comments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.comments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments"})
        }
      """
    )
  
    // @LINE:106
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
  
    // @LINE:131
    def updatePaymentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePaymentHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepaymenthandle"})
        }
      """
    )
  
    // @LINE:47
    def deleteCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletecategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:141
    def updateDeliveryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateDeliveryHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatedeliveryhandle"})
        }
      """
    )
  
    // @LINE:89
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
