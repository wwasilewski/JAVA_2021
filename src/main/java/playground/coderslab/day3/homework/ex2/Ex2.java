package playground.coderslab.day3.homework.ex2;

public class Ex2 {
    public static void main(String[] args) {

        String[] array = {"this", "is", "my", "test", "array"};

        try {
            System.out.println(safeGet(array, 10));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    private static String safeGet(String[] str, int index) throws ArrayIndexOutOfBoundsException {
        return str[index];
    }
}
