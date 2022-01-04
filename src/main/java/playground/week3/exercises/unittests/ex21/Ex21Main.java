package playground.week3.exercises.unittests.ex21;

public class Ex21Main {
    public static void main(String[] args) {
        Ex21 ex21 = new Ex21();
        System.out.println("x+y = " + ex21.sum(2, 4));
        System.out.println("x-y = " + ex21.subtract(2, 4));
        System.out.println("x*y = " + ex21.multiply(2, 4));
        System.out.println("x/y = " + ex21.divide(2, 4));
//        System.out.println("x/y = " + ex21.divide(2, 0));
    }
}
