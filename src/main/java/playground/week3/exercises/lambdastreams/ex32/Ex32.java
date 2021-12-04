/*
Utwórz tablicę typu int[]. Wylosuj 20 wartości z przedziału <100,200> i wyświetl
tablicę. Wykorzystując stream posortuj tablicę z wygenerowanymi wartościami
rosnąco, a następnie wyświetl tablicę, *Posortuj tablicę malejąca, a następnie ją
wyświetl.
*/

package playground.week3.exercises.lambdastreams.ex32;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex32 {

    private static Random random = new Random();

    public static void main(String[] args) {

        int[] numbers = random
                .ints(5, 100, 200)
                .toArray();
        System.out.println(Arrays.toString(numbers));

        Arrays.stream(numbers)
                .sorted()
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        IntStream.of(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));
    }
}
