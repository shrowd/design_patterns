package composite;

import java.util.HashMap;
import java.util.Map;

public class Variable implements Expression {

    private Map<Character, Boolean> variables = new HashMap<>();
    private char symbol;

    Variable(char symbol, boolean value) {
        this.symbol = symbol;
        this.variables.put(symbol, value);
    }

    @Override
    public boolean value() {
        return variables.get(symbol);
    }
}
