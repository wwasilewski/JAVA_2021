package playground.week3.regex.ex1;

import java.util.Scanner;

public class Ex1BMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("provide a string to check: ");

        Ex1B ex1B = new Ex1B();

        while (true) {
            String stringToCheck = sc.nextLine();
            if (ex1B.isValid(stringToCheck)) {
                System.out.printf("string is%s even number", ex1B.isEven(stringToCheck) ? "" : " not");
                break;
            } else {
                System.out.println("string invalid, pick again: ");
            }
        }
        sc.close();
    }
}
