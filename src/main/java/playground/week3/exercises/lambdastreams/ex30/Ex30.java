/*
Za pomocą strumieni i klasy IntStream wygeneruj liczby losowania lotto.
*/

package playground.week3.exercises.lambdastreams.ex30;

import java.util.Random;

public class Ex30 {

    private static Random random = new Random();

    public static void main(String[] args) {

        random.ints(1, 50)
                .distinct()
                .limit(6)
                .forEach(System.out::println);
    }
}
