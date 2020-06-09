
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import controllers.AssetsFinder
/*5.2*/import forms.SignUpForm.Data

/**/
class signUp @javax.inject.Inject() /*7.6*/()(implicit assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Data],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(signUpForm: Form[Data])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*10.2*/implicitFieldConstructor/*10.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*9.1*/("""
"""),format.raw/*10.64*/("""

"""))
      }
    }
  }

  def render(signUpForm:Form[Data],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(signUpForm)(request,messages)

  def f:((Form[Data]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (signUpForm) => (request,messages) => apply(signUpForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-09T17:59:26.974
                  SOURCE: /home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project_silhouette/app/views/signUp.scala.html
                  HASH: 3611a267eca240c4c179fe5790d9fabc2a2004c5
                  MATRIX: 28->1|61->28|98->59|139->94|178->127|256->162|607->197|772->277|805->301|872->275|901->339
                  LINES: 4->1|5->2|6->3|7->4|8->5|11->7|14->8|18->10|18->10|19->9|20->10
                  -- GENERATED --
              */
          