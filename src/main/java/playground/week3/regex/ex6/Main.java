package playground.week3.regex.ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("provide string to check: ");

        Ex6 ex6 = new Ex6();

        while (true) {
            String stringToCheck = sc.nextLine();
            if (ex6.checkIfSnValid(stringToCheck)) {
                System.out.println("serial number valid");
                break;
            } else {
                System.out.println("serial number invalid, pick again: ");
            }
        }
        sc.close();
    }
}
