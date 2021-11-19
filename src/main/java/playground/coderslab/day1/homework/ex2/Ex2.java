package playground.coderslab.day1.homework.ex2;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println(divisibleBy(4, 2));
        System.out.println(divisibleBy(4, 4));
        System.out.println(divisibleBy(4, 1));
        System.out.println(divisibleBy(5, 2));
        System.out.println(divisibleBy(5, 0));
    }

    public static boolean divisibleBy(int a, int b) {
        boolean result = false;

        try {
            result = (a % b == 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return result;
    }
}
