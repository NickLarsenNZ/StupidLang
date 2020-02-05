package parser

import antlr.StupidLangParser
import antlr.StupidLangParserBaseVisitor

class StupidVisitor : StupidLangParserBaseVisitor<String>() {

    override fun visitFile(ctx: StupidLangParser.FileContext?): String {
        return visit(ctx?.statements())
    }

    override fun visitStatements(ctx: StupidLangParser.StatementsContext?): String {
        return ctx
            ?.statement()
            ?.map { visit(it) }
            ?.joinToString(separator = "") { it }
            .toString()
    }

    override fun visitStatement(ctx: StupidLangParser.StatementContext?): String {
        val statement = ctx!!.children.first()
        return visit(ctx.children.first())
    }

    override fun visitRepeat(ctx: StupidLangParser.RepeatContext?): String {
        val times = Integer.valueOf(visit(ctx?.times()))
        return visit(ctx!!.statements()).repeat(times)
    }

    override fun visitTimes(ctx: StupidLangParser.TimesContext?): String {
        return ctx!!.text
    }

    override fun visitPrint(ctx: StupidLangParser.PrintContext?): String {
        super.visitPrint(ctx)
        val arg = visit(ctx?.string())
        return "$arg\n"
    }

    override fun visitString(ctx: StupidLangParser.StringContext?): String {
        //println("visitString")
        return "${ctx?.text}"
    }
}