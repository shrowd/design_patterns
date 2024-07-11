package factory;

public class MilkChocolate extends Chocolate {

    public MilkChocolate() {
        this.about += "milk: ";
        addMilk();
        addSugar();
    }

    public void addMilk() {
        this.about += "milk, ";
    }

    public void addSugar() {
        this.about += "sugar, ";
    }

    public void giveChocolate() {
        System.out.println(this.about);
    }

}
