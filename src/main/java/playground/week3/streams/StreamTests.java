package playground.week3.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTests {
    public static void main(String[] args) {

        Stream<String> namesStream = Stream.of("Tom", "Jerry", "Ann", "Mary", "Jack", "Barry");
        namesStream
                .filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        List<String> stringList = Arrays.asList("Tom", "Jerry", "Ann", "Mary", "Jack", "Barry");
        stringList
                .stream()
                .filter(e -> {
                    System.out.println("filter: " + e);
                    return true;
                })
                .forEach(e -> System.out.println("forEach: " + e));

        List<String> strings = Arrays.asList("a1", "a2", "b3", "b4", "c5", "c6");
        strings
                .stream()
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .sorted()
                .limit(4)
                .forEach(System.out::println);

        ToIntFunction<String> stringToInt = Integer::parseInt;

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("mapped value: " + e))
                .collect(Collectors.toList());
    }
}
