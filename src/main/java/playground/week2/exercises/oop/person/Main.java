package playground.week2.exercises.oop.person;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Tom", "Gordon", 19);
        person1.introduce();

        Person person2 = new Person("Jack", "Brady", 25,
                new Address("Robocza", "Szczecin", "Poland", 23, 3));
        person2.showAddress();
    }
}
