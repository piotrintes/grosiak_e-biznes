
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import controllers.AssetsFinder
/*4.2*/import play.api.data._
/*5.2*/import forms.TotpSetupForm.Data
/*6.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpCredentials
/*7.2*/import com.mohiva.play.silhouette.impl.providers.GoogleTotpInfo

/**/
class home @javax.inject.Inject() /*9.6*/()(implicit assets: AssetsFinder) extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[models.User,Option[GoogleTotpInfo],Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(user: models.User, totpInfoOpt: Option[GoogleTotpInfo], totpDataOpt: Option[(Form[Data], GoogleTotpCredentials)] = None)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*12.2*/implicitFieldConstructor/*12.26*/ = {{
    b4.vertical.fieldConstructor()
}};
Seq[Any](format.raw/*11.1*/("""
"""))
      }
    }
  }

  def render(user:models.User,totpInfoOpt:Option[GoogleTotpInfo],totpDataOpt:Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,totpInfoOpt,totpDataOpt)(request,messages)

  def f:((models.User,Option[GoogleTotpInfo],Option[scala.Tuple2[Form[Data], GoogleTotpCredentials]]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,totpInfoOpt,totpDataOpt) => (request,messages) => apply(user,totpInfoOpt,totpDataOpt)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-09T18:02:18.529
                  SOURCE: /home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project_silhouette/app/views/home.scala.html
                  HASH: 12fabd45026d958f1765f8aa42a775e195bd703e
                  MATRIX: 28->1|65->32|106->67|145->100|175->124|214->157|292->229|403->299|835->334|1097->511|1130->535|1202->509
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|13->9|16->10|20->12|20->12|23->11
                  -- GENERATED --
              */
          