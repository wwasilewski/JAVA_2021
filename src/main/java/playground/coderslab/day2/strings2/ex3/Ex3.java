package playground.coderslab.day2.strings2.ex3;

public class Ex3 {
    public static void main(String[] args) {

        String str = "To jest tekst do podziału";
        System.out.println(countTokens(str));
    }

    public static int countTokens(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                sum++;
            }
        }
        return sum;
    }
}
