package factory;

public class DarkChocolate extends Chocolate {

    public DarkChocolate() {
        this.about += "dark: ";
        addVanillaExtract();
    }

    public void addVanillaExtract() {
        this.about += "vanilla extract ";
    }

    public void giveChocolate() {
        System.out.println(this.about);
    }

}
