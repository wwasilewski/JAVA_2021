package playground.week3.streams.books;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static final List<Book> books = Arrays.asList(
            new Book("Book1", "Author1", Genre.COMEDY, 123, "this description1"),
            new Book("Book2", "Author2", Genre.HORROR, 234, "this description2"),
            new Book("Book3", "Author3", Genre.HORROR, 345, "this description3"),
            new Book("Book4", "Author4", Genre.DRAMA, 456, "this description4"),
            new Book("Book5", "Author5", Genre.S_F, 567, "this description5"));

    public static void main(String[] args) {

        books.forEach(System.out::println);
        books.stream()
                .filter(book -> "Author3".equals(book.getAuthor()))
                .forEach(System.out::println);

        books.stream()
                .map(Book::getPages)
                .filter(pages -> pages > 345)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        books.forEach(book -> {
            if ("Horror movie".equals(book.getGenre().getDescription())) {
                book.setAuthor("ZMIENIONY DZIK");
                System.out.println(book);
            }
        });
    }
}