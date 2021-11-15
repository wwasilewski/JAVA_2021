/*
Napisz program, który pobiera od użytkownika serię liczb różnych od zera (Zero
kończy wprowadzanie danych). Po wprowadzeniu danych program oblicza sumę
liczb wprowadzonych przez użytkownika, najmniejszą oraz największą liczbę. Na
koniec działania wyświetla obliczone wartości. Oczywiście nie zapomnij o
przechwyceniu ewentualnych wyjątków.
*/

package playground.week2.exercises.various.ex39;

import java.util.List;

public class Ex39 {

    public int sumOfNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }

    public int largestNumber(List<Integer> numbers) {
        int largest = numbers.get(0);
        for (int j : numbers) {
            if (largest < j) {
                largest = j;
            }
        }
        return largest;
    }

    public int smallestNumber(List<Integer> numbers) {
        int smallest = numbers.get(0);
        for (int j : numbers) {
            if (smallest > j) {
                smallest = j;
            }
        }
        return smallest;
    }

    public void printResults(List<Integer> numbers) {
        System.out.println("sum: " + sumOfNumbers(numbers));
        System.out.println("largest: " + largestNumber(numbers));
        System.out.println("smallest: " + smallestNumber(numbers));
    }
}
