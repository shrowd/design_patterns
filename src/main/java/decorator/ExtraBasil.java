package decorator;

public class ExtraBasil extends PizzaDecorator {

    public ExtraBasil(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return Math.round(super.getCost() + 4.0 * Math.pow(pizza.getBaseCost(), 0.1));
    }

    @Override
    public String toString() {
        return super.toString() + "basil\n";
    }
}
