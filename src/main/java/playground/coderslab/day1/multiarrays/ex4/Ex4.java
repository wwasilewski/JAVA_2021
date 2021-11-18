package playground.coderslab.day1.multiarrays.ex4;

public class Ex4 {
    public static void main(String[] args) {

        int[][] task4Array = {{2, 3, 4, 6},
                {12, 32, 12, 11},
                {3, 2, 1, 4},
                {5, 1, 6, 7}};

        System.out.println(sumOfMatrixTrace(task4Array));
    }

    public static int sumOfMatrixTrace(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }
}
