package observer;

import java.util.Observable;

public class Shop extends Observable {

    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assortmentThrown(String assortment) {
        System.out.println("\nNew assortment in " + name + ": " + assortment + " already available");
        setChanged();
        notifyObservers(assortment);
    }

    @Override
    public String toString() {
        return "Shop name: " + name;
    }
}
