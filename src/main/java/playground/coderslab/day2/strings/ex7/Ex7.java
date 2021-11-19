package playground.coderslab.day2.strings.ex7;

public class Ex7 {
    public static void main(String[] args) {

        String str = "CodersLab jak dobrze zacząć programować";
        System.out.println(containsStr(str, "jak"));
    }

    public static boolean containsStr(String str, String search) {
        return str.contains(search);
    }
}
