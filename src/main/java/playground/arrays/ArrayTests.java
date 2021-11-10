package playground.arrays;

import java.util.Arrays;

public class ArrayTests {
    public static void main(String[] args) {

        int[] numbers = new int[6];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;

        System.out.println(numbers.length);

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println("----------------------");

        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(array.length);
        System.out.println(array[1].length);

        String[] names = {"Tom", "Ann", "Mary", "Jack"};
        System.out.println(Arrays.toString(names));

        int[][] array2 = {{9, 8, 7}, {1, 2, 7}, {4, 9, 2}, {6, 0, 5}};
        System.out.println(Arrays.deepToString(array2));

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j]);
            }
            System.out.println();
        }

        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
