package playground.week3.exercises.regex.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("provide a string to check: ");
        String stringToCheck = sc.nextLine();

        Ex2 ex2 = new Ex2();
        boolean result = ex2.checkIfZipCode(stringToCheck);
        System.out.println("is it a valid polish zip-code? " + result);

        sc.close();
    }
}
