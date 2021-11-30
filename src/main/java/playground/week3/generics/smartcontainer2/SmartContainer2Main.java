package playground.week3.generics.smartcontainer2;

public class SmartContainer2Main {
    public static void main(String[] args) {

        SmartContainer2<String> stringSC2 = new SmartContainer2<>();
        stringSC2.add("this");
        stringSC2.add("is");
        stringSC2.add("my");
        stringSC2.add("line");
        stringSC2.printAll();
        stringSC2.update(3, "superline");
        stringSC2.printAll();

        SmartContainer2<Integer> integerSC2 = new SmartContainer2<>();
        integerSC2.add(1);
        integerSC2.add(2);
        integerSC2.add(3);
        integerSC2.add(4);
        integerSC2.printAll();
        integerSC2.printElement(2);
        integerSC2.update(2, 64);
        integerSC2.printAll();
    }
}
