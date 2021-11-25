package playground.coderslab.day3.homework.ex1;

public class Ex1 {
    public static void main(String[] args) {

        try {
            average("z", "2");
            average("4", "2");
            average("4", "0");
        } catch (NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
        }
    }

    private static void average(String a, String b) throws NumberFormatException, ArithmeticException {
        int convertedA = Integer.parseInt(a);
        int convertedB = Integer.parseInt(b);

        System.out.println(convertedA / convertedB);
    }
}
