package singletonandstate;

public class Main {

    public static void main(String[] args) {

        Shop shop = Shop.getInstance();
        System.out.println(shop);

        shop.open();
        shop.buy();

        shop.close();
        shop.buy();

        shop.inventory();
        shop.buy();

    }
}
