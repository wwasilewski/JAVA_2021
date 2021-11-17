package playground.week3.regex.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("provide a string to check: ");

        Ex4 ex4 = new Ex4();

        while (true) {
            String stringToCheck = sc.nextLine();
            if (ex4.checkIfAla(stringToCheck)) {
                System.out.println("string contains \"ala\"");
                break;
            } else {
                System.out.println("no \"ala\" in string, pick again: ");
            }
        }
        sc.close();
    }
}
