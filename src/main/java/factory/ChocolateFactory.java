package factory;

public class ChocolateFactory {

    public void produceChocolate(String about) {
        Chocolate chocolate = null;

        if (about.contains("milk")) {
            chocolate = new MilkChocolate();
        } else if (about.contains("dark")) {
            chocolate = new DarkChocolate();
        }

        if (chocolate != null) {
            if (about.contains("cocoa")) {
                chocolate.addCocoa();
            }
            chocolate.giveChocolate();
        } else {
            System.out.println("Unknown type of chocolate.");
        }
    }

}
