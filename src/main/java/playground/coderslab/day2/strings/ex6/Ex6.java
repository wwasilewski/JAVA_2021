package playground.coderslab.day2.strings.ex6;

public class Ex6 {
    public static void main(String[] args) {

        String str = "CodersLab jak dobrze zacząć programować";
        System.out.println(firstHalf(str));
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
}
