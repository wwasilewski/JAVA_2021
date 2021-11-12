package playground.week2.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTests {
    public static void main(String[] args) {

        Queue<String> namesQueue = new PriorityQueue<>();
        namesQueue.add("Bob");
        namesQueue.add("Mary");
        namesQueue.add("Tony");
        namesQueue.add("Ana");
        namesQueue.add("Jack");
        System.out.println(namesQueue);

        namesQueue.poll();
        System.out.println(namesQueue);

        namesQueue.poll();
        System.out.println(namesQueue);

        namesQueue.poll();
        System.out.println(namesQueue);

        namesQueue.poll();
        System.out.println(namesQueue);

        Deque<String> namesDeque = new ArrayDeque<>();
        namesDeque.add("Gerd");
        namesDeque.add("Hon");
        namesDeque.add("Kate");
        namesDeque.add("Angie");
        System.out.println(namesDeque);

        namesDeque.addFirst("Morty");
        namesDeque.addLast("Shorty");
        System.out.println(namesDeque);

        namesDeque.poll();
        System.out.println(namesDeque);

        namesDeque.poll();
        System.out.println(namesDeque);

        namesDeque.poll();
        System.out.println(namesDeque);

        namesDeque.poll();
        System.out.println(namesDeque);
    }
}
