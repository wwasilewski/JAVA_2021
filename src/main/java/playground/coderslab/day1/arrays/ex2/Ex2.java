package playground.coderslab.day1.arrays.ex2;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] randNumbers = new int[20];

        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = random.nextInt(101);
        }
        Arrays.sort(randNumbers);
        System.out.println(Arrays.toString(randNumbers));
        System.out.println(randNumbers[0]);
    }
}
