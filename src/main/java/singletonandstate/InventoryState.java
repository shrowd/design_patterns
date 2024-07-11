package singletonandstate;

public class InventoryState implements ShopState {

    @Override
    public void buy() {
        System.out.println("Inventory");
    }
}
