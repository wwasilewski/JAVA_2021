package playground.coderslab.day2.homework.ex3;

public class Ex3 {
    public static void main(String[] args) {

        String str = "string to test";
        System.out.println(upperCase(str, 2));
    }

    public static String upperCase(String str, int index) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i % index == 0) {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
