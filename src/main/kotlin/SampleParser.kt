package parser

import antlr.StupidLangLexer
import antlr.StupidLangParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext

fun getParser(code: String): StupidLangParser {
    val lexer = StupidLangLexer(CharStreams.fromString(code))
    return StupidLangParser(CommonTokenStream(lexer))
}

fun visit(context: ParserRuleContext): String {
    return StupidVisitor().visit(context)

}

fun interpret(code: String): String {
    val parser = getParser(code)

    return visit(parser.file())
}
