package playground.coderslab.day1.methods.ex4;

public class Ex4 {
    public static void main(String[] args) {

        System.out.println(createName("Tom", "Brady", "Boar"));
    }

    public static String createName(String imie, String nazwisko, String nickname) {
        return imie + " \"" + nickname + "\" " + nazwisko;
    }
}
