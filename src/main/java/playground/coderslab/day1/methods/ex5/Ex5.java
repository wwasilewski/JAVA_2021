package playground.coderslab.day1.methods.ex5;

public class Ex5 {
    public static void main(String[] args) {

        System.out.println(calculateNet(115, 0.15f));
    }

    public static double calculateNet(int gross, float vat) {
        return gross / (1 + vat);
    }
}
