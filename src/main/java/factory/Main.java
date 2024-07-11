package factory;

public class Main {

    public static void main(String[] args) {
        ChocolateFactory producer = new ChocolateFactory();
        producer.produceChocolate("milk with cocoa");
        producer.produceChocolate("dark");
    }
}
