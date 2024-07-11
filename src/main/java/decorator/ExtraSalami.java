package decorator;

public class ExtraSalami extends PizzaDecorator {

    public ExtraSalami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return Math.round(super.getCost() + 6.0 * Math.pow(pizza.getBaseCost(), 0.1));
    }

    @Override
    public String toString() {
        return super.toString() + "salami\n";
    }
}
