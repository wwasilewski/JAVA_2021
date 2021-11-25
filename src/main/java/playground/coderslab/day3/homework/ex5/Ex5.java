package playground.coderslab.day3.homework.ex5;

public class Ex5 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(elementExist(array, 2));
            System.out.println(elementExist(array, 8));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int elementExist(int[] elements, int value) throws Exception {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return 1;
            }
        }
        throw new Exception("nie ma takiego numeru");
    }
}
