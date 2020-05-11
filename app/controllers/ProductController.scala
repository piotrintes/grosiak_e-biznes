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

  def getProduct(id: Long): Action[AnyContent] = Action.async { implicit request =>
    val produkt = productsRepo.getByIdOption(id)
    produkt.map(product => Ok(Json.toJson(product)))
  }

  def delete(id: Long): Action[AnyContent] = Action {
    productsRepo.delete(id)
    Redirect("/products")
  }

  def updateProduct(id: Long): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    var categ:Seq[Category] = Seq[Category]()
    val categories = categoryRepo.list().onComplete{
      case Success(cat) => categ = cat
      case Failure(_) => print("fail")
    }

    val produkt = productsRepo.getById(id)
    produkt.map(product => {
      val prodForm = updateProductForm.fill(UpdateProductForm(product.id, product.name, product.description,product.category,product.price))
      Ok(views.html.productupdate(prodForm, categ))
    })
  }

  def updateProductHandle = Action.async { implicit request =>
    var categ:Seq[Category] = Seq[Category]()
    val categories = categoryRepo.list().onComplete{
      case Success(cat) => categ = cat
      case Failure(_) => print("fail")
    }

    updateProductForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.productupdate(errorForm, categ))
        )
      },
      product => {
        productsRepo.update(product.id, Product(product.id, product.name, product.description, product.category, product.price)).map { _ =>
          Redirect(routes.HomeController.updateProduct(product.id)).flashing("success" -> "product updated")
        }
      }
    )

  }


  def addProduct: Action[AnyContent] = Action.async {implicit request: MessagesRequest[AnyContent] =>
    val categories = categoryRepo.list()
    categories.map (cat => Ok(views.html.productadd(productForm, cat)))
  }

  def addProductHandle = Action.async { implicit request =>
    var categ:Seq[Category] = Seq[Category]()
    val categories = categoryRepo.list().onComplete{
      case Success(cat) => categ = cat
      case Failure(_) => print("fail")
    }

    productForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.productadd(errorForm, categ))
        )
      },
      product => {
        productsRepo.create(product.name, product.description, product.category, product.price).map { _ =>
          Redirect(routes.HomeController.addProduct()).flashing("success" -> "product.created")
        }
      }
    )

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
    categoryForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        categoryRepo.create(data.name).asInstanceOf[Future[Result]]
      })
  }

  def updateCategory(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val data = categoryRepo.getById(id)
    data.map(category => {
      val form = updateCategoryForm.fill(UpdateCategoryForm(category.id, category.name))
      Ok(views.html.index("Your new application is ready."))
    })
  }

  def updateCategoryHandle = Action.async { implicit request =>
    updateCategoryForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        categoryRepo.update(data.id, Category(data.id, data.name)).asInstanceOf[Future[Result]]
      })
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
    opinionForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        prOpinionRepo.create(data.user,data.product,data.stars,data.text).asInstanceOf[Future[Result]]
      })
  }
  def updateOpinion(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val data = prOpinionRepo.getById(id)
    data.map(opinion => {
      val form = updateOpinionForm.fill(UpdatePrOpinionForm(opinion.id,opinion.user,opinion.product,opinion.stars,opinion.text))
      Ok(views.html.index("Your new application is ready."))
    })
  }
  def updateOpinionHandle = Action.async { implicit request =>
    updateOpinionForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        prOpinionRepo.update(data.id, PrOpinion(data.id,data.user,data.product,data.stars,data.text)).asInstanceOf[Future[Result]]
      })
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
    promotionForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        promotionRepo.create(data.product,data.discount).asInstanceOf[Future[Result]]
      })
  }
  def updatePromotion(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val data_ = promotionRepo.getById(id)
    data_.map(data => {
      val form = updatepromotionForm.fill(UpdatePromotionForm(data.id, data.product, data.discount))
      Ok(views.html.index("Your new application is ready."))
    })
  }
  def updatePromotionHandle = Action.async { implicit request =>
    updatepromotionForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        promotionRepo.update(data.id, Promotion(data.id, data.product, data.discount)).asInstanceOf[Future[Result]]
      })
  }
  def deletePromotion(id: Int) = Action {
    promotionRepo.delete(id)
    Redirect("/promotions")
  }
  def promotion(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val promotion = promotionRepo.getByIdOption(id)
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
    commentForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        commentRepo.create(data.user,data.stars,data.text).asInstanceOf[Future[Result]]
      })
  }
  def updateComment(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val data_ = commentRepo.getById(id)
    data_.map(data => {
      val form = updateCommentForm.fill(UpdateCommentForm(data.id, data.user,data.stars,data.text))
      Ok(views.html.index("Your new application is ready."))
    })
  }
  def updateCommentHandle = Action.async { implicit request =>
    updateCommentForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        commentRepo.update(data.id, Comment(data.id, data.user,data.stars,data.text)).asInstanceOf[Future[Result]]
      })
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
      "name" -> nonEmptyText,
      "surname" -> nonEmptyText,
      "email" -> nonEmptyText,
      "admin" -> boolean,
    )(CreateUserForm.apply)(CreateUserForm.unapply)
  }

  val updateUserForm: Form[UpdateUserForm] = Form {
    mapping(
      "id" -> number,
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
    userForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        userRepo.create(data.name,data.surname,data.email,data.admin).asInstanceOf[Future[Result]]
      })
  }
  def updateUser(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val data_ = userRepo.getById(id)
    data_.map(data => {
      val form = updateUserForm.fill(UpdateUserForm(data.id, data.name,data.surname,data.email,data.admin))
      Ok(views.html.index("Your new application is ready."))
    })
  }
  def updateUserHandle = Action.async { implicit request =>
    updateUserForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        userRepo.update(data.id, User(data.id,data.name,data.surname,data.email,data.admin)).asInstanceOf[Future[Result]]
      })
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
    updateCartForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        cartRepo.create(data.user,data.product,data.count).asInstanceOf[Future[Result]]
      })
  }
  def updateCart(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val data_ = cartRepo.getById(id)
    data_.map(data => {
      val form = updateCartForm.fill(UpdateCartForm(data.id, data.user,data.product,data.count))
      Ok(views.html.index("Your new application is ready."))
    })
  }
  def updateCartHandle = Action.async { implicit request =>
    updateCartForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        cartRepo.update(data.id, Cart(data.id, data.user,data.product,data.count)).asInstanceOf[Future[Result]]
      })
  }
  def deleteFromCart(id: Int) = Action {
    cartRepo.delete(id)
    Redirect("/cart")
  }
  def cart: Action[AnyContent] = Action.async { implicit request =>
    val cart = cartRepo.list()
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
    paymentForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        paymentRepo.create(data.transaction,data.date).asInstanceOf[Future[Result]]
      })
  }
  def updatePayment(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val data_ = paymentRepo.getById(id)
    data_.map(data => {
      val form = updatePaymentForm.fill(UpdatePaymentForm(data.id, data.transaction,data.date))
      Ok(views.html.index("Your new application is ready."))
    })
  }
  def updatePaymentHandle = Action.async { implicit request =>
    updatePaymentForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        paymentRepo.update(data.id, Payment(data.id, data.transaction,data.date)).asInstanceOf[Future[Result]]
      })
  }
  def deletePayment(id: Int) = Action {
    paymentRepo.delete(id)
    Redirect("/")
  }
  def payment(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val payment = paymentRepo.getByIdOption(id)
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
    transactionForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        transactionRepo.create(data.user,data.product,data.count,data.price,data.date).asInstanceOf[Future[Result]]
      })
  }
  def updateTransaction(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val data_ = transactionRepo.getById(id)
    data_.map(data => {
      val form = updateTransactionForm.fill(UpdateTransactionForm(data.id, data.user,data.product,data.count,data.price,data.date))
      Ok(views.html.index("Your new application is ready."))
    })
  }
  def updateTransactionHandle = Action.async { implicit request =>
    updateTransactionForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        transactionRepo.update(data.id, Transaction(data.id, data.user,data.product,data.count,data.price,data.date)).asInstanceOf[Future[Result]]
      })
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
    //Ok(views.html.index("Your new application is ready."))
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
    deliveryForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        deliveryRepo.create(data.transaction,data.date).asInstanceOf[Future[Result]]
      })
  }
  def updateDelivery(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val data_ = deliveryRepo.getById(id)
    data_.map(data => {
      val form = updateDeliveryForm.fill(UpdateDeliveryForm(data.id, data.transaction,data.date))
      Ok(views.html.index("Your new application is ready."))
    })
  }
  def updateDeliveryHandle = Action.async { implicit request =>
    updateDeliveryForm.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        Future.successful(Ok("Form submission with error: ${errorForm.errors}"))
      },
      data => {
        deliveryRepo.update(data.id, Delivery(data.id,data.transaction,data.date)).asInstanceOf[Future[Result]]
      })
  }
  def deleteDelivery(id: Int) = Action {
    deliveryRepo.delete(id)
    Redirect("/")
  }
  def delivery(id: Int): Action[AnyContent] = Action.async { implicit request =>
    val delivery = deliveryRepo.getByIdOption(id)
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

case class CreateUserForm(name: String, surname: String, email: String, admin: Boolean) {
}
case class UpdateUserForm(id: Int, name: String, surname: String, email: String, admin: Boolean)

