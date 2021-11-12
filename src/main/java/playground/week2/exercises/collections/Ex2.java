/*
Utwórz listę ArrayList przechowującą liczby całkowite.
a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
b. Wyświetl pierwszy element zapisany w liście.
c. Wyświetl ostatni element zapisany w liście
*/

package playground.week2.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        System.out.println("list's size: " + numbers.size());

        System.out.println("first element: " + numbers.get(0));
        System.out.println("last element: " + numbers.get(numbers.size() - 1));
    }
}
