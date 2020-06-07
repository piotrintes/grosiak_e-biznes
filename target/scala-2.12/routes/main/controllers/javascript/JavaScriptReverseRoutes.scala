// @GENERATOR:play-routes-compiler
// @SOURCE:/home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/conf/routes
// @DATE:Sun Jun 07 17:55:37 CEST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:129
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:129
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:124
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:124
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:92
    def addTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTransaction",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addtransaction"})
        }
      """
    )
  
    // @LINE:88
    def deleteFromCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteFromCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletefromcart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:35
    def getProductsByCat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProductsByCat",
      """
        function(category0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("category", category0))})
        }
      """
    )
  
    // @LINE:37
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:57
    def promotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.promotion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "promotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:113
    def addDelivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addDelivery",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adddelivery"})
        }
      """
    )
  
    // @LINE:103
    def addPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPayment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addpayment"})
        }
      """
    )
  
    // @LINE:110
    def paymentTrans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.paymentTrans",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentbyt/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:58
    def promotionpr: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.promotionpr",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "promotionpr/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:36
    def getProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:100
    def transactionsUsr: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.transactionsUsr",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactionsusr/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:74
    def addUserHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUserHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adduserhandle"})
        }
      """
    )
  
    // @LINE:72
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adduser"})
        }
      """
    )
  
    // @LINE:97
    def deleteTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteTransaction",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletetransaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:84
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
  
    // @LINE:34
    def getProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:20
    def updateCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:105
    def addPaymentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPaymentHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addpaymenthandle"})
        }
      """
    )
  
    // @LINE:33
    def updateProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproducthandle"})
        }
      """
    )
  
    // @LINE:96
    def updateTransactionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateTransactionHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatetransactionhandle"})
        }
      """
    )
  
    // @LINE:42
    def addOpinionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addOpinionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addopinionhandle"})
        }
      """
    )
  
    // @LINE:116
    def updateDelivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateDelivery",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatedelivery/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:75
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:43
    def updateOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateOpinion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateopinion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:118
    def deleteDelivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteDelivery",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletedelivery/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:78
    def user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.user",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:45
    def updateOpinionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateOpinionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateopinionhandle"})
        }
      """
    )
  
    // @LINE:30
    def addProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addproducthandle"})
        }
      """
    )
  
    // @LINE:46
    def deleteOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteOpinion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteopinion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:66
    def updateCommentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateCommentHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecommenthandle"})
        }
      """
    )
  
    // @LINE:62
    def addComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addComment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcomment"})
        }
      """
    )
  
    // @LINE:47
    def opinions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.opinions",
      """
        function(productid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "opinions/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productid", productid0))})
        }
      """
    )
  
    // @LINE:115
    def addDeliveryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addDeliveryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adddeliveryhandle"})
        }
      """
    )
  
    // @LINE:109
    def payment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.payment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:94
    def addTransactionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTransactionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addtransactionhandle"})
        }
      """
    )
  
    // @LINE:52
    def addPromotionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPromotionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addpromotionhandle"})
        }
      """
    )
  
    // @LINE:17
    def addCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategory"})
        }
      """
    )
  
    // @LINE:31
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:67
    def deleteComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteComment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletecomment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:95
    def updateTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateTransaction",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatetransaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:56
    def deletePromotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deletePromotion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletepromotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:64
    def addCommentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addCommentHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcommenthandle"})
        }
      """
    )
  
    // @LINE:55
    def updatePromotionHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePromotionHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepromotionhandle"})
        }
      """
    )
  
    // @LINE:79
    def users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.users",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:99
    def transactions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.transactions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactions"})
        }
      """
    )
  
    // @LINE:89
    def cart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.cart",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:77
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteuser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:120
    def deliveryTrans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deliveryTrans",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deliverybyt/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:19
    def addCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategoryhandle"})
        }
      """
    )
  
    // @LINE:25
    def getCategorys: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getCategorys",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
        }
      """
    )
  
    // @LINE:68
    def comment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.comment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:53
    def updatePromotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePromotion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepromotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:28
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addproduct"})
        }
      """
    )
  
    // @LINE:40
    def addOpinion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addOpinion",
      """
        function(productid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addopinion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productid", productid0))})
        }
      """
    )
  
    // @LINE:22
    def updateCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecategoryhandle"})
        }
      """
    )
  
    // @LINE:106
    def updatePayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepayment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:59
    def promotions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.promotions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "promotions"})
        }
      """
    )
  
    // @LINE:50
    def addPromotion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPromotion",
      """
        function(productid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addpromotion/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productid", productid0))})
        }
      """
    )
  
    // @LINE:76
    def updateUserHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateUserHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuserhandle"})
        }
      """
    )
  
    // @LINE:119
    def delivery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delivery",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delivery/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:98
    def transaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.transaction",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:108
    def deletePayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deletePayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletepayment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:24
    def getCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:69
    def comments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.comments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments"})
        }
      """
    )
  
    // @LINE:82
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
  
    // @LINE:107
    def updatePaymentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePaymentHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepaymenthandle"})
        }
      """
    )
  
    // @LINE:23
    def deleteCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletecategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:117
    def updateDeliveryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateDeliveryHandle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatedeliveryhandle"})
        }
      """
    )
  
    // @LINE:65
    def updateComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateComment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecomment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:126
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:126
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseSignUpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
  }


}
