package playground.coderslab.day1.homework.ex6;

public class Ex6 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(evenSum(array));
    }

    public static int evenSum(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 != 0) {
                    sum = sum + arr[i][j];
                }
            }
        }
        return sum;
    }
}
