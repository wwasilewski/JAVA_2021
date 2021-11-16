package playground.week3.regex.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("provide a string to check: ");
        String stringToCheck = sc.nextLine();

        Ex1 ex1 = new Ex1();
        boolean result = ex1.checkIfNumber(stringToCheck);
        System.out.println("is it an integer? " + result);

        try {
            int number = Integer.parseInt(stringToCheck);
            if (number % 2 == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is odd");
            }
        } catch (NumberFormatException e) {
            System.out.println("not an integer");
        }
        sc.close();
    }
}
