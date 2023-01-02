package AST.Value;

import AST.JsonObject;

public class BoolValue extends JsonObject {
    boolean value;

    public BoolValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }
}
