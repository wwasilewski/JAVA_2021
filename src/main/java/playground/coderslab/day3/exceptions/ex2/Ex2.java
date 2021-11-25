package playground.coderslab.day3.exceptions.ex2;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println(divide(2, 0));
        System.out.println(divide(4, 2));
    }

    private static int divide(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return result;
    }
}
