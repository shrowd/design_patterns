package decorator;

public class ExtraCheese extends PizzaDecorator {

    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return Math.round(super.getCost() + 2.0 * Math.pow(pizza.getBaseCost(), 0.1));
    }

    @Override
    public String toString() {
        return super.toString() + "cheese\n";
    }
}