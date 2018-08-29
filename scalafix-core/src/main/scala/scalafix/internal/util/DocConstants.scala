package scalafix.internal.util
import org.typelevel.paiges.Doc

object DocConstants {
  val `|` = Doc.char('|')
  val `&` = Doc.char('&')
  val `.` = Doc.char('.')
  val `#` = Doc.char('#')
  val `(` = Doc.char('(')
  val `)` = Doc.char(')')
  val `[` = Doc.char('[')
  val `]` = Doc.char(']')
  val `{` = Doc.char('{')
  val `}` = Doc.char('}')
  val `=>` = Doc.text("=>")
  val `()` = Doc.text("()")
  val `*` = Doc.char('*')
  val L = Doc.char('L')
  val f = Doc.char('f')
  val `:` = Doc.char(':')
  val `@` = Doc.char('@')
  val `val` = Doc.text("val")
  val `var` = Doc.text("var")
  val `def` = Doc.text("def")
  val `type` = Doc.text("type")
  val `null` = Doc.text("null")
  val `this` = Doc.text("this")
  val `super` = Doc.text("super")
  val `extends` = Doc.text("extends")
  val `with` = Doc.text("with")
  val `forSome` = Doc.text("forSome")
}
