/*
Napisz program, który obliczy sumę liczb od 1 do 100 oraz obliczy
średnią z tych liczb
*/

package playground.loops;

public class LoopEx2 {
    public static void main(String[] args) {

        int sum = 0;
        double counter = 0;
        for (int i = 1; i < 101; i++) {
            sum = sum + i;
            counter++;
        }
        System.out.println("1-100 sum: " + sum);
        System.out.println("1-100 arithmetic mean: " + sum / counter);
    }
}
