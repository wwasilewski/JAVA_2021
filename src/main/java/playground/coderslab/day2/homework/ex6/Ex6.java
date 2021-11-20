package playground.coderslab.day2.homework.ex6;

public class Ex6 {
    public static void main(String[] args) {

        String str = "String to test";
        System.out.println(replaceStr(str, "test", "print"));
    }

    public static String replaceStr(String str, String forReplace, String replacement) {
        return str.replace(forReplace, replacement);
    }
}
