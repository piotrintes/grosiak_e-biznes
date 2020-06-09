
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import play.twirl.api.Html
/*4.2*/import controllers.AssetsFinder
/*5.2*/import views.html.helper._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,Option[models.User],Html,RequestHeader,Messages,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(title: String, user: Option[models.User] = None)(content: Html)(implicit request: RequestHeader, messages: Messages, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any]()
      }
    }
  }

  def render(title:String,user:Option[models.User],content:Html,request:RequestHeader,messages:Messages,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)(request,messages,assets)

  def f:((String,Option[models.User]) => (Html) => (RequestHeader,Messages,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => (request,messages,assets) => apply(title,user)(content)(request,messages,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-09T18:02:46.234
                  SOURCE: /home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project_silhouette/app/views/main.scala.html
                  HASH: 1daeed939f64cff44d536d1ca67368b17df97f53
                  MATRIX: 28->1|65->32|106->67|140->95|179->128|570->157
                  LINES: 4->1|5->2|6->3|7->4|8->5|13->7
                  -- GENERATED --
              */
          