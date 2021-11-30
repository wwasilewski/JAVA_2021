package playground.week3.generics.smartcontainer;

import java.util.ArrayList;
import java.util.List;

public class SmartContainer<T> {

    private final List<T> elements = new ArrayList<>();

    public void add(T element) {
        System.out.print("Element add: ");
        System.out.println(element);
        elements.add(element);
    }

    public T get(int index) {
        T element = elements.get(index);
        System.out.print("Element get: ");
        System.out.println(element);
        return element;
    }

    public void update(int index, T element) {
        System.out.print("Element to be updated: ");
        System.out.println(elements.get(index));
        elements.set(index, element);
    }

    public void printElement(int index) {
        System.out.println("this is element no. " + index + ": " + elements.get(index));
    }

    public void printAll() {
        System.out.println("All elements: ");
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
