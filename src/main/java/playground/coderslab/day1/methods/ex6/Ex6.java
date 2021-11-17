package playground.coderslab.day1.methods.ex6;

public class Ex6 {
    public static void main(String[] args) {

        System.out.println(checkMaturity(12));
        System.out.println(checkMaturity(18));
    }

    public static boolean checkMaturity(int age) {
        return age > 17;
    }
}
