package playground.week3.exercises.generics.ex14;

public class Clipboard<T extends BasePerson> {

    private T element;

    public void insertIntoClipboard(T item) {
        element = item;
    }

    public T getFromClipboard() {
        return element;
    }
}
