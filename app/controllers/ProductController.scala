package controllers

import javax.inject._
import models.{CartRepository, Category, CategoryRepository, CommentRepository, DeliveryRepository, PaymentRepository, PrOpinionRepository, Product, ProductRepository, PromotionRepository, TransactionRepository, UserRepository}
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}
import play.api.data.format.Formats._
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
    produkty.map( products => Ok(views.html.products(products)))
  }

  def getProduct(id: Long): Action[AnyContent] = Action.async { implicit request =>
    val produkt = productsRepo.getByIdOption(id)
    produkt.map(product => product match {
      case Some(p) => Ok(views.html.product(p))
      case None => Redirect(routes.HomeController.getProducts())
    })
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
      //  id, product.name, product.description, product.category)
      //updateProductForm.fill(prodForm)
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


  def addProduct: Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
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
  def addCategoryHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateCategory(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateCategoryHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def deleteCategory(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def getCategory(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def getCategorys = Action {
    Ok(views.html.index("Your new application is ready."))
  }


  val opinionForm: Form[CreatePrOpinionForm] = Form {
    mapping(
      "product" -> number,
      "user" -> longNumber,
      "stars" -> number,
      "name" -> nonEmptyText,
    )(CreatePrOpinionForm.apply)(CreatePrOpinionForm.unapply)
  }

  val updateOpinionForm: Form[UpdatePrOpinionForm] = Form {
    mapping(
      "id" -> number,
      "product" -> number,
      "user" -> longNumber,
      "stars" -> number,
      "name" -> nonEmptyText,
    )(UpdatePrOpinionForm.apply)(UpdatePrOpinionForm.unapply)
  }

  def addOpinion(productid: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def addOpinionHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateOpinion(productid: Long, id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateOpinionHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def deleteOpinion(productid: Long, id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def opinions(productid: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
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
    Ok(views.html.index("Your new application is ready."))
  }
  def addPromotionHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updatePromotion(productid: Long, id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updatePromotionHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def deletePromotion(productid: Long, id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def promotion(productid: Long, id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }


  val commentForm: Form[CreateCommentForm] = Form {
    mapping(
      "user" -> number,
      "start" -> number,
      "text" -> nonEmptyText,
    )(CreateCommentForm.apply)(CreateCommentForm.unapply)
  }

  val updateCommentForm: Form[UpdateCommentForm] = Form {
    mapping(
      "id" -> number,
      "user" -> number,
      "start" -> number,
      "text" -> nonEmptyText,
    )(UpdateCommentForm.apply)(UpdateCommentForm.unapply)
  }

  def addComment = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def addCommentHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateComment(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateCommentHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def deleteComment(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def comment(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
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
  def addUserHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateUser(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateUserHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def deleteUser(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def user(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
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

  def addToCart(productid: Long, number: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def addToCartHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateCart(productid: Long, number: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def deleteFromCart(productid: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def cart = Action {
    Ok(views.html.index("Your new application is ready."))
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
  def addPaymentHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updatePayment(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updatePaymentHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def deletePayment(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def payment(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
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
  def addTransactionHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateTransaction(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateTransactionHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def deleteTransaction(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def transaction(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
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
  def addDeliveryHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateDelivery(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def updateDeliveryHandle = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def deleteDelivery(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def delivery(id: Long) = Action {
    Ok(views.html.index("Your new application is ready."))
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

