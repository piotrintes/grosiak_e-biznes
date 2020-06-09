
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import controllers.AssetsFinder
/*5.2*/import b4.inline.fieldConstructor

/**/
class changePassword @javax.inject.Inject() /*7.6*/()(implicit assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[scala.Tuple2[String, String]],models.User,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(changePasswordForm: Form[(String, String)], user: models.User)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*10.2*/implicitFieldConstructor/*10.26*/ = {{ b4.vertical.fieldConstructor() }};
Seq[Any](format.raw/*9.1*/("""
"""))
      }
    }
  }

  def render(changePasswordForm:Form[scala.Tuple2[String, String]],user:models.User,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(changePasswordForm,user)(request,messages)

  def f:((Form[scala.Tuple2[String, String]],models.User) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (changePasswordForm,user) => (request,messages) => apply(changePasswordForm,user)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-09T18:00:25.087
                  SOURCE: /home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project_silhouette/app/views/changePassword.scala.html
                  HASH: 4312a9b7137a08602dab9a36741f311c1b9afa56
                  MATRIX: 28->1|61->28|98->59|139->94|178->127|269->167|656->202|860->321|893->345|960->319
                  LINES: 4->1|5->2|6->3|7->4|8->5|11->7|14->8|18->10|18->10|19->9
                  -- GENERATED --
              */
          