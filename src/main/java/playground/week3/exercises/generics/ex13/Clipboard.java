/*
Przygotuj generyczną klasę Clipboard przechowującą obiekt typu T. Klasa powinna
mieć metody insertIntoClipboard oraz getFromClipboard.
*/

package playground.week3.exercises.generics.ex13;

public class Clipboard<T> {

    private T element;

    public void insertIntoClipboard(T element) {
        this.element = element;
    }

    public T getFromClipboard() {
        return element;
    }
}
