package singletonandstate;

public class OpenState implements ShopState {

    @Override
    public void buy() {
        System.out.println("Shop open");
    }
}
