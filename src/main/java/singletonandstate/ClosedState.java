package singletonandstate;

public class ClosedState implements ShopState {

    @Override
    public void buy() {
        System.out.println("Shop closed");
    }
}
