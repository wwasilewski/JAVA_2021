package playground.week2.exercises.various.ex40;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("provide a: ");
        while (true) {
            try {
                a = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("wrong input, provide integer a:");
            }
        }

        System.out.println("provide b: ");
        while (true) {
            try {
                b = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("wrong input, provide integer b:");
            }
        }

        System.out.println("provide c: ");
        while (true) {
            try {
                c = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("wrong input, provide integer c: ");
            }
        }
        Ex40 ex40 = new Ex40(new Solution());
        ex40.calculate(a, b, c);
        ex40.printResults();

        sc.close();
    }
}
