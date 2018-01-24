package fox.markdown

import fox.Options

import com.vladsch.flexmark.Extension
import com.vladsch.flexmark.formatter.internal.{Formatter}
import com.vladsch.flexmark.util.options.MutableDataHolder

// To be used later, it adds extensions to the formatter
class FoxFormatterExtension(options: Options) extends Formatter.FormatterExtension {
  override def rendererOptions(options: MutableDataHolder): Unit = ()
  override def extend(builder: Formatter.Builder): Unit = ()
}

object FoxFormatterExtension {
  def create(options: Options): Extension = new FoxFormatterExtension(options)
}
