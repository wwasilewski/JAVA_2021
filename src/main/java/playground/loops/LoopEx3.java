/*
Wykonaj zadanie 2 z użyciem pętli while-do oraz do-while
*/

package playground.loops;

public class LoopEx3 {
    public static void main(String[] args) {

        double counter = 0;
        double sum = 0;
        while (counter < 101) {
            sum = sum + counter;
            counter++;
        }

        System.out.println(sum);
        System.out.println("counter: " + counter);
        System.out.println(sum / (counter - 1));

        counter = 0;
        sum = 0;
        do {
            sum = sum + counter;
            counter++;

        } while (counter < 101);

        System.out.println(sum);
        System.out.println("counter: " + counter);
        System.out.println(sum / (counter - 1));
    }
}
