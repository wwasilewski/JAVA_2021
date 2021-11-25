package playground.coderslab.day3.exceptions.ex5;

public class Ex5 {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("xyz");
            System.out.println(num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
