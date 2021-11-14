package playground.week2.exercises.oop.car;

public abstract class Car {

    private String producer;
    private String model;
    private String color;
    private int seatsNumber;
    private Engine engine;

    public Car() {
        this.seatsNumber = 2;
    }

    public Car(String producer, String model, String color, int seatsNumber, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }
}
