package playground.coderslab.day4.datainput.ex7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        nettoBrutto();
    }

    private static void nettoBrutto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("bn or nb?");
        String choice = sc.nextLine();

        if (choice.equals("nb")) {
            System.out.println("provide netto value to calculate brutto: ");
            while (true) {
                try {
                    int netto = Integer.parseInt(sc.nextLine());
                    double calculatedBrutto = netto + (netto * 0.23);
                    System.out.println(calculatedBrutto);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("wrong input, again: ");
                }
            }
        } else if (choice.equals("bn")) {
            System.out.println("provide brutto value to calculate netto: ");
            while (true) {
                try {
                    int brutto = Integer.parseInt(sc.nextLine());
                    double calculatedNetto = brutto / 1.23;
                    System.out.println(calculatedNetto);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("wrong input, again: ");
                }
            }
        }
        sc.close();
    }
}
