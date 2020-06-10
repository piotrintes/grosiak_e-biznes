// @GENERATOR:play-routes-compiler
// @SOURCE:/home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/conf/routes
// @DATE:Wed Jun 10 20:01:45 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

// @LINE:6
package controllers {

  // @LINE:149
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:149
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:13
  class ReverseSignInController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signIn")
    }
  
    // @LINE:14
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signIn")
    }
  
  }

  // @LINE:16
  class ReverseTotpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def enableTotpSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "enableTotpSubmit")
    }
  
    // @LINE:19
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "totpSubmit")
    }
  
    // @LINE:17
    def enableTotp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "enableTotp")
    }
  
    // @LINE:18
    def disableTotp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "disableTotp")
    }
  
    // @LINE:16
    def view(userId:java.util.UUID, sharedKey:String, rememberMe:Boolean): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "totp" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.UUID]].unbind("userId", userId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sharedKey", sharedKey)), Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("rememberMe", rememberMe)))))
    }
  
  }

  // @LINE:22
  class ReverseTotpRecoveryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "totpRecoverySubmit")
    }
  
    // @LINE:22
    def view(userID:java.util.UUID, sharedKey:String, rememberMe:Boolean): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "totpRecovery" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.UUID]].unbind("userID", userID)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sharedKey", sharedKey)), Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("rememberMe", rememberMe)))))
    }
  
  }

  // @LINE:8
  class ReverseSocialAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def authenticate(provider:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("provider", provider)))
    }
  
  }

  // @LINE:27
  class ReverseResetPasswordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def submit(token:java.util.UUID): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "password/reset/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("token", token)))
    }
  
    // @LINE:27
    def view(token:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "password/reset/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("token", token)))
    }
  
  }

  // @LINE:6
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:113
    def cart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:108
    def addToCartHandle(): Call = {
    
      () match {
      
        // @LINE:108
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "addtocarthandle")
      
      }
    
    }
  
    // @LINE:66
    def addOpinionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addopinionhandle")
    }
  
    // @LINE:7
    def signOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signOut")
    }
  
    // @LINE:88
    def addCommentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcommenthandle")
    }
  
    // @LINE:36
    def isLogged(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "isLogged")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:32
  class ReverseActivateAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def activate(token:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "account/activate/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("token", token)))
    }
  
    // @LINE:32
    def send(email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "account/email/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
  }

  // @LINE:25
  class ReverseForgotPasswordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "password/forgot")
    }
  
    // @LINE:26
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "password/forgot")
    }
  
  }

  // @LINE:41
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:116
    def addTransaction(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addtransaction")
    }
  
    // @LINE:112
    def deleteFromCart(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletefromcart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:59
    def getProductsByCat(category:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("category", category)))
    }
  
    // @LINE:61
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:81
    def promotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "promotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:137
    def addDelivery(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adddelivery")
    }
  
    // @LINE:127
    def addPayment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpayment")
    }
  
    // @LINE:134
    def paymentTrans(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paymentbyt/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:82
    def promotionpr(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "promotionpr/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:60
    def getProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:124
    def transactionsUsr(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transactionsusr/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:98
    def addUserHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduserhandle")
    }
  
    // @LINE:96
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:121
    def deleteTransaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletetransaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:58
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:44
    def updateCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:129
    def addPaymentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpaymenthandle")
    }
  
    // @LINE:57
    def updateProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateproducthandle")
    }
  
    // @LINE:120
    def updateTransactionHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatetransactionhandle")
    }
  
    // @LINE:140
    def updateDelivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatedelivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:99
    def updateUser(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateuser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:67
    def updateOpinion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:142
    def deleteDelivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletedelivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:102
    def user(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:69
    def updateOpinionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateopinionhandle")
    }
  
    // @LINE:54
    def addProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproducthandle")
    }
  
    // @LINE:70
    def deleteOpinion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:90
    def updateCommentHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecommenthandle")
    }
  
    // @LINE:86
    def addComment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcomment")
    }
  
    // @LINE:71
    def opinions(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:139
    def addDeliveryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adddeliveryhandle")
    }
  
    // @LINE:133
    def payment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:118
    def addTransactionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addtransactionhandle")
    }
  
    // @LINE:76
    def addPromotionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpromotionhandle")
    }
  
    // @LINE:41
    def addCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcategory")
    }
  
    // @LINE:55
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateproduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:91
    def deleteComment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletecomment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:119
    def updateTransaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatetransaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:80
    def deletePromotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletepromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:79
    def updatePromotionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatepromotionhandle")
    }
  
    // @LINE:103
    def users(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:123
    def transactions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transactions")
    }
  
    // @LINE:101
    def deleteUser(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteuser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:144
    def deliveryTrans(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deliverybyt/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:43
    def addCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategoryhandle")
    }
  
    // @LINE:49
    def getCategorys(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:92
    def comment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:77
    def updatePromotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:52
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:64
    def addOpinion(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:46
    def updateCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatecategoryhandle")
    }
  
    // @LINE:130
    def updatePayment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:83
    def promotions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "promotions")
    }
  
    // @LINE:74
    def addPromotion(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:100
    def updateUserHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateuserhandle")
    }
  
    // @LINE:143
    def delivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:122
    def transaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:132
    def deletePayment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:48
    def getCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:93
    def comments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comments")
    }
  
    // @LINE:106
    def addToCart(id:Int): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:106
        case (id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "addtocart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
      
      }
    
    }
  
    // @LINE:131
    def updatePaymentHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepaymenthandle")
    }
  
    // @LINE:47
    def deleteCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletecategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:141
    def updateDeliveryHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatedeliveryhandle")
    }
  
    // @LINE:89
    def updateComment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecomment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:29
  class ReverseChangePasswordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "password/change")
    }
  
    // @LINE:30
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "password/change")
    }
  
  }

  // @LINE:10
  class ReverseSignUpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signUp")
    }
  
    // @LINE:11
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signUp")
    }
  
  }


}
