package decorator;

public class Margherita extends PizzaDecorator {

    public Margherita(int diameter) {
        super(new ExtraCheese(new ExtraBasil(new BasicPizza(diameter))));
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
