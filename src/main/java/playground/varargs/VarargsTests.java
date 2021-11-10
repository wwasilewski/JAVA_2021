package playground.varargs;

public class VarargsTests {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(2, 3, 4, 5));
        System.out.println(sum(2, 3, 1, 5));
        System.out.println(joinStrings("it", "is", "a", "string"));
        System.out.println(arithmeticMean(2, 4, 6, 8));
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static String joinStrings(String... strings) {
        StringBuilder str = new StringBuilder();
        for (String string : strings) {
            str.append(string);
        }
        return str.toString();
    }

    public static double arithmeticMean(int... numbers) {
        int sum = 0;
        double counter = 0;
        for (int number : numbers) {
            sum = sum + number;
            counter++;
        }
        return sum / counter;
    }
}
