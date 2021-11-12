/*
Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
b. Wyświetl długość tablicy
c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i
zapisz go ponownie w tablicy.
e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
*/

package playground.week2.exercises.collections;

public class Ex1 {
    public static void main(String[] args) {

        int[] arrayOfNumbers = new int[10];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = i + 1;
        }
        System.out.println("numbers length: " + arrayOfNumbers.length);

        for (int arrayOfNumber : arrayOfNumbers) {
            System.out.println(arrayOfNumber);
        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = arrayOfNumbers[i] * 2;
        }

        for (int arrayOfNumber : arrayOfNumbers) {
            System.out.println(arrayOfNumber);
        }
    }
}
