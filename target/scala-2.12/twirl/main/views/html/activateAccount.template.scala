
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import play.twirl.api.Html
/*4.2*/import controllers.AssetsFinder

/**/
class activateAccount @javax.inject.Inject() /*6.6*/()(implicit assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(email: String)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""))
      }
    }
  }

  def render(email:String,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(email)(request,messages)

  def f:((String) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (email) => (request,messages) => apply(email)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-09T18:00:00.680
                  SOURCE: /home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project_silhouette/app/views/activateAccount.scala.html
                  HASH: a2e66e4c6660596bf02782185ef2141159ecbdff
                  MATRIX: 28->1|65->32|106->67|140->95|230->133|577->168|739->237
                  LINES: 4->1|5->2|6->3|7->4|10->6|13->7|18->8
                  -- GENERATED --
              */
          