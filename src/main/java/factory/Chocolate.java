package factory;

public abstract class Chocolate {

    protected String about = "Chocolate ";

    public abstract void giveChocolate();

    protected void addCocoa() {
        this.about += "cocoa ";
    }
}
