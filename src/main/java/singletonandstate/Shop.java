package singletonandstate;

public class Shop {

    private static final Shop instance = new Shop();
    public String name;
    private ShopState stan = new OpenState();

    private Shop() {
        System.out.println("Shop created");
    }

    public static Shop getInstance() {
        return instance;
    }

    public void open() {
        stan = new OpenState();
    }

    public void close() {
        stan = new ClosedState();
    }

    public void inventory() {
        stan = new InventoryState();
    }

    public void buy() {
        stan.buy();
    }

    @Override
    public String toString() {
        return "Shop: " + name;
    }
}
