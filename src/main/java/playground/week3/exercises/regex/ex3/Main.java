package playground.week3.exercises.regex.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("provide a string to check: ");
        String stringToCheck = sc.nextLine();

        Ex3 ex3 = new Ex3();
        boolean result = ex3.checkIfProperLogin(stringToCheck);
        System.out.println("is login valid? " + result);

        sc.close();
    }
}
