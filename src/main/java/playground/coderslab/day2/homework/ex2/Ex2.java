package playground.coderslab.day2.homework.ex2;

public class Ex2 {
    public static void main(String[] args) {

        String str = "abcd";
        System.out.println("string to encrypt: " + str);

        String encryptedStr = encode(str, 3);
        System.out.println("encrypted string: " + encryptedStr);

        System.out.println("decrypted string: " + decode(encryptedStr, 3));
    }

    public static String encode(String str, int shift) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];
            character = (char) (character + shift);
            if (character > 'z') {
                character = (char) (character - 26);
            } else if (character < 'a') {
                character = (char) (character + 26);
            }
            charArray[i] = character;
        }
        return new String(charArray);
    }

    public static String decode(String str, int shift) {
        return encode(str, 26 - (shift % 26));
    }
}
