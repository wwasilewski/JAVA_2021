package playground.week2.exercises.oop.figure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("How many rectangles?");
        int rectangles = sc.nextInt();

        System.out.println("How many squares?");
        int squares = sc.nextInt();

        System.out.println("How many circles?");
        int circles = sc.nextInt();

        System.out.println("rectangles: " + rectangles + " squares: " + squares +
                " circles: " + circles);

        List<Figure> figures = new ArrayList<>();

        for (int i = 0; i < rectangles; i++) {
            Rectangle rectangle = new Rectangle(rand.nextInt(10), rand.nextInt(10));
            figures.add(rectangle);
        }

        for (int i = 0; i < squares; i++) {
            Square square = new Square(rand.nextInt(10));
            figures.add(square);
        }

        for (int i = 0; i < circles; i++) {
            Circle circle = new Circle(rand.nextInt(10));
            figures.add(circle);
        }

        for (Figure figure : figures) {
            figure.displayArea();
        }
        sc.close();
    }
}
