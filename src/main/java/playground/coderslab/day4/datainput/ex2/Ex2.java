package playground.coderslab.day4.datainput.ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        operations();
    }

    private static void operations() {
        Scanner sc = new Scanner(System.in);

        System.out.println("provide number1: ");
        while (!sc.hasNextDouble()) {
            System.out.println("not a number, again: ");
            sc.next();
        }
        double number1 = sc.nextDouble();

        System.out.println("provide number2: ");
        while (!sc.hasNextDouble()) {
            System.out.println("not a number, again: ");
            sc.next();
        }
        double number2 = sc.nextDouble();

        System.out.println("sum: " + (number1 + number2));
        System.out.println("difference: " + (number1 - number2));
        System.out.println("multiplication: " + (number1 * number2));
        System.out.println("division: " + (number1 / number2));

        sc.close();
    }
}
