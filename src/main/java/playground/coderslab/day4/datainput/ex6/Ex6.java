package playground.coderslab.day4.datainput.ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        equation();
    }

    private static void equation() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        double solutionA;
        double solutionB;
        double delta;

        System.out.println("provide a: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("wrong input, only integers for a: ");
        }
        a = sc.nextInt();

        System.out.println("provide b: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("wrong input, only integers for b: ");
        }
        b = sc.nextInt();

        System.out.println("provide c: ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("wrong input, only integers for c: ");
        }
        c = sc.nextInt();

        delta = b * b - 4 * a * c;

        if (delta > 0) {
            solutionA = (-b - Math.sqrt(delta)) / (2 * a);
            solutionB = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println(solutionA);
            System.out.println(solutionB);
        } else if (delta == 0) {
            solutionA = -b / (2.0 * a);
            System.out.println(solutionA);
        } else {
            solutionA = 0;
            System.out.println(solutionA);
        }
        sc.close();
    }
}
