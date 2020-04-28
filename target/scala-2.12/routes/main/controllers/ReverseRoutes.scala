// @GENERATOR:play-routes-compiler
// @SOURCE:/home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/conf/routes
// @DATE:Tue Apr 28 15:44:44 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:94
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:94
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def cart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:67
    def addTransaction(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addtransaction")
    }
  
    // @LINE:30
    def updateOpinion(productid:Long, id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:25
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:83
    def addDelivery(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adddelivery")
    }
  
    // @LINE:75
    def addPayment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpayment")
    }
  
    // @LINE:85
    def updateDelivery(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatedelivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:24
    def getProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:79
    def deletePayment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:53
    def addUserHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduserhandle")
    }
  
    // @LINE:80
    def payment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:52
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:61
    def addToCartHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addtocarthandle")
    }
  
    // @LINE:23
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:49
    def comment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:76
    def addPaymentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpaymenthandle")
    }
  
    // @LINE:38
    def updatePromotion(productid:Long, id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:22
    def updateProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateproducthandle")
    }
  
    // @LINE:70
    def updateTransactionHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatetransactionhandle")
    }
  
    // @LINE:29
    def addOpinionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addopinionhandle")
    }
  
    // @LINE:32
    def deleteOpinion(productid:Long, id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteopinion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:54
    def updateUser(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateuser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:57
    def user(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:60
    def addToCart(productid:Long, number:Long): Call = {
    
      (productid: @unchecked, number: @unchecked) match {
      
        // @LINE:60
        case (productid, number)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "addtocart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("number", number)))
      
      }
    
    }
  
    // @LINE:40
    def deletePromotion(productid:Long, id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletepromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:31
    def updateOpinionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateopinionhandle")
    }
  
    // @LINE:20
    def addProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproducthandle")
    }
  
    // @LINE:87
    def deleteDelivery(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletedelivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:47
    def updateCommentHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecommenthandle")
    }
  
    // @LINE:44
    def addComment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcomment")
    }
  
    // @LINE:63
    def deleteFromCart(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletefromcart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:33
    def opinions(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:84
    def addDeliveryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adddeliveryhandle")
    }
  
    // @LINE:56
    def deleteUser(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteuser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:68
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
  
    // @LINE:69
    def updateTransaction(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatetransaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:15
    def getCategory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:45
    def addCommentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcommenthandle")
    }
  
    // @LINE:39
    def updatePromotionHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatepromotionhandle")
    }
  
    // @LINE:77
    def updatePayment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:14
    def deleteCategory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletecategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:11
    def addCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategoryhandle")
    }
  
    // @LINE:72
    def transaction(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "transaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:16
    def getCategorys(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:48
    def deleteComment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletecomment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
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
  
    // @LINE:36
    def addPromotion(productid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpromotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)))
    }
  
    // @LINE:46
    def updateComment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecomment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:55
    def updateUserHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateuserhandle")
    }
  
    // @LINE:12
    def updateCategory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatecategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:71
    def deleteTransaction(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deletetransaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:78
    def updatePaymentHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatepaymenthandle")
    }
  
    // @LINE:88
    def delivery(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delivery/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:86
    def updateDeliveryHandle(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatedeliveryhandle")
    }
  
    // @LINE:41
    def promotion(productid:Long, id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "promotion/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productid", productid)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:97
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:97
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:92
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:92
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }


}
