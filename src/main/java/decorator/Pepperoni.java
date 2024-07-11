package decorator;

public class Pepperoni extends PizzaDecorator {

    public Pepperoni(int diameter) {
        super(new ExtraCheese(new ExtraSalami(new BasicPizza(diameter))));
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
