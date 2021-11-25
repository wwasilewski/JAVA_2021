package playground.coderslab.day3.exceptions.ex6;

public class Ex6 {
    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
