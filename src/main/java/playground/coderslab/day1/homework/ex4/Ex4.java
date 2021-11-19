package playground.coderslab.day1.homework.ex4;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {

        int[][] array = {{2, 2, 2}, {2, 2, 6}, {7, 8, 9}, {4, 4}};
        System.out.println(Arrays.toString(lessMore(array)));
    }

    public static int[] lessMore(int[][] arr) {
        int[] result = new int[2];
        int arithmeticMean = arithmeticMean(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < arithmeticMean) {
                    result[0]++;
                }
                if (arr[i][j] > arithmeticMean) {
                    result[1]++;
                }
            }
        }
        return result;
    }

    private static int arithmeticMean(int[][] arr) {
        int counter = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                counter++;
            }
        }
        return sum / counter;
    }
}
