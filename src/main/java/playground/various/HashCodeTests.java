package playground.various;

public class HashCodeTests {
    public static void main(String[] args) {

        String string1 = "this is my first test string";
        String string2 = "this is my second test string";
        int number = 3;

        System.out.println(string1.hashCode());
        System.out.println(string2.hashCode());
        System.out.println(Integer.hashCode(number));
    }
}
