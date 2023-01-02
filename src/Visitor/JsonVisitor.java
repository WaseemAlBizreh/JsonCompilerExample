package Visitor;

import AST.JsonObject;
import AST.KeyValue;
import AST.Value.*;
import antlr.JsonParser;
import antlr.JsonParserBaseVisitor;

public class JsonVisitor extends JsonParserBaseVisitor<JsonObject> {
    @Override
    public JsonObject visitObject(JsonParser.ObjectContext ctx) {
        ObjectValue objectValue = new ObjectValue();
        for (int i = 0 ; i < ctx.keyValue().size() ; i++){
            JsonObject value = visit(ctx.keyValue().get(i));
            objectValue.addObject((KeyValue) value);
        }
        return objectValue;
    }

    @Override
    public JsonObject visitArray(JsonParser.ArrayContext ctx) {
        ArrayValue arrayValue = new ArrayValue();
        for (int i = 0 ; i < ctx.value().size() ; i++){
            JsonObject value = visit(ctx.value().get(i));
            arrayValue.addValue(value);
        }
        return arrayValue;
    }

    @Override
    public JsonObject visitKeyValue(JsonParser.KeyValueContext ctx) {
        String key = ctx.STRING().getText();
        JsonObject value = visit(ctx.value());
        return new KeyValue(key,value);
    }

    @Override
    public JsonObject visitObjectValue(JsonParser.ObjectValueContext ctx) {
        return visit(ctx.object());
    }

    @Override
    public JsonObject visitArrayValue(JsonParser.ArrayValueContext ctx) {
        return visit(ctx.array());
    }

    @Override
    public JsonObject visitBool(JsonParser.BoolContext ctx) {
        String value = ctx.getChild(0).getText();
        boolean boolValue = Boolean.parseBoolean(value);
        return new BoolValue(boolValue);
    }

    @Override
    public JsonObject visitNull(JsonParser.NullContext ctx) {
//        String nullText = ctx.getChild(0).getText();
        String nullText = ctx.NULL().getText();
        return new NullValue(nullText);
    }

    @Override
    public JsonObject visitInteger(JsonParser.IntegerContext ctx) {
        String value = ctx.INT().getText();
        int integerValue = Integer.parseInt(value);
        return new IntegerValue(integerValue);
    }

    @Override
    public JsonObject visitDouble(JsonParser.DoubleContext ctx) {
        String value = ctx.DOUBLE().getText();
        double doubleValue = Double.parseDouble(value);
        return new DoubleValue(doubleValue);
    }

    @Override
    public JsonObject visitString(JsonParser.StringContext ctx) {
        String value = ctx.STRING().getText();
        return new StringValue(value);
    }
}
