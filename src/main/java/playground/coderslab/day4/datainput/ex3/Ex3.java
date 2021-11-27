package playground.coderslab.day4.datainput.ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        getData();
    }

    private static void getData() {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int counter = -1;

        int number;
        do {
            System.out.println("provide a number: ");
            while (!sc.hasNextInt()) {
                System.out.println("invalid input");
                sc.next();
            }
            number = sc.nextInt();
            sum = sum + number;
            counter++;

        } while (number != 0);

        System.out.println("sum: " + sum);
        System.out.println("amount: " + counter);

        sc.close();
    }
}
