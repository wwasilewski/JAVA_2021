package playground.week3.streams.books;

import lombok.Getter;

@Getter
public enum Genre {
    COMEDY("Comedy movie"),
    HORROR("Horror movie"),
    DRAMA("Drama movie"),
    THRILLER("Thriller movie"),
    S_F("SCI-FI movie");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

}
