/*
Utwórz listę ArrayList przechowującą liczby całkowite.
a. Dodaj 5 liczb do listy.
b. Pobierz 6 element z listy.
c. Uruchom aplikację i sprawdź co pokaże IntelliJ w logach oraz w stacktrace.
d. Zabezpiecz kod za pomocą klauzuli try catch.
e. W przypadku wystąpienia błędu wyświetl stosowny komunikat.
*/

package playground.week2.exercises.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        try {
            numbers.get(6);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
