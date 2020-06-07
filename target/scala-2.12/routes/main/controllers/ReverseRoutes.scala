// @GENERATOR:play-routes-compiler
// @SOURCE:/home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/conf/routes
// @DATE:Sun Jun 07 17:55:37 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:129
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:129
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:124
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:124
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:92
    def addTransaction(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addtransaction")
    }
  
    // @LINE:88
    def deleteFromCart(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletefromcart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:35
    def getProductsByCat(category:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("category", category)))
    }
  
    // @LINE:37
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:57
    def promotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "promotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:113
    def addDelivery(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adddelivery")
    }
  
    // @LINE:103
    def addPayment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpayment")
    }
  
    // @LINE:110
    def paymentTrans(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paymentbyt/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:58
    def promotionpr(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "promotionpr/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:36
    def getProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:100
    def transactionsUsr(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transactionsusr/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:74
    def addUserHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduserhandle")
    }
  
    // @LINE:72
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:97
    def deleteTransaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletetransaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:84
    def addToCartHandle(): Call = {
    
      () match {
      
        // @LINE:84
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "addtocarthandle")
      
      }
    
    }
  
    // @LINE:34
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:20
    def updateCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:105
    def addPaymentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpaymenthandle")
    }
  
    // @LINE:33
    def updateProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateproducthandle")
    }
  
    // @LINE:96
    def updateTransactionHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatetransactionhandle")
    }
  
    // @LINE:42
    def addOpinionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addopinionhandle")
    }
  
    // @LINE:116
    def updateDelivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatedelivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:75
    def updateUser(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateuser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:43
    def updateOpinion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:118
    def deleteDelivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletedelivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:78
    def user(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:45
    def updateOpinionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateopinionhandle")
    }
  
    // @LINE:30
    def addProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproducthandle")
    }
  
    // @LINE:46
    def deleteOpinion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:66
    def updateCommentHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecommenthandle")
    }
  
    // @LINE:62
    def addComment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcomment")
    }
  
    // @LINE:47
    def opinions(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:115
    def addDeliveryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adddeliveryhandle")
    }
  
    // @LINE:109
    def payment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:94
    def addTransactionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addtransactionhandle")
    }
  
    // @LINE:52
    def addPromotionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpromotionhandle")
    }
  
    // @LINE:17
    def addCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcategory")
    }
  
    // @LINE:31
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateproduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:67
    def deleteComment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletecomment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:95
    def updateTransaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatetransaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:56
    def deletePromotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletepromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:64
    def addCommentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcommenthandle")
    }
  
    // @LINE:55
    def updatePromotionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatepromotionhandle")
    }
  
    // @LINE:79
    def users(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:99
    def transactions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transactions")
    }
  
    // @LINE:89
    def cart(userId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("userId", userId)))
    }
  
    // @LINE:77
    def deleteUser(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteuser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:120
    def deliveryTrans(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deliverybyt/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:19
    def addCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategoryhandle")
    }
  
    // @LINE:25
    def getCategorys(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:68
    def comment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:53
    def updatePromotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:28
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:40
    def addOpinion(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:22
    def updateCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatecategoryhandle")
    }
  
    // @LINE:106
    def updatePayment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:59
    def promotions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "promotions")
    }
  
    // @LINE:50
    def addPromotion(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:76
    def updateUserHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateuserhandle")
    }
  
    // @LINE:119
    def delivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:98
    def transaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:108
    def deletePayment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:24
    def getCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:69
    def comments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comments")
    }
  
    // @LINE:82
    def addToCart(id:Int): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:82
        case (id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "addtocart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
      
      }
    
    }
  
    // @LINE:107
    def updatePaymentHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepaymenthandle")
    }
  
    // @LINE:23
    def deleteCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletecategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:117
    def updateDeliveryHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatedeliveryhandle")
    }
  
    // @LINE:65
    def updateComment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecomment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:126
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:126
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:13
  class ReverseSignUpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
  }


}
