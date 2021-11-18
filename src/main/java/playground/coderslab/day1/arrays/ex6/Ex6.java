package playground.coderslab.day1.arrays.ex6;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {

        int[] numbers = {3, 2, 5, 4, 5, 6, 3, 1, 9, 10};
        int[] secondNumbers = {1, 2, 3, 4, 5, 6, 3, 1, 9, 10};

        System.out.println(Arrays.toString(sumOfElements(numbers, secondNumbers)));
    }

    public static int[] sumOfElements(int[] numbers, int[] secondNumbers) {
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] + secondNumbers[i];
        }
        return result;
    }
}
