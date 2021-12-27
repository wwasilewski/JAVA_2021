package playground.sda_interview;

import java.util.*;

public class SDACourseTestClass2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(10) + 1);
        }

//        System.out.println(numbers);
//        System.out.println(createFinalList(numbers));

//        System.out.println(countOccurences("string this is is is my string"));
        System.out.println(countWordsLength("string this is is is my string"));
    }

    public static List<Integer> createFinalList(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 3 == 0) {
                result.add(numbers.get(i));
            }
        }
        return result;
    }

    public static Map<String, Integer> countOccurences(String string) {
        Map<String, Integer> result = new HashMap<>();
        String[] words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (result.containsKey(words[i])) {
                result.put(words[i], result.get(words[i]) + 1);
            } else {
                result.put(words[i], 1);
            }
        }
        return result;
    }

    public static Set<Integer> countWordsLength(String string) {
        Set<Integer> result = new HashSet<>();
        String[] words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            result.add(words[i].length());
        }
        return result;
    }
}
