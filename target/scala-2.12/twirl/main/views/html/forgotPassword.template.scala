
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import controllers.AssetsFinder

/**/
class forgotPassword @javax.inject.Inject() /*6.6*/()(implicit assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[String],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(forgotPasswordForm: Form[String])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*9.2*/implicitFieldConstructor/*9.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.64*/("""
"""))
      }
    }
  }

  def render(forgotPasswordForm:Form[String],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(forgotPasswordForm)(request,messages)

  def f:((Form[String]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (forgotPasswordForm) => (request,messages) => apply(forgotPasswordForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-09T20:28:43.516
                  SOURCE: /home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/app/views/forgotPassword.scala.html
                  HASH: b60bc93562fd2539df8fda38eebbfaa3e40417ec
                  MATRIX: 28->1|61->28|98->59|139->94|228->132|581->167|755->257|787->281|854->255|882->319
                  LINES: 4->1|5->2|6->3|7->4|10->6|13->7|17->9|17->9|18->8|19->9
                  -- GENERATED --
              */
          