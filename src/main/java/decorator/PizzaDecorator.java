package decorator;

public abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return pizza.toString();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }

    @Override
    public double getBaseCost() {
        return pizza.getBaseCost();
    }
}
