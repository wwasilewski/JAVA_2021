package playground.coderslab.day4.datainput.ex4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        rowsColumns();
    }

    private static void rowsColumns() {
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        int counter = 0;
        int sum = 0;

        System.out.println("provide number of rows: ");
        while (!sc.hasNextInt()) {
            System.out.println("again: ");
            sc.next();
        }
        rows = sc.nextInt();

        System.out.println("provide number of columns: ");
        while (!sc.hasNextInt()) {
            System.out.println("again: ");
            sc.next();
        }
        columns = sc.nextInt();

        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = counter;
                sum = sum + array[i][j];
                counter++;
            }
        }
        System.out.println("array: " + Arrays.deepToString(array));
        System.out.println("sum of all elements: " + sum);
        System.out.println("counter: " + counter);
        System.out.println("mean average: " + (sum * 1.0 / counter));

        sc.close();
    }
}
