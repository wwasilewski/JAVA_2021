package playground.coderslab.day1.methods.ex7;

public class Ex7 {
    public static void main(String[] args) {

        System.out.println(checkEven(23));
        System.out.println(checkEven(24));
    }

    public static String checkEven(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }
}
