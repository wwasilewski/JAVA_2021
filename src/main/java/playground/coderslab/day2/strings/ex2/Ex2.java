package playground.coderslab.day2.strings.ex2;

public class Ex2 {
    public static void main(String[] args) {

        String str = "kobyła ma mały bok";
        String str1 = "kajak";
        String str2 = "radar";
        String str3 = "palindrome";

        System.out.println(checkPalindrome(str));
        System.out.println(checkPalindrome(str1));
        System.out.println(checkPalindrome(str2));
        System.out.println(checkPalindrome(str3));
    }

    public static boolean checkPalindrome(String str) {
        str = str.replace(" ", "");

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
