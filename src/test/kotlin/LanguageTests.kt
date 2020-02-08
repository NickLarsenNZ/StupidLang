package parser

import org.junit.Assert.*
import org.junit.Test

class LanguageTests {

    @Test
    fun `print statement`() {
        val statement = """
            print "hello world";
        """.trimIndent()

        val parser = getParser(statement)
        val result = visit(parser.print())

        assertEquals("hello world\n", result)
    }

    @Test
    fun `print nothing`() {
        val statement = """
            print "";
        """.trimIndent()

        val parser = getParser(statement)
        val result = visit(parser.print())

        assertEquals("\n", result)
    }

    @Test
    fun `repeat statement`() {
        val statement = """
            repeat 2 {
                print "double";
            };
        """.trimIndent()

        val parser = getParser(statement)
        val result = visit(parser.repeat())

        assertEquals("double\ndouble\n", result)
    }

    @Test
    fun `empty repeat`() {
        val statement = """
            repeat 5 {};
        """.trimIndent()

        val parser = getParser(statement)
        val result = visit(parser.repeat())

        assertEquals("", result)
    }

    @Test
    fun `multiple statements`() {
        val statement = """
            print "hello world";
            print "goofy goober";
        """.trimIndent()

        val parser = getParser(statement)
        val result = visit(parser.statements())

        assertEquals("hello world\ngoofy goober\n", result)
    }

    @Test
    fun `whole file`() {
        val stupidScript = """
            repeat 5 {
                print "hello world";
            };
            
            repeat 3 {
                print "hi";
            };
            
            print "the end";
        """.trimIndent()

        val expected = """
            hello world
            hello world
            hello world
            hello world
            hello world
            hi
            hi
            hi
            the end
            
        """.trimIndent()

        val parser = getParser(stupidScript)
        val result = visit(parser.file())

        assertEquals(expected, result)
    }

    @Test
    fun `empty file`() {
        val stupidScript = ""

        val expected = ""

        val parser = getParser(stupidScript)
        val result = visit(parser.file())

        assertEquals(expected, result)
    }

    @Test
    fun `comments and statements`() {
        val stupidScript = """
            # this is a comment
            print "hello"; # this is also a comment
            print "world"; # so is this
        """.trimIndent()

        val expected = "hello\nworld\n"

        val parser = getParser(stupidScript)
        val result = visit(parser.file())

        assertEquals(expected, result)
    }
}