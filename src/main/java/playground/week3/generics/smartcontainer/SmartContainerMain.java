package playground.week3.generics.smartcontainer;

public class SmartContainerMain {
    public static void main(String[] args) {
        SmartContainer<String> stringContainer = new SmartContainer<>();

        stringContainer.add("toy");
        stringContainer.add("ball");
        stringContainer.add("car");
        stringContainer.add("doll");

        stringContainer.printAll();
        stringContainer.update(2, "batmobile");
        stringContainer.printAll();
        stringContainer.printElement(2);

        SmartContainer<Integer> integerContainer = new SmartContainer<>();
        integerContainer.add(1);
        integerContainer.add(2);
        integerContainer.add(3);
        integerContainer.add(4);

        integerContainer.printAll();
        integerContainer.update(1, 7);
        integerContainer.printAll();
        integerContainer.printElement(1);
    }
}
