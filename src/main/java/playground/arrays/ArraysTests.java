package playground.arrays;

import java.util.Arrays;

public class ArraysTests {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(myArray));

        int[] myArray2 = Arrays.copyOf(myArray, 3);
        System.out.println(Arrays.toString(myArray2));

        int[] myArray3 = Arrays.copyOfRange(myArray, 2, 6);
        System.out.println(Arrays.toString(myArray3));

        int[][] myArray4 = {{1, 2}, {3, 4}};
        int[][] myArray5 = {{1, 2}, {3, 4}};

        boolean isDeepEqual = Arrays.deepEquals(myArray4, myArray5);
        System.out.println(isDeepEqual);

        System.out.println(Arrays.deepToString(myArray4));

        int[] myArray6 = {1, 2, 3, 4, 5};
        int[] myArray7 = {1, 2, 3, 4, 5};

        boolean isEqual = Arrays.equals(myArray6, myArray7);
        System.out.println(isEqual);

        Arrays.fill(myArray6, 4);
        System.out.println(Arrays.toString(myArray6));

        Arrays.fill(myArray6, 2, 4, 3);
        System.out.println(Arrays.toString(myArray6));

        int[] myArray8 = {6, 5, 4, 3, 2, 1};
        Arrays.sort(myArray8);
        System.out.println(Arrays.toString(myArray8));
    }
}
