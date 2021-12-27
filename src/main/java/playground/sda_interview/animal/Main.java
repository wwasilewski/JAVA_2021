package playground.sda_interview.animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println(dog.makeSound());

        Animal cat = new Cat();
        System.out.println(cat.makeSound());
    }
}
