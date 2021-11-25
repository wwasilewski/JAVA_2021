package playground.coderslab.day3.exceptions.ex3;

public class Ex3 {
    public static void main(String[] args) {

        showLength(null);
        showLength("string");
    }

    private static void showLength(String s) {
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("nie ma obiektu");
            e.printStackTrace();
        }
    }
}
