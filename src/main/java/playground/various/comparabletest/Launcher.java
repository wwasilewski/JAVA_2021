package playground.various.comparabletest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Launcher {

    private List<Book> books;

    public Launcher() {
        createInstances();
        addBooks();
        printBooks();
        Collections.sort(books);
        printBooks();

    }

    public void createInstances() {
        books = new ArrayList<>();
    }

    public void addBooks() {
        books.add(new Book("My book", "Myself", "WW", 2000));
        books.add(new Book("A Mickiewicz", "Pan Tadeusz", "A", 1834));
        books.add(new Book("G H-Grudziński", "Inny świat", "Roy", 1951));
        books.add(new Book("A Głowacki", "Lalka", "G", 1890));
    }

    public void printBooks() {
        System.out.println("printing books: ");
        books.forEach(System.out::println);
    }
}
