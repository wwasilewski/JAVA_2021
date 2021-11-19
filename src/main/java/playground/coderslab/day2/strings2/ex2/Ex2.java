package playground.coderslab.day2.strings2.ex2;

public class Ex2 {
    public static void main(String[] args) {

        String str = "Z Coders Lab niezależnie od wykształcenia" +
                " możesz zmienić swoją karierę." +
                " Jesteśmy szkołą oferującą bardzo intensywne kursy programowania." +
                " Przygotujemy Cię do pracy na stanowisku junior web developera i pomożemy" +
                " znaleźć zatrudnienie po kursie.";

        String[] sentences = splitSentence(str);
        for (String s : sentences) {
            System.out.println(s + ".");
        }
    }

    public static String[] splitSentence(String str) {
        return str.split("\\.");
    }
}
