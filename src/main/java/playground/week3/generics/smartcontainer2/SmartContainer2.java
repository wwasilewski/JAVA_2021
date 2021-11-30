package playground.week3.generics.smartcontainer2;

import java.util.ArrayList;
import java.util.List;

public class SmartContainer2<T> implements ContainerOperation<T> {

    private List<T> elements = new ArrayList<>();

    @Override
    public void add(T element) {
        elements.add(element);
    }

    @Override
    public T get(int index) {
        return elements.get(index);
    }

    @Override
    public void update(int index, T element) {
        elements.set(index, element);
    }

    @Override
    public void printElement(int index) {
        System.out.println("element no. " + index + ": " + elements.get(index));
    }

    @Override
    public void printAll() {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
