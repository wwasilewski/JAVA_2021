package playground.week2.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTests {
    public static void main(String[] args) {

        Set<Integer> setOfNumbers = new HashSet<>();
        setOfNumbers.add(33);
        setOfNumbers.add(3);
        setOfNumbers.add(1);
        setOfNumbers.add(2);
        setOfNumbers.add(4);
        setOfNumbers.add(4);
        System.out.println(setOfNumbers);

        Set<Integer> setOfNumbers2 = new HashSet<>(Arrays.asList(7, 8));
        setOfNumbers.addAll(setOfNumbers2);
        System.out.println(setOfNumbers);

        System.out.println(setOfNumbers.contains(3));
        System.out.println(setOfNumbers.isEmpty());
        System.out.println(setOfNumbers.size());

        setOfNumbers.remove(1);
        System.out.println(setOfNumbers);
    }
}
