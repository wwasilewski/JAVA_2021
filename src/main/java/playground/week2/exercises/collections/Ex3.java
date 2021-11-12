/*
Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
liczb do listy.
a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.
*/

package playground.week2.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        List<Float> numbers = new ArrayList<>();
        numbers.add(1f);
        numbers.add(2f);
        numbers.add(3f);
        numbers.add(4f);
        numbers.add(5f);
        numbers.add(6f);
        numbers.add(7f);
        numbers.add(8f);
        numbers.add(9f);
        numbers.add(10f);

        System.out.println("first + last: " + (numbers.get(0) + numbers.get(numbers.size() - 1)));
        System.out.println("first * last: " + (numbers.get(0) * numbers.get(numbers.size() - 1)));
        System.out.println("second/penultimate: " + (numbers.get(1) / numbers.get(numbers.size() - 2)));
    }
}
