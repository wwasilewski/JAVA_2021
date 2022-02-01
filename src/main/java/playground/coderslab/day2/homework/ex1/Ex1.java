package playground.coderslab.day2.homework.ex1;

public class Ex1 {
    public static void main(String[] args) {

        String str = "ag bz";
        System.out.println(encode(str));
        System.out.println(caesar(str, 2));
    }

    public static String encode(String str) {
        StringBuilder sb = new StringBuilder();
        int shift = 3;
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];
            if (character != ' ') {
                int originalAlphabetPos = character - 'a';
                int newAlphabetPos = (originalAlphabetPos + shift) % 26;
                character = (char) ('a' + newAlphabetPos);
            }
            sb.append(character);
        }
        return sb.toString();
    }

    public static String caesar(String value, int shift) {
        // Convert to char array.
        char[] buffer = value.toCharArray();

        // Loop over characters.
        for (int i = 0; i < buffer.length; i++) {

            // Shift letter, moving back or forward 26 places if needed.
            char letter = buffer[i];
            letter = (char) (letter + shift);
            if (letter > 'z') {
                letter = (char) (letter - 26);
            } else if (letter < 'a') {
                letter = (char) (letter + 26);
            }
            buffer[i] = letter;
        }
        // Return final string.
        return new String(buffer);
    }
}
