package playground.coderslab.day2.homework.ex7;

import java.util.Arrays;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {

        String str = "this is a string to censor";
        String[] forbiddenWords = {"is", "to"};
        System.out.println(censor(str, forbiddenWords));
    }

    public static String censor(String str, String[] words) {
        List<String> listOfWords = Arrays.asList(str.split(" "));

        for (int i = 0; i < listOfWords.size(); i++) {
            for (String word : words) {
                if (listOfWords.get(i).equals(word)) {
                    listOfWords.set(i, "****");
                }
            }
        }
        return String.join(" ", listOfWords);
    }
}
