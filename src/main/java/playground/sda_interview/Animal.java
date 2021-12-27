package playground.sda_interview;

public class Animal {

    private String name;
    private int numberOfLegs;
    private String type;

    public Animal(String name, int numberOfLegs, String type) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.type = type;
    }

    public void describeAnimal() {
        System.out.println("name: " + name + ", number of legs: " + numberOfLegs + ", type: " + type);
    }
}
