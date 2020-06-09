
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import controllers.AssetsFinder
/*5.2*/import forms.TotpRecoveryForm.Data

/**/
class totpRecovery @javax.inject.Inject() /*7.6*/()(implicit assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Data],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(totpRecoveryForm: Form[Data])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*10.6*/implicitFieldConstructor/*10.30*/ = {{
        b4.vertical.fieldConstructor()
    }};
Seq[Any](format.raw/*9.1*/("""
    """),format.raw/*12.6*/("""

"""))
      }
    }
  }

  def render(totpRecoveryForm:Form[Data],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(totpRecoveryForm)(request,messages)

  def f:((Form[Data]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (totpRecoveryForm) => (request,messages) => apply(totpRecoveryForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-09T17:59:26.964
                  SOURCE: /home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project_silhouette/app/views/totpRecovery.scala.html
                  HASH: 51124027d4adc9e4d16989b25bbd2bbca5b25751
                  MATRIX: 28->1|61->28|98->59|139->94|178->127|268->168|619->203|790->293|823->317|902->287|934->367
                  LINES: 4->1|5->2|6->3|7->4|8->5|11->7|14->8|18->10|18->10|21->9|22->12
                  -- GENERATED --
              */
          