package playground.coderslab.day1.methods.ex9;

public class Ex9 {
    public static void main(String[] args) {

        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
