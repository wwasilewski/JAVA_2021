package playground.coderslab.day2.homework.ex4;

public class Ex4 {
    public static void main(String[] args) {

        String str = "aaabbbcccd123112";
        System.out.println(tripple(str));
    }

    public static int tripple(String str) {
        int sum = 0;

        for (int i = 2; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == str.charAt(i - 1) && c == str.charAt(i - 2)) {
                sum++;
            }
        }
        return sum;
    }
}
