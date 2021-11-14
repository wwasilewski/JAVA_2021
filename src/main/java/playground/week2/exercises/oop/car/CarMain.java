package playground.week2.exercises.oop.car;

public class CarMain {
    public static void main(String[] args) {
        Car car = new SportCar("Mercedes", "SLK200", "black", 2,
                new Engine(5000, 600, 20));
        System.out.println(car);

    }
}
