package playground.week3.generics.smartcontainer2;

public interface ContainerOperation<T> {
    void add(T element);

    T get(int index);

    void update(int index, T element);

    void printElement(int index);

    void printAll();
}
