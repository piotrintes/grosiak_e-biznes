package controllers

import javax.inject._
import models.{Cart, CartRepository, Category, CategoryRepository, Comment, CommentRepository, Delivery, DeliveryRepository, Payment, PaymentRepository, PrOpinion, PrOpinionRepository, Product, ProductRepository, Promotion, PromotionRepository, Transaction, TransactionRepository, User, UserRepository}
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}
import play.api.data.format.Formats._
import play.api.libs.json.Json
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(
                                productsRepo: ProductRepository, categoryRepo: CategoryRepository,
                                cartRepo: CartRepository, commentRepo: CommentRepository, deliveryRepo: DeliveryRepository,
                                paymentRepo: PaymentRepository, prOpinionRepo: PrOpinionRepository, promotionRepo: PromotionRepository,
                                transactionRepo: TransactionRepository, userRepo: UserRepository,
                                cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  val productForm: Form[CreateProductForm] = Form {
    mapping(
      "name" -> nonEmptyText,
      "description" -> nonEmptyText,
      "category" -> number,
      "price" -> of(doubleFormat),
    )(CreateProductForm.apply)(CreateProductForm.unapply)
  }

  val updateProductForm: Form[UpdateProductForm] = Form {
    mapping(
      "id" -> longNumber,
      "name" -> nonEmptyText,
      "description" -> nonEmptyText,
      "category" -> number,
      "price" -> of(doubleFormat),
    )(UpdateProductForm.apply)(UpdateProductForm.unapply)
  }

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def getProducts: Action[AnyContent] = Action.async { implicit request =>
    val produkty = productsRepo.list()
    produkty.map( products => Ok(Json.toJson(products)))
  }

  def getProductsByCat(category: Int): Action[AnyContent] = Action.async { implicit request =>
    val produkty = productsRepo.getByCategory(category)
    produkty.map( products => Ok(Json.toJson(products)))
  }

  def getProduct(id: Long): Action[AnyContent] = Action.async { implicit request =>
    val produkt = productsRepo.getByIdOption(id)
    produkt.map(product => Ok(Json.toJson(product)))
  }

  def delete(id: Long): Action[AnyContent] = Action {
    productsRepo.delete(id)
    Redirect("/products")
  }

  def updateProduct(id: Long): Action[AnyContent] = Action.async { implicit request =>
    val produkt = productsRepo.getByIdOption(id)
    produkt.map(product => Ok(Json.toJson(product)))
  }

  def updateProductHandle = Action.async { implicit request =>
    val id = request.body.asJson.get("id").as[Long]
    val name = request.body.asJson.get("name").as[String]
    val description = request.body.asJson.get("description").as[String]
    val category = request.body.asJson.get("category").as[Int]
    val price = request.body.asJson.get("price").as[Double]

    productsRepo.update(id, Product(id,name,description,category,price)).map { product =>
      Ok(Json.toJson(Product(id,name,description,category,price)))
    }
  }


  def addProduct: Action[AnyContent] = Action.async {implicit request: MessagesRequest[AnyContent] =>
    val categories = categoryRepo.list()
    categories.map (cat => Ok(views.html.productadd(productForm, cat)))
  }

  def addProductHandle = Action.async { implicit request =>
    val name = request.body.asJson.get("name").as[String]
    val description = request.body.asJson.get("description").as[String]
    val category = request.body.asJson.get("category").as[Int]
    val price = request.body.asJson.get("price").as[Double]

    productsRepo.create(name,description,category,price).map { product =>
      Ok(Json.toJson(product))
    }
  }

  val categoryForm: Form[CreateCategoryForm] = Form {
    mapping(
      "name" -> nonEmptyText,
    )(CreateCategoryForm.apply)(CreateCategoryForm.unapply)
  }

  val updateCategoryForm: Form[UpdateCategoryForm] = Form {
    mapping(
      "id" -> number,
      "name" -> nonEmptyText,
    )(UpdateCategoryForm.apply)(UpdateCategoryForm.unapply)
  }

  def addCategory = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def addCategoryHandle = Action.async { implicit request =>
    val name = request.body.asJson.get("name").as[String]

    categoryRepo.create(name).map { category =>
      Ok(Json.toJson(category))
    }
  }

  def updateCategory(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val cat = categoryRepo.getByIdOption(id)
    cat.map(category => Ok(Json.toJson(category)))
  }

  def updateCategoryHandle = Action.async { implicit request =>
    val id = request.body.asJson.get("id").as[Int]
    val name = request.body.asJson.get("name").as[String]

    categoryRepo.update(id,Category(id,name)).map { category =>
      Ok(Json.toJson(Category(id,name)))
    }
  }
  def deleteCategory(id: Int) = Action {
    categoryRepo.delete(id)
    Redirect("/categorys")
  }
  def getCategory(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val cat = categoryRepo.getByIdOption(id)
    cat.map(category => Ok(Json.toJson(category)))
  }
  def getCategorys: Action[AnyContent] = Action.async { implicit request =>
    val cat = categoryRepo.list()
    cat.map( categories => Ok(Json.toJson(categories)))
  }


  val opinionForm: Form[CreatePrOpinionForm] = Form {
    mapping(
      "user" -> number,
      "product" -> longNumber,
      "stars" -> number,
      "name" -> nonEmptyText,
    )(CreatePrOpinionForm.apply)(CreatePrOpinionForm.unapply)
  }

  val updateOpinionForm: Form[UpdatePrOpinionForm] = Form {
    mapping(
      "id" -> number,
      "user" -> number,
      "product" -> longNumber,
      "stars" -> number,
      "text" -> nonEmptyText,
    )(UpdatePrOpinionForm.apply)(UpdatePrOpinionForm.unapply)
  }

  def addOpinion(productid: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def addOpinionHandle = Action.async { implicit request =>
    val user = request.body.asJson.get("user").as[Int]
    val product = request.body.asJson.get("product").as[Long]
    val stars = request.body.asJson.get("stars").as[Int]
    val text = request.body.asJson.get("text").as[String]

    prOpinionRepo.create(user,product,stars,text).map { opinion =>
      Ok(Json.toJson(opinion))
    }
  }
  def updateOpinion(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val op = prOpinionRepo.getByIdOption(id)
    op.map(opinion => Ok(Json.toJson(opinion)))
  }
  def updateOpinionHandle = Action.async { implicit request =>
    val id = request.body.asJson.get("id").as[Int]
    val user = request.body.asJson.get("user").as[Int]
    val product = request.body.asJson.get("product").as[Long]
    val stars = request.body.asJson.get("stars").as[Int]
    val text = request.body.asJson.get("text").as[String]

    prOpinionRepo.update(id,PrOpinion(id,user,product,stars,text)).map { opinion =>
      Ok(Json.toJson(PrOpinion(id,user,product,stars,text)))
    }
  }
  def deleteOpinion(id: Int) = Action {
    prOpinionRepo.delete(id)
    Redirect("/opinions")
  }
  def opinions(productid: Long) = Action.async { implicit request =>
    val opi = prOpinionRepo.list(productid)
    opi.map( prOpinions => Ok(Json.toJson(prOpinions)))
    //Ok(views.html.index("Your new application is ready."))
  }



  val promotionForm: Form[CreatePromotionForm] = Form {
    mapping(
      "product" -> longNumber,
      "discount" -> number,
    )(CreatePromotionForm.apply)(CreatePromotionForm.unapply)
  }

  val updatepromotionForm: Form[UpdatePromotionForm] = Form {
    mapping(
      "id" -> number,
      "product" -> longNumber,
      "discount" -> number,
    )(UpdatePromotionForm.apply)(UpdatePromotionForm.unapply)
  }

  def addPromotion(productid: Long) = Action {
    val pro = promotionRepo.list()
    //pro.map( promotions => Ok(views.html.promotions(promotions)))
    Ok(views.html.index("Your new application is ready."))
  }
  def addPromotionHandle = Action.async { implicit request =>
    val product = request.body.asJson.get("product").as[Long]
    val discount = request.body.asJson.get("discount").as[Int]

    promotionRepo.create(product,discount).map { promotion =>
      Ok(Json.toJson(promotion))
    }
  }
  def updatePromotion(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val promotion = promotionRepo.getByIdOption(id)
    promotion.map(promotion => Ok(Json.toJson(promotion)))
  }
  def updatePromotionHandle = Action.async { implicit request =>
    val id = request.body.asJson.get("id").as[Int]
    val product = request.body.asJson.get("product").as[Long]
    val discount = request.body.asJson.get("discount").as[Int]

    promotionRepo.update(id, Promotion(id, product, discount)).map { promotion =>
      Ok(Json.toJson(Promotion(id, product, discount)))
    }
  }

  def deletePromotion(id: Int) = Action {
    promotionRepo.delete(id)
    Redirect("/promotions")
  }
  def promotion(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val promotion = promotionRepo.getByIdOption(id)
    promotion.map(promotion => Ok(Json.toJson(promotion)))
  }
  def promotionpr(id: Long): Action[AnyContent] = Action.async { implicit request =>
    val promotion = promotionRepo.getByProductId(id)
    promotion.map(promotion => Ok(Json.toJson(promotion)))
  }
  def promotions = Action.async { implicit request =>
    val opi = promotionRepo.list()
    opi.map( promotions => Ok(Json.toJson(promotions)))
    //Ok(views.html.index("Your new application is ready."))
  }


  val commentForm: Form[CreateCommentForm] = Form {
    mapping(
      "user" -> number,
      "stars" -> number,
      "text" -> nonEmptyText,
    )(CreateCommentForm.apply)(CreateCommentForm.unapply)
  }

  val updateCommentForm: Form[UpdateCommentForm] = Form {
    mapping(
      "id" -> number,
      "user" -> number,
      "stars" -> number,
      "text" -> nonEmptyText,
    )(UpdateCommentForm.apply)(UpdateCommentForm.unapply)
  }

  def addComment = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def addCommentHandle = Action.async { implicit request =>
    val user = request.body.asJson.get("user").as[Int]
    val stars = request.body.asJson.get("stars").as[Int]
    val text = request.body.asJson.get("text").as[String]

    commentRepo.create(user,stars,text).map { comment =>
      Ok(Json.toJson(comment))
    }
  }
  def updateComment(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val comment = commentRepo.getByIdOption(id)
    comment.map(comment => Ok(Json.toJson(comment)))
  }
  def updateCommentHandle = Action.async { implicit request =>
    val id = request.body.asJson.get("id").as[Int]
    val user = request.body.asJson.get("user").as[Int]
    val stars = request.body.asJson.get("stars").as[Int]
    val text = request.body.asJson.get("text").as[String]

    commentRepo.update(id, Comment(id,user,stars,text)).map { comment =>
      Ok(Json.toJson(Comment(id,user,stars,text)))
    }
  }
  def deleteComment(id: Int) = Action {
    commentRepo.delete(id)
    Redirect("/comments")
  }
  def comment(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val comment = commentRepo.getByIdOption(id)
    comment.map(comment => Ok(Json.toJson(comment)))
  }
  def comments: Action[AnyContent] = Action.async { implicit request =>
    val com = commentRepo.list()
    com.map( comments => Ok(Json.toJson(comments)))
    //Ok(views.html.index("Your new application is ready."))
  }


  val userForm: Form[CreateUserForm] = Form {
    mapping(
      "usrName" -> nonEmptyText,
      "name" -> nonEmptyText,
      "surname" -> nonEmptyText,
      "email" -> nonEmptyText,
      "admin" -> boolean,
    )(CreateUserForm.apply)(CreateUserForm.unapply)
  }

  val updateUserForm: Form[UpdateUserForm] = Form {
    mapping(
      "id" -> number,
      "usrName" -> nonEmptyText,
      "name" -> nonEmptyText,
      "surname" -> nonEmptyText,
      "email" -> nonEmptyText,
      "admin" -> boolean,
    )(UpdateUserForm.apply)(UpdateUserForm.unapply)
  }
  def addUser = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def addUserHandle = Action.async { implicit request =>
    val usrName = request.body.asJson.get("usrName").as[String]
    val name = request.body.asJson.get("name").as[String]
    val surname = request.body.asJson.get("surname").as[String]
    val email = request.body.asJson.get("email").as[String]
    val admin = request.body.asJson.get("admin").as[Boolean]

    userRepo.create(usrName,name,surname,email,admin).map { user =>
      Ok(Json.toJson(user))
    }
  }
  def updateUser(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val user = userRepo.getByIdOption(id)
    user.map(user => Ok(Json.toJson(user)))
  }
  def updateUserHandle = Action.async { implicit request =>
    val id = request.body.asJson.get("id").as[Int]
    val usrName = request.body.asJson.get("usrName").as[String]
    val name = request.body.asJson.get("name").as[String]
    val surname = request.body.asJson.get("surname").as[String]
    val email = request.body.asJson.get("email").as[String]
    val admin = request.body.asJson.get("admin").as[Boolean]

    userRepo.update(id,User(id,usrName,name,surname,email,admin)).map { user =>
      Ok(Json.toJson(User(id,usrName,name,surname,email,admin)))
    }
  }
  def deleteUser(id: Int) = Action {
    userRepo.delete(id)
    Redirect("/users")
  }
  def user(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val user = userRepo.getByIdOption(id)
    user.map(user => Ok(Json.toJson(user)))
  }
  def users = Action.async { implicit request =>
    val usr = userRepo.list()
    usr.map( users => Ok(Json.toJson(users)))
    //Ok(views.html.index("Your new application is ready."))
  }


  val cartForm: Form[CreateCartForm] = Form {
    mapping(
      "user" -> number,
      "product" -> longNumber,
      "count" -> number,
    )(CreateCartForm.apply)(CreateCartForm.unapply)
  }

  val updateCartForm: Form[UpdateCartForm] = Form {
    mapping(
      "id" -> number,
      "user" -> number,
      "product" -> longNumber,
      "count" -> number,
    )(UpdateCartForm.apply)(UpdateCartForm.unapply)
  }

  def addToCart(id: Int) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def addToCartHandle = Action.async { implicit request =>
    val user = request.body.asJson.get("user").as[Int]
    val product = request.body.asJson.get("product").as[Long]
    val count = request.body.asJson.get("count").as[Int]

    cartRepo.create(user,product,count).map { cart =>
      Ok(Json.toJson(cart))
    }
  }
  def updateCart(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val cart = cartRepo.list()
    cart.map( cart => Ok(Json.toJson(cart)))
  }
  def updateCartHandle = Action.async { implicit request =>
    val id = request.body.asJson.get("id").as[Int]
    val user = request.body.asJson.get("user").as[Int]
    val product = request.body.asJson.get("product").as[Long]
    val count = request.body.asJson.get("count").as[Int]

    cartRepo.update(id,Cart(id,user,product,count)).map { cart =>
      Ok(Json.toJson(Cart(id,user,product,count)))
    }
  }
  def deleteFromCart(id: Int) = Action {
    cartRepo.delete(id)
    Redirect("/cart")
  }
  def cart(userID: Int): Action[AnyContent] = Action.async { implicit request =>
    val cart = cartRepo.list(userID)
    cart.map( cart => Ok(Json.toJson(cart)))
    //Ok(views.html.index("Your new application is ready."))
  }


  val paymentForm: Form[CreatePaymentForm] = Form {
    mapping(
      "transaction" -> number,
      "date" -> nonEmptyText,
    )(CreatePaymentForm.apply)(CreatePaymentForm.unapply)
  }

  val updatePaymentForm: Form[UpdatePaymentForm] = Form {
    mapping(
      "id" -> number,
      "transaction" -> number,
      "date" -> nonEmptyText,
    )(UpdatePaymentForm.apply)(UpdatePaymentForm.unapply)
  }

  def addPayment = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def addPaymentHandle = Action.async { implicit request =>
    val transaction = request.body.asJson.get("transaction").as[Int]
    val date = request.body.asJson.get("date").as[String]

    paymentRepo.create(transaction,date).map { payment =>
      Ok(Json.toJson(payment))
    }
  }
  def updatePayment(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val payment = paymentRepo.getByIdOption(id)
    payment.map(payment => Ok(Json.toJson(payment)))
  }
  def updatePaymentHandle = Action.async { implicit request =>
    val id = request.body.asJson.get("id").as[Int]
    val transaction = request.body.asJson.get("transaction").as[Int]
    val date = request.body.asJson.get("date").as[String]

    paymentRepo.update(id,Payment(id,transaction,date)).map { payment =>
      Ok(Json.toJson(Payment(id,transaction,date)))
    }
  }
  def deletePayment(id: Int) = Action {
    paymentRepo.delete(id)
    Redirect("/")
  }
  def payment(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val payment = paymentRepo.getByIdOption(id)
    payment.map(payment => Ok(Json.toJson(payment)))
  }
  def paymentTrans(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val payment = paymentRepo.getByTIdOption(id)
    payment.map(payment => Ok(Json.toJson(payment)))
  }


  val transactionForm: Form[CreateTransactionForm] = Form {
    mapping(
      "user" -> number,
      "product" -> longNumber,
      "count" -> number,
      "price" -> of(doubleFormat),
      "date" -> nonEmptyText,
    )(CreateTransactionForm.apply)(CreateTransactionForm.unapply)
  }

  val updateTransactionForm: Form[UpdateTransactionForm] = Form {
    mapping(
      "id" -> number,
      "user" -> number,
      "product" -> longNumber,
      "count" -> number,
      "price" -> of(doubleFormat),
      "date" -> nonEmptyText,
    )(UpdateTransactionForm.apply)(UpdateTransactionForm.unapply)
  }

  def addTransaction = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def addTransactionHandle = Action.async { implicit request =>
    val user = request.body.asJson.get("user").as[Int]
    val product = request.body.asJson.get("product").as[Long]
    val count = request.body.asJson.get("count").as[Int]
    val price = request.body.asJson.get("price").as[Double]
    val date = request.body.asJson.get("date").as[String]

    transactionRepo.create(user,product,count,price,date).map { transaction =>
      Ok(Json.toJson(transaction))
    }
  }
  def updateTransaction(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val transaction = transactionRepo.getByIdOption(id)
    transaction.map(transaction => Ok(Json.toJson(transaction)))
  }
  def updateTransactionHandle = Action.async { implicit request =>
    val id = request.body.asJson.get("id").as[Int]
    val user = request.body.asJson.get("user").as[Int]
    val product = request.body.asJson.get("product").as[Long]
    val count = request.body.asJson.get("count").as[Int]
    val price = request.body.asJson.get("price").as[Double]
    val date = request.body.asJson.get("date").as[String]

    transactionRepo.update(id,Transaction(id,user,product,count,price,date)).map { transaction =>
      Ok(Json.toJson(Transaction(id,user,product,count,price,date)))
    }
  }
  def deleteTransaction(id: Int) = Action {
    transactionRepo.delete(id)
    Redirect("/transactions")
  }
  def transaction(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val transaction = transactionRepo.getByIdOption(id)
    transaction.map(transaction => Ok(Json.toJson(transaction)))
  }
  def transactions(): Action[AnyContent] = Action.async { implicit request =>
    val trs = transactionRepo.list()
    trs.map( transactions => Ok(Json.toJson(transactions)))
  }
  def transactionsUsr(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val trs = transactionRepo.getByUser(id)
    trs.map( transactions => Ok(Json.toJson(transactions)))
  }


  val deliveryForm: Form[CreateDeliveryForm] = Form {
    mapping(
      "transaction" -> number,
      "date" -> nonEmptyText,
    )(CreateDeliveryForm.apply)(CreateDeliveryForm.unapply)
  }

  val updateDeliveryForm: Form[UpdateDeliveryForm] = Form {
    mapping(
      "id" -> number,
      "transaction" -> number,
      "date" -> nonEmptyText,
    )(UpdateDeliveryForm.apply)(UpdateDeliveryForm.unapply)
  }

  def addDelivery = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def addDeliveryHandle = Action.async { implicit request =>
    val transaction = request.body.asJson.get("transaction").as[Int]
    val date = request.body.asJson.get("date").as[String]

    deliveryRepo.create(transaction,date).map { delivery =>
      Ok(Json.toJson(delivery))
    }
  }
  def updateDelivery(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val delivery = deliveryRepo.getByIdOption(id)
    delivery.map(delivery => Ok(Json.toJson(delivery)))
  }
  def updateDeliveryHandle = Action.async { implicit request =>
    val id = request.body.asJson.get("id").as[Int]
    val transaction = request.body.asJson.get("transaction").as[Int]
    val date = request.body.asJson.get("date").as[String]

    deliveryRepo.update(id,Delivery(id,transaction,date)).map { delivery =>
      Ok(Json.toJson(Delivery(id,transaction,date)))
    }
  }
  def deleteDelivery(id: Int) = Action {
    deliveryRepo.delete(id)
    Redirect("/")
  }
  def delivery(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val delivery = deliveryRepo.getByIdOption(id)
    delivery.map(delivery => Ok(Json.toJson(delivery)))
  }
  def deliveryTrans(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val delivery = deliveryRepo.getByTIdOption(id)
    delivery.map(delivery => Ok(Json.toJson(delivery)))
  }
}

case class CreateProductForm(name: String, description: String, category: Int, price: Double) {
}
case class UpdateProductForm(id: Long, name: String, description: String, category: Int, price: Double)

case class CreateCategoryForm(name: String) {
}
case class UpdateCategoryForm(id: Int, name: String)

case class CreateCartForm(user: Int, product: Long, count: Int) {
}
case class UpdateCartForm(id: Int, user: Int, product: Long, count: Int)

case class CreateCommentForm(user: Int, stars: Int, text: String) {
}
case class UpdateCommentForm(id: Int, user: Int, stars: Int, text: String)

case class CreateDeliveryForm(transaction: Int, date: String) {
}
case class UpdateDeliveryForm(id: Int, transaction: Int, date: String)

case class CreatePaymentForm(transaction: Int, date: String) {
}
case class UpdatePaymentForm(id: Int, transaction: Int, date: String)

case class CreatePromotionForm(product: Long, discount: Int) {
}
case class UpdatePromotionForm(id: Int, product: Long, discount: Int)

case class CreatePrOpinionForm(user: Int, product: Long, stars: Int, text: String) {
}
case class UpdatePrOpinionForm(id: Int, user: Int, product: Long, stars: Int, text: String)

case class CreateTransactionForm(user: Int, product: Long, count: Int, price: Double, date: String) {
}
case class UpdateTransactionForm(id: Int, user: Int, product: Long, count: Int, price: Double, date: String)

case class CreateUserForm(usrName: String, name: String, surname: String, email: String, admin: Boolean) {
}
case class UpdateUserForm(id: Int, usrName: String, name: String, surname: String, email: String, admin: Boolean)

