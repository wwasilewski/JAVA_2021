package playground.coderslab.day2.strings.ex4;

public class Ex4 {
    public static void main(String[] args) {

        String str = "CodersLab jak dobrze zacząć programować";
        System.out.println(toogleChar(str));
    }

    public static String toogleChar(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            } else {
                sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }
}
