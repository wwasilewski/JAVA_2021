package playground.week3.streams.books;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private String title;
    private String author;
    private Genre genre;
    private int pages;
    private String description;

}
