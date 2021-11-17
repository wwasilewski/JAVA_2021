package playground.week3.regex.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("provide a string to check: ");

        Ex5 ex5 = new Ex5();

        while (true) {
            String stringToCheck = sc.nextLine();
            if (ex5.checkIfDateValid(stringToCheck)) {
                System.out.println("date valid");
                break;
            } else {
                System.out.println("date invalid, pick again: ");
            }
        }
        sc.close();
    }
}
