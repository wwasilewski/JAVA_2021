package playground.coderslab.day3.exceptions.ex1;

public class Ex1 {
    public static void main(String[] args) {

        int[] array = {5, 1, 6, 7, 8};

        try {
            System.out.println(array[3]);
            System.out.println(array[21]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
