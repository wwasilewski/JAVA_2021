/*
Przygotuj program, który pobiera od użytkownika imiona i dodaje je do listy
generycznej typu String. Koniec wprowadzania imion następuje po wprowadzeniu
słowa “koniec”. Następnie program korzystając z pętli foreach wyświetla po kolei
wszystkie imiona podając na końcu każdego imienia ilość znaków z których się
składa (np. Jan (3))
*/

package playground.week3.exercises.generics.ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex12 {

    private final List<String> listOfNames = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void addName() {
        String name;
        while (true) {
            System.out.println("provide a name (\"end\" will finish): ");
            name = sc.nextLine();
            if ("end".equals(name)) {
                break;
            } else {
                listOfNames.add(name);
            }
        }
    }

    public void printAll() {
        for (String listOfName : listOfNames) {
            System.out.println(listOfName + "(" + listOfName.length() + ")");
        }
    }
}
