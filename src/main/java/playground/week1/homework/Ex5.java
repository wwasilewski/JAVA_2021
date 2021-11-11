/*
Zmodyfikuj program z zadania #3 tak aby wypisywał wyniki od 0 do 10 co 0.5
*/

package playground.week1.homework;

public class Ex5 {

    static double funkcja(double x) {
        return x * x + 3;
    }

    static void wypisz(double x, double y) {
        System.out.println("Dla x=" + x + " y=" + y);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            wypisz(i / 2.0, funkcja(i / 2.0));
        }
    }
}
