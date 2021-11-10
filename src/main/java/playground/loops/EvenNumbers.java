/*
Napisz program, który wyświetli wszystkie liczby parzyste od 1 do 20 i oraz
liczby podzielne przez 3
*/

package playground.loops;

public class EvenNumbers {
    public static void main(String[] args) {

        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0) {
                System.out.println("number " + i + " is divided by 3");
            }
            if (i % 2 == 0) {
                System.out.println("number " + i + " is even");
            } else {
                System.out.println("number " + i + " is odd");
            }
        }
    }
}
