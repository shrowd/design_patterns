package composite;

public class Constant implements Expression {
    private boolean value;

    Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean value() {
        return value;
    }
}
