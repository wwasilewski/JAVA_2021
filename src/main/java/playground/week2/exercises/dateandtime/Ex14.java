/*
Wyświetl bieżącą datę i godzinę w Tokyo.
*/

package playground.week2.exercises.dateandtime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex14 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localDateTime);
    }
}
