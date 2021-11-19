package playground.coderslab.day2.strings.ex3;

public class Ex3 {
    public static void main(String[] args) {

        String str = "CodersLab jak dobrze zacząć programować";
        System.out.println(reverse(str));

    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
