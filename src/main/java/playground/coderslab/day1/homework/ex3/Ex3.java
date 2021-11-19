package playground.coderslab.day1.homework.ex3;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 3}};
        int[] result = minimum(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] minimum(int[][] arr) {
        int[] min = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            min[i] = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (min[i] > arr[i][j]) {
                    min[i] = arr[i][j];
                }
            }
        }
        return min;
    }
}
