/*
Utwórz tablicę ArrayList przechowującą imiona
a. Korzystając z klasy Scanner pobierz od użytkownika 5 imion i zapisz je w
liście.
b. Wykorzystując pętlę while wyświetl wszystkie elementy znajdujące się w
liście.
*/

package playground.week2.exercises.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {

    List<String> names = new ArrayList<>();

    public void saveNames() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("provide a name: ");
            String providedName = sc.nextLine();
            names.add(providedName);
        }
        sc.close();
    }

    public void printNames() {
        System.out.println("names from the list:");
        int counter = 0;
        while (counter <= names.size() - 1) {
            System.out.println(names.get(counter));
            counter++;
        }
    }
}
