package playground.week3.regex.ex2;

import java.util.Scanner;

public class Ex2BMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("provide a string to check: ");

        Ex2B ex2B = new Ex2B();

        while (true) {
            String stringToCheck = sc.nextLine();
            if (ex2B.isValid(stringToCheck)) {
                System.out.println("zip-code valid");
                break;
            } else {
                System.out.println("zip-code invalid, pick again: ");
            }
        }
        sc.close();
    }
}
