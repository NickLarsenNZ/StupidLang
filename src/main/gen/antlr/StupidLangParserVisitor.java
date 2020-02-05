// Generated from StupidLangParser.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StupidLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StupidLangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StupidLangParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(StupidLangParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidLangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(StupidLangParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StupidLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidLangParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(StupidLangParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidLangParser#times}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes(StupidLangParser.TimesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(StupidLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link StupidLangParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(StupidLangParser.StringContext ctx);
}