package playground.week3.exercises.unittests.ex24;

import java.util.Scanner;

public class Ex24Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("provide your weight in kilograms: ");
        int weight = sc.nextInt();
        System.out.println("provide your height in centimetres: ");
        int height = sc.nextInt();

        Ex24 ex24 = new Ex24();
        ex24.printResults(weight, height);
    }
}
