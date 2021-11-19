package playground.coderslab.day1.homework.ex1;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println(dogAge(1.5));
        System.out.println(dogAge(5));
        System.out.println(dogAge(2));
        System.out.println(dogAge(2));
    }

    public static double dogAge(double dogAge) {
        if (dogAge <= 2) {
            return 10.5 * dogAge;
        } else {
            return 4 * (dogAge - 2) + 21;
        }
    }
}
