package playground.strings;

import java.util.Arrays;

public class StringTests {
    public static void main(String[] args) {

        String str1 = "first string";
        String str2 = "second string";
        String str3 = new String("second string");

        System.out.println("str1: " + System.identityHashCode(str1));
        System.out.println("str2: " + System.identityHashCode(str2));
        System.out.println("str3: " + System.identityHashCode(str3));

        String actualValue = 1 + 2 + "5";
        System.out.println(actualValue);

        actualValue = "1" + 2 + 5;
        System.out.println(actualValue);

        String str4 = "Java";
        String[] strArray = str4.split("");
        System.out.println(Arrays.toString(strArray));

        char[] charArray = str4.toCharArray();
        System.out.println(Arrays.toString(charArray));

        String str5 = " another string with whitespaces ";
        String str6 = str5.trim();
        System.out.println(str6);

        StringBuilder sb = new StringBuilder();
        sb.append("this");
        sb.append(" is");
        sb.append(" ").append("stringbuilder example").append('1').append("!");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(3));
        System.out.println(sb.substring(3, 9));

        String name = "Tom";
        String surname = "Fish";
        System.out.printf("%s %s", name, surname);
        System.out.println(System.lineSeparator());
        System.out.printf("%s %s%n", name, surname);

    }
}
