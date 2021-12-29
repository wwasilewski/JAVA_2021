package playground.various.hashsettest;

import java.util.HashSet;

public class Launcher {

    private HashSet<Book> books;

    public Launcher() {
        createInstances();
        addBooks();
        printBooks();
    }

    public void createInstances() {
        books = new HashSet<>();
    }

    public void addBooks() {
        books.add(new Book("A. Mickiewicz", "Pan Tadeusz", "Aleksander Jełowicki", 1834));
        books.add(new Book("G. H-Grudziński", "Inny świat", "Roy", 1951));
        books.add(new Book("A. Głowacki", "Lalka", "Gebethner i Wolff", 1890));
        books.add(new Book("A. Mickiewicz", "Pan Tadeusz", "Aleksander Jełowicki", 1834));
    }

    public void printBooks() {
        System.out.println("printing books: ");
        books.forEach(System.out::println);
    }
}
