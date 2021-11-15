package playground.week2.exercises.various.ex39;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ex39 ex39 = new Ex39();

        Scanner sc = new Scanner(System.in);
        System.out.println("provide numbers, \"0\" ends it: ");
        int number;

        List<Integer> listOfNumbers = new ArrayList<>();

        while (true) {
            try {
                number = Integer.parseInt(sc.nextLine());
                if (0 != number) {
                    listOfNumbers.add(number);
                    System.out.println("pick another number: ");
                } else {
                    System.out.println("time to print results:");
                    ex39.printResults(listOfNumbers);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("incorrect data, pick again: ");
            }
        }
        sc.close();
    }
}
