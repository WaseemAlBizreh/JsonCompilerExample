package AST.Value;

import AST.JsonObject;

public class IntegerValue extends JsonObject {
    int value;

    public IntegerValue(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

}
