/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package scalate.layouts

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._
import org.fusesource.scalate.wikitext.PygmentizeHelpers._

object $_scalate_$default_ssp {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      implicit val context: _root_.org.fusesource.scalate.support.DummyRenderContext = $_scalate_$_context.attribute("context")
      import context._
      ;{
        val response: _root_.org.fusesource.scalate.support.DummyResponse = $_scalate_$_context.attributeOrElse("response", new _root_.org.fusesource.scalate.support.DummyResponse())
        
        
        ;{
          val body: String = $_scalate_$_context.attribute("body")
                     escapeMarkup = false 

          $_scalate_$_context << ( "<!DOCTYPE html>\n<html>\n<head>\n  <link href=\"" );
          $_scalate_$_context <<< (           uri("/theme/slides.css")
 );
          $_scalate_$_context << ( "\" rel=\"stylesheet\" type=\"text/css\" />\n  <link href=\"" );
          $_scalate_$_context <<< (           uri("/theme/pygmentize.css")
 );
          $_scalate_$_context << ( "\" rel=\"stylesheet\" type=\"text/css\" />\n</head>\n<body>\n  <article>\n    " );
          $_scalate_$_context <<< (            body 
 );
          $_scalate_$_context << ( "\n  </article>\n</body>\n</html>" );
        }
      }
    }
  }
}


class $_scalate_$default_ssp extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$default_ssp.$_scalate_$render(context)
}