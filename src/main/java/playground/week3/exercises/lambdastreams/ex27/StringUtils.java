package playground.week3.exercises.lambdastreams.ex27;

public class StringUtils {

    public static String betterString(String str1, String str2, StringInterface comparator) {
        if (comparator.betterString(str1, str2)) {
            return str1;
        } else {
            return str2;
        }
    }
}
