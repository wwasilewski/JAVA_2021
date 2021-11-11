/*
 Utwórz nową klasę Zadanie3. W tej klasie
  - utwórz metodę która obliczy i zwróci wynik działania x*x + 3; nagłówek metody powinien być taki:
 static double funkcja (double x){...}
  - utwórz metodę wypisz(double x, double y) która wypisze x oraz y na konsoli np. "Dla X = 1.0 y = 4.0"
  - utwórz metodę public static void main która w pętli najpierw obliczy a następnie wypisze wyniki funkcji
 dla liczb od 1 do 20 (wykorzystaj wcześniej napisane metody)
 program powinien wypisać coś takiego:
 Dla X = 1.0 y = 4.0
 Dla X = 2.0 y = 7.0
 Dla X = 3.0 y = 12.0
 Dla X = 4.0 y = 19.0

 itd
*/

package playground.week1.homework;

public class Ex3 {

    static double funkcja(double x) {
        return x * x + 3;
    }

    static void wypisz(double x, double y) {
        System.out.println("Dla x=" + x + " y=" + y);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            wypisz(i, funkcja(i));
        }
    }
}
