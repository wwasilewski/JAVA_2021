package playground.coderslab.day3.exceptions.ex4;

public class Ex4 {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;
        int c;

        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
