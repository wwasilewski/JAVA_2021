package playground.coderslab.day4.datainput.ex1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex1 {

    public static final Pattern NAME = Pattern.compile("[a-zA-Z]+");

    public static void main(String[] args) {
        getInfo();
    }

    private static void getInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("provide your name: ");
        while (!sc.hasNext(NAME)) {
            System.out.println("try again: ");
            sc.next();
        }
        String name = sc.next();

        System.out.println("provide your age: ");
        while (!sc.hasNextInt()) {
            System.out.println("try again with your age: ");
            sc.next();
        }
        int age = sc.nextInt();

        System.out.printf("%s is %s years old", name, age);

        sc.close();
    }
}
