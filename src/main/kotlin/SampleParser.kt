package parser

import antlr.StupidLangLexer
import antlr.StupidLangParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

val stupidScript = """
    repeat 5 {
        print "hello world";
    };
    
    repeat 3 {
        print "hi";
    };
    
    print "the end";

""".trimIndent()

fun main() {
    val lexer = StupidLangLexer(CharStreams.fromString(stupidScript))
    val parser = StupidLangParser(CommonTokenStream(lexer))

    val tree = parser.file()

    val result = StupidVisitor().visit(tree)

    print(result)
}
