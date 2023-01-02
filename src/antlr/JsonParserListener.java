// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonParser}.
 */
public interface JsonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JsonParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JsonParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JsonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JsonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(JsonParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(JsonParser.KeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JsonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JsonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterDouble(JsonParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitDouble(JsonParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterInteger(JsonParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitInteger(JsonParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString(JsonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString(JsonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(JsonParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(JsonParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(JsonParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(JsonParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBool(JsonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBool(JsonParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNull(JsonParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNull(JsonParser.NullContext ctx);
}