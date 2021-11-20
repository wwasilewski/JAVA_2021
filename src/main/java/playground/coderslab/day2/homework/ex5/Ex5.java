package playground.coderslab.day2.homework.ex5;

public class Ex5 {
    public static void main(String[] args) {

        String str = "string to test";
        System.out.println(replaceChar(str, 't', 'z'));
    }

    public static String replaceChar(String str, char forReplace, char replacement) {
        return str.replace(forReplace, replacement);
    }
}
