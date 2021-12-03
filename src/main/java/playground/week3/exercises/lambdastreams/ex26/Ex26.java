/*
Przygotuj tablice z 10 różnymi imionami. Posortuj tablicę według
a. długości rosnąco
b. długości malejąco
c. pierwszej litery imienia rosnąco - wykorzystaj metodą charAt
*/

package playground.week3.exercises.lambdastreams.ex26;

import java.util.Arrays;
import java.util.Comparator;

public class Ex26 {

    private String[] names = {"Tom", "Jerry", "Mary", "Jack", "Andrew", "Bob", "Kate", "Marta"};

    public void sortByNameLengthAsc() {
        System.out.println("names by length ascending:");
        Arrays.stream(names)
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    public void sortByNameLengthDesc() {
        System.out.println("names by length descending:");
        Arrays.stream(names)
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }

    public void sortByFirstLetterAsc() {
        System.out.println("names by first letter ascending:");
        Arrays.stream(names)
                .sorted(Comparator.comparing(n -> n.charAt(0)))
                .forEach(System.out::println);
    }
}
