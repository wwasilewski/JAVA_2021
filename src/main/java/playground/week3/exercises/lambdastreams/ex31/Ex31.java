/*
Wykorzystując klasę Stream wygeneruj 10 losowych liczb z zakresu <0,100),
następnie wymnóż każdą wylosowaną liczbę za pomocą map przez 2 i korzystając z
forach wyświetl każdą wylosowana i wymnożoną liczbę.
*/

package playground.week3.exercises.lambdastreams.ex31;

import java.util.Random;

public class Ex31 {

    private static Random random = new Random();

    public static void main(String[] args) {

        random.ints(10, 0, 100)
                .peek(n -> System.out.println("picked number: " + n))
                .map(n -> n * 2)
                .forEach(n -> System.out.println("picked number*2: " + n));
    }
}
