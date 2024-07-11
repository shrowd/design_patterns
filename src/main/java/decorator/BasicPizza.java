package decorator;

public class BasicPizza implements Pizza {

    private int diameter;

    public BasicPizza(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Pizza with a diameter of " + diameter + " cm, ingredients: \n";
    }

    @Override
    public double getBaseCost() {
        return Math.round(Math.PI * Math.pow(diameter * 0.5, 2)) * 0.02;
    }

    @Override
    public double getCost() {
        return Math.round(Math.PI * Math.pow(diameter * 0.5, 2)) * 0.02;
    }
}
