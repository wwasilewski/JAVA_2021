/*
Napisz program, który wypisze 30 liczb z ciągu Fibonacciego (1,1,2,3,5,8,13 itd)
*/

package playground.loops;

public class Fibo {
    public static void main(String[] args) {

        int[] fibo = new int[30];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        for (int i = 0; i < fibo.length; i++) {
            System.out.println("fibo " + (i + 1) + ": " + fibo[i]);
        }
    }
}
