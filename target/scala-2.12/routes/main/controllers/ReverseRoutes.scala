// @GENERATOR:play-routes-compiler
// @SOURCE:/home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/conf/routes
// @DATE:Thu May 28 16:25:19 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:115
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:115
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def addTransaction(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addtransaction")
    }
  
    // @LINE:80
    def deleteFromCart(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletefromcart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:28
    def getProductsByCat(category:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("category", category)))
    }
  
    // @LINE:30
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:50
    def promotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "promotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:103
    def addDelivery(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adddelivery")
    }
  
    // @LINE:94
    def addPayment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpayment")
    }
  
    // @LINE:29
    def getProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:66
    def addUserHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduserhandle")
    }
  
    // @LINE:64
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:89
    def deleteTransaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletetransaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:76
    def addToCartHandle(): Call = {
    
      () match {
      
        // @LINE:76
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "addtocarthandle")
      
      }
    
    }
  
    // @LINE:27
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:13
    def updateCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:96
    def addPaymentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpaymenthandle")
    }
  
    // @LINE:26
    def updateProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateproducthandle")
    }
  
    // @LINE:88
    def updateTransactionHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatetransactionhandle")
    }
  
    // @LINE:35
    def addOpinionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addopinionhandle")
    }
  
    // @LINE:106
    def updateDelivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatedelivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:67
    def updateUser(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateuser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:36
    def updateOpinion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:108
    def deleteDelivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletedelivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:70
    def user(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:38
    def updateOpinionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateopinionhandle")
    }
  
    // @LINE:23
    def addProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproducthandle")
    }
  
    // @LINE:39
    def deleteOpinion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:58
    def updateCommentHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecommenthandle")
    }
  
    // @LINE:54
    def addComment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcomment")
    }
  
    // @LINE:40
    def opinions(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:105
    def addDeliveryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adddeliveryhandle")
    }
  
    // @LINE:100
    def payment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:86
    def addTransactionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addtransactionhandle")
    }
  
    // @LINE:45
    def addPromotionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpromotionhandle")
    }
  
    // @LINE:10
    def addCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcategory")
    }
  
    // @LINE:24
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateproduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:59
    def deleteComment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletecomment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:87
    def updateTransaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatetransaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:49
    def deletePromotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletepromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:56
    def addCommentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcommenthandle")
    }
  
    // @LINE:48
    def updatePromotionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatepromotionhandle")
    }
  
    // @LINE:71
    def users(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:91
    def transactions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transactions")
    }
  
    // @LINE:81
    def cart(userId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("userId", userId)))
    }
  
    // @LINE:69
    def deleteUser(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteuser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:12
    def addCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategoryhandle")
    }
  
    // @LINE:18
    def getCategorys(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:60
    def comment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:46
    def updatePromotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:21
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:33
    def addOpinion(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:15
    def updateCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatecategoryhandle")
    }
  
    // @LINE:97
    def updatePayment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:51
    def promotions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "promotions")
    }
  
    // @LINE:43
    def addPromotion(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:68
    def updateUserHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateuserhandle")
    }
  
    // @LINE:109
    def delivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:90
    def transaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:99
    def deletePayment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:17
    def getCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:61
    def comments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comments")
    }
  
    // @LINE:74
    def addToCart(id:Int): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:74
        case (id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "addtocart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
      
      }
    
    }
  
    // @LINE:98
    def updatePaymentHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepaymenthandle")
    }
  
    // @LINE:16
    def deleteCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletecategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:107
    def updateDeliveryHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatedeliveryhandle")
    }
  
    // @LINE:57
    def updateComment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecomment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:118
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:118
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:113
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:113
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }


}
