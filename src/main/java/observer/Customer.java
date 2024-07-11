package observer;

import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer {

    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String buyEverything(Shop shop, String assortment) {
        return "Customer " + firstName + " " + lastName + " is buying out " + shop.getName() + ". Bags full of " + assortment;
    }

    @Override
    public String toString() {
        return "First name: " + firstName + " Last name: " + lastName;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(buyEverything((Shop) o, (String) arg));
    }
}
