package playground.various.hashsettest;

public class Book {

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
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        Book book = (Book) object;
        return title.equals(book.title);
    }
}
