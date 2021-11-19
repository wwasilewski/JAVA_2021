package playground.coderslab.day2.strings2.ex4;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {

        String str = "Java-zadania-podzial-napisow";
        String[] strings = onlyTwoElements(str, '-');
        System.out.println(Arrays.toString(strings));
    }

    public static String[] onlyTwoElements(String str, char separator) {
        return str.split(String.valueOf(separator), 2);
    }
}
