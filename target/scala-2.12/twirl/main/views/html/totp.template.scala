
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import controllers.AssetsFinder
/*5.2*/import forms.TotpForm.Data
/*6.2*/import forms.TotpRecoveryForm
/*7.2*/import java.util.UUID

/**/
class totp @javax.inject.Inject() /*9.6*/()(implicit assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Data],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(totpForm: Form[Data])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*12.2*/implicitFieldConstructor/*12.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*11.1*/("""
"""),format.raw/*12.64*/("""
"""))
      }
    }
  }

  def render(totpForm:Form[Data],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(totpForm)(request,messages)

  def f:((Form[Data]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (totpForm) => (request,messages) => apply(totpForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-09T18:02:18.511
                  SOURCE: /home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project_silhouette/app/views/totp.scala.html
                  HASH: d5f2f32d5b70eaee0629a0969c627ceaca1cc0e3
                  MATRIX: 28->1|61->28|98->59|139->94|178->127|212->155|249->186|318->214|670->249|833->327|866->351|934->325|963->389
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|13->9|16->10|20->12|20->12|21->11|22->12
                  -- GENERATED --
              */
          