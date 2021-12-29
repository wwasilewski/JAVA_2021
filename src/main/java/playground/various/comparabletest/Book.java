package playground.various.comparabletest;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private String publisher;
    private int year;

    public Book(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString() {
        return author + ". " + title + ". " + publisher + ", " + year;
    }

    @Override
    public int compareTo(Book book) {
        return year - book.year;
    }
}
