package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class And implements Expression {

    private List<Expression> arguments;

    And(Expression... args) {
        this.arguments = new ArrayList<>();
        Collections.addAll(this.arguments, args);
    }

    @Override
    public boolean value() {
        for (Expression arg : arguments) {
            if (arg.value()) {
                return false;
            }
        }
        return true;
    }
}
