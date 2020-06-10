
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import controllers.AssetsFinder
/*5.2*/import java.util.UUID

/**/
class resetPassword @javax.inject.Inject() /*7.6*/()(implicit assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[String],UUID,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(form: Form[String], token: UUID)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any]()
      }
    }
  }

  def render(form:Form[String],token:UUID,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(form,token)(request,messages)

  def f:((Form[String],UUID) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (form,token) => (request,messages) => apply(form,token)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-09T20:28:43.547
                  SOURCE: /home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/app/views/resetPassword.scala.html
                  HASH: 2e793bfba6297f8296bc000eabc4e28c9c56764b
                  MATRIX: 28->1|61->28|98->59|139->94|178->127|256->155|614->190
                  LINES: 4->1|5->2|6->3|7->4|8->5|11->7|14->8
                  -- GENERATED --
              */
          