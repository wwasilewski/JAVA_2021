/*
Zmodyfikuj program z zadania #3 tak aby wypisywał wyniki tylko dla liczb parzystych
*/

package playground.week1.homework;

public class Ex4 {

    static double funkcja(double x) {
        return x * x + 3;
    }

    static void wypisz(double x, double y) {
        System.out.println("Dla x=" + x + " y=" + y);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                wypisz(i, funkcja(i));
            }
        }
    }
}
