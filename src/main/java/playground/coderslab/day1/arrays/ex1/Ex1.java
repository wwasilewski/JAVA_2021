package playground.coderslab.day1.arrays.ex1;

public class Ex1 {
    public static void main(String[] args) {

        int[] array = new int[51];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            if (i < 10) {
                System.out.print("0" + array[i] + ", ");
            } else {
                System.out.print(array[i] + ", ");
            }
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
