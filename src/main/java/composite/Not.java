package composite;

public class Not implements Expression {

    private Expression argument;

    Not(Expression argument) {
        this.argument = argument;
    }

    @Override
    public boolean value() {
        return !argument.value();
    }
}
