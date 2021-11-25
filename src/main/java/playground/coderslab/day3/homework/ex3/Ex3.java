package playground.coderslab.day3.homework.ex3;

public class Ex3 {
    public static void main(String[] args) {

        try {
            System.out.println(getLength(null));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private static int getLength(String str) throws NullPointerException {
        return str.length();
    }
}
