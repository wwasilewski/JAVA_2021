package playground.coderslab.day3.homework.ex4;

public class Ex4 {
    public static void main(String[] args) {

        try {
            System.out.println(toInt("1234"));
            System.out.println(toInt("1234a"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static int toInt(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }
}
