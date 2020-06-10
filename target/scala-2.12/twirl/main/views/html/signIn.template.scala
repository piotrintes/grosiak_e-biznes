
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import controllers.AssetsFinder
/*5.2*/import com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry
/*6.2*/import forms.SignInForm.Data

/**/
class signIn @javax.inject.Inject() /*8.6*/()(implicit assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Data],SocialProviderRegistry,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(signInForm: Form[Data], socialProviders: SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*11.2*/implicitFieldConstructor/*11.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*10.1*/("""
"""),format.raw/*11.64*/("""
"""))
      }
    }
  }

  def render(signInForm:Form[Data],socialProviders:SocialProviderRegistry,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(signInForm,socialProviders)(request,messages)

  def f:((Form[Data],SocialProviderRegistry) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (signInForm,socialProviders) => (request,messages) => apply(signInForm,socialProviders)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-09T20:28:43.498
                  SOURCE: /home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/app/views/signIn.scala.html
                  HASH: dbb5b417eac284899b1fb74333be763db999ccab
                  MATRIX: 28->1|61->28|98->59|139->94|178->127|257->200|335->235|709->270|915->391|948->415|1016->389|1045->453
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|12->8|15->9|19->11|19->11|20->10|21->11
                  -- GENERATED --
              */
          