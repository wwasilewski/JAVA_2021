/*
Wykorzystując obiekt typu LocalDateTime wyświetl aktualną datę i godzinę.
*/

package playground.week2.exercises.dateandtime;

import java.time.LocalDateTime;

public class Ex11 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
