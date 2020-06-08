
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object categories extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categories: Seq[Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/for(category <- categories) yield /*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
  """),format.raw/*4.3*/("""<b>"""),_display_(/*4.7*/category/*4.15*/.name),format.raw/*4.20*/("""</b>
  <a href=""""),_display_(/*5.13*/controllers/*5.24*/.routes.HomeController.updateCategory(category.id)),format.raw/*5.74*/("""">Edit</a>
  <a href=""""),_display_(/*6.13*/controllers/*6.24*/.routes.HomeController.delete(category.id)),format.raw/*6.66*/("""">Delete</a>
  <br>
""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(categories:Seq[Category]): play.twirl.api.HtmlFormat.Appendable = apply(categories)

  def f:((Seq[Category]) => play.twirl.api.HtmlFormat.Appendable) = (categories) => apply(categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-08T19:00:40.585692
                  SOURCE: /home/piotr/Dokumenty/Studia/Stopień2/Rok1.5/Semestr2/E-Biznes/project/app/views/categories.scala.html
                  HASH: 6e46e86d6d54809551e90c772783fb9f5f9e268a
                  MATRIX: 741->1|862->29|889->31|931->58|970->60|999->63|1028->67|1044->75|1069->80|1112->97|1131->108|1201->158|1250->181|1269->192|1331->234|1381->255
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|28->4|29->5|29->5|29->5|30->6|30->6|30->6|32->8
                  -- GENERATED --
              */
          