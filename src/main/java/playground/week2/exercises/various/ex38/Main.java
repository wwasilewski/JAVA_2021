package playground.week2.exercises.various.ex38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("provide circle's radius: ");
        float radius;

        while (true) {
            try {
                radius = Float.parseFloat(sc.nextLine());
                if (radius > 0) {
                    Ex38 ex38 = new Ex38(radius);
                    ex38.printResult();
                    break;
                } else {
                    System.out.println("radius has to be > 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("wrong input data, pick again: ");
            }
        }
        sc.close();
    }
}
