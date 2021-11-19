package playground.coderslab.day2.strings.ex8;

public class Ex8 {
    public static void main(String[] args) {

        String[] str = {"CodersLab", "jak", "dobrze zacząć", "programować"};
        System.out.println(stringFromArray(str));
    }

    public static String stringFromArray(String[] str) {
        return String.join("-", str);
    }
}
