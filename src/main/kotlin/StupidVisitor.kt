package parser

import antlr.StupidLangParser
import antlr.StupidLangParserBaseVisitor

class StupidVisitor : StupidLangParserBaseVisitor<String>() {

    override fun visitFile(ctx: StupidLangParser.FileContext?): String {
        return when {
            ctx?.statements() == null -> ""
            else -> visit(ctx.statements())
        }
    }

    override fun visitStatements(ctx: StupidLangParser.StatementsContext?): String {
        return ctx
            ?.statement()
            ?.map { visit(it) }
            ?.joinToString(separator = "") { it }
            .toString()
    }

    override fun visitStatement(ctx: StupidLangParser.StatementContext?) = visit(ctx!!.children.first())

    override fun visitRepeat(ctx: StupidLangParser.RepeatContext?): String {
        val times = Integer.valueOf(visit(ctx?.times()))
        return when {
            ctx?.statements() == null -> ""
            else -> visit(ctx.statements()).repeat(times)
        }
    }

    override fun visitTimes(ctx: StupidLangParser.TimesContext?) = ctx!!.text

    override fun visitPrint(ctx: StupidLangParser.PrintContext?): String {
        super.visitPrint(ctx)
        val arg = visit(ctx?.string())
        return "$arg\n"
    }

    override fun visitString(ctx: StupidLangParser.StringContext?) = ctx!!.text
}