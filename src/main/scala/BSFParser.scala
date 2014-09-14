import scala.util.parsing.combinators._

object BSFParser extends RegexParsers {
    val dialogChars = """[\w!.,/;:#$%^&*()-]+""".r

    def dialogLine = charName ~ ":" ~ dialogChars
                   | "{" ~ shortName ~ "}" ~ ": " ~ dialogChars
    def narratorLine = "::: " ~ dialogCharsa
}