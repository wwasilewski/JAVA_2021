/*
W klasie zad2:
  - utwórz zmienną static int nrLinii
  - utwórz zmienną tablicową z nazwami tygodnia
  - utwórz metodę która będzie wypisywać na konsole kolejny nr linii oraz tekst (w jednej linii)
		* nagłówek metody powinien być taki: static void wypisz (String tekst){...}
  - utwórz metodę public static void main która w pętli wypisze wszystkie dni tygodnia używając wcześniej
utworzonej metody wypisz()
  - uruchom program i sprawdź wynik działania, program powinien wypisać coś takiego:
  1: niedziela
  2: poniedziałek
  3: wtorek
  itd.
*/

package playground.week1.homework;

public class Ex2 {

    static int nrLinii = 1;

    public static void wypisz(String tekst) {
        System.out.println(nrLinii + ": " + tekst);
        nrLinii++;
    }

    public static void main(String[] args) {
        String[] daysOfWeek = {"mon", "tue", "wen", "thu", "fri", "sat", "sun"};

        for (String s : daysOfWeek) {
            wypisz(s);
        }
    }
}
