package observer;

public class Main {
    public static void main(String[] args) {

        Shop shopOne = new Shop("Alfa");
        Shop shopTwo = new Shop("Beta");
        Shop shopThree = new Shop("Gamma");

        Customer customerOne = new Customer("John", "Doe");
        Customer customerTwo = new Customer("Annie", "January");
        Customer customerThree = new Customer("Zic", "Zac");

        shopOne.addObserver(customerOne);
        shopOne.addObserver(customerTwo);
        shopOne.addObserver(customerThree);

        shopTwo.addObserver(customerTwo);
        shopThree.addObserver(customerThree);

        shopOne.assortmentThrown("cheesecakes");
        shopTwo.assortmentThrown("fresh fishes");
        shopThree.assortmentThrown("flour");
    }
}
