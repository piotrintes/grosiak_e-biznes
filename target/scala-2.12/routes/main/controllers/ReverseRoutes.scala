// @GENERATOR:play-routes-compiler
// @SOURCE:/home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/conf/routes
// @DATE:Thu Apr 30 21:09:17 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:97
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:97
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def cart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:69
    def addTransaction(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addtransaction")
    }
  
    // @LINE:65
    def deleteFromCart(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletefromcart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:25
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:41
    def promotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "promotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:86
    def addDelivery(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adddelivery")
    }
  
    // @LINE:78
    def addPayment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpayment")
    }
  
    // @LINE:24
    def getProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:53
    def addUserHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduserhandle")
    }
  
    // @LINE:52
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:73
    def deleteTransaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletetransaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:62
    def addToCartHandle(): Call = {
    
      () match {
      
        // @LINE:62
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "addtocarthandle")
      
      }
    
    }
  
    // @LINE:23
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:12
    def updateCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:79
    def addPaymentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpaymenthandle")
    }
  
    // @LINE:22
    def updateProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateproducthandle")
    }
  
    // @LINE:72
    def updateTransactionHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatetransactionhandle")
    }
  
    // @LINE:29
    def addOpinionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addopinionhandle")
    }
  
    // @LINE:88
    def updateDelivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatedelivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:54
    def updateUser(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateuser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:30
    def updateOpinion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:90
    def deleteDelivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletedelivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:57
    def user(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:31
    def updateOpinionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateopinionhandle")
    }
  
    // @LINE:20
    def addProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproducthandle")
    }
  
    // @LINE:32
    def deleteOpinion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:47
    def updateCommentHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecommenthandle")
    }
  
    // @LINE:44
    def addComment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcomment")
    }
  
    // @LINE:33
    def opinions(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:87
    def addDeliveryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adddeliveryhandle")
    }
  
    // @LINE:83
    def payment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:70
    def addTransactionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addtransactionhandle")
    }
  
    // @LINE:37
    def addPromotionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpromotionhandle")
    }
  
    // @LINE:10
    def addCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcategory")
    }
  
    // @LINE:21
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateproduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:48
    def deleteComment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletecomment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:71
    def updateTransaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatetransaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:40
    def deletePromotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletepromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:45
    def addCommentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcommenthandle")
    }
  
    // @LINE:39
    def updatePromotionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatepromotionhandle")
    }
  
    // @LINE:58
    def users(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:75
    def transactions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transactions")
    }
  
    // @LINE:56
    def deleteUser(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteuser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:11
    def addCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategoryhandle")
    }
  
    // @LINE:16
    def getCategorys(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:49
    def comment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:38
    def updatePromotion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:19
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:28
    def addOpinion(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:13
    def updateCategoryHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecategoryhandle")
    }
  
    // @LINE:80
    def updatePayment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:36
    def addPromotion(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:55
    def updateUserHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateuserhandle")
    }
  
    // @LINE:91
    def delivery(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:74
    def transaction(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:82
    def deletePayment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:15
    def getCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:61
    def addToCart(id:Int): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:61
        case (id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "addtocart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
      
      }
    
    }
  
    // @LINE:81
    def updatePaymentHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepaymenthandle")
    }
  
    // @LINE:14
    def deleteCategory(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletecategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:89
    def updateDeliveryHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatedeliveryhandle")
    }
  
    // @LINE:46
    def updateComment(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecomment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:100
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:100
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:95
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:95
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }


}
