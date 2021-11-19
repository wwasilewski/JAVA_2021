package playground.coderslab.day2.strings.ex1;

public class Ex1 {
    public static void main(String[] args) {

        String str = "CodersLab jak dobrze zacząć programować";
        System.out.println(checkHowManyTimes(str));
    }

    public static int checkHowManyTimes(String str) {
        int count = 0;

        char character = str.charAt(str.length() - 2);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
