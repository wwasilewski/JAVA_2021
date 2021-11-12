/*
Utwórz kolejkę Queue korzystając z implementacji PriorityQueue.
a. Pobierz od użytkownika ilość liczb jakie mają zostać wylosowane
b. Wylosuj wskazaną przez użytkownika ilość liczb korzystając z klasy Random
z zakresu <1,100> i dodaj je do kolejki.
c. Wyświetl kolejno liczby występujące w kolejce.
*/

package playground.week2.exercises.collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Ex6 {

    Queue<Integer> numbers = new PriorityQueue<>();
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public void drawNumbers() {
        System.out.println("How many numbers to draw?");
        int numbersToDraw = sc.nextInt();
        for (int i = 0; i < numbersToDraw; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }
        sc.close();
    }

    public void printNumbers() {
        System.out.println(numbers);
    }
}
