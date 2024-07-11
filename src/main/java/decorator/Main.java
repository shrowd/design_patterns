package decorator;

public class Main {

    public static void main(String[] args) {

        Pizza pepperoni = new Pepperoni(25);
        System.out.println(pepperoni + "cost: " + pepperoni.getCost() + " $\n");

        Pizza margherita = new Margherita(20);
        System.out.println(margherita + "cost: " + margherita.getCost() + " $\n");


        Pizza bigPizza = new BasicPizza(60);
        bigPizza = new ExtraBasil(bigPizza);
        bigPizza = new ExtraCheese(bigPizza);
        bigPizza = new ExtraCheese(bigPizza);
        bigPizza = new ExtraSalami(bigPizza);
        bigPizza = new ExtraSalami(bigPizza);
        System.out.println(bigPizza + "cost: " + bigPizza.getCost() + " $\n");
    }
}
