package playground.week3.exercises.unittests.ex20;

import java.util.Scanner;

public class Ex20Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide name: ");
        String name = sc.nextLine();

        Ex20 ex20 = new Ex20();
        ex20.printResults(name);
    }
}
