package playground.coderslab.day1.methods.ex8;

public class Ex8 {
    public static void main(String[] args) {

        System.out.println(maxOfThree(1, 2, 3));
        System.out.println(maxOfThree(4, 3, 2));
    }

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
