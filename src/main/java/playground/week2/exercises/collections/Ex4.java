/*
Utwórz listę ArrayList przechowującą imiona.
a. Dodaj 5 imion do listy,
b. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy.
c. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy
zaczynając od ostatniego, a kończąc na pierwszym.
*/

package playground.week2.exercises.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Bob", "Ann", "Rob", "Mary"));

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
    }
}
