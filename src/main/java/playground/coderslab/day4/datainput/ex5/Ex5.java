package playground.coderslab.day4.datainput.ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        textLines();
    }

    private static void textLines() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("provide text: ");
        String text = sc.nextLine();

        while (!(text.equals("quit"))) {
            System.out.println(text);
            sb.append(text).append(System.lineSeparator());
            text = sc.next();
        }
        System.out.println(sb);

        sc.close();
    }
}
