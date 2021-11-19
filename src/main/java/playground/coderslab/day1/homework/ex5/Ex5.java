package playground.coderslab.day1.homework.ex5;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(append(array)));
    }

    public static int[] append(int[] arr) {
        int[] result = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
            result[i + arr.length] = arr[arr.length - i - 1];
        }
        return result;
    }
}
