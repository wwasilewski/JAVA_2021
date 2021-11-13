/*
Wykorzystując obiekt typu LocalTime wyświetl aktualny czas.
*/

package playground.week2.exercises.dateandtime;

import java.time.LocalTime;

public class Ex9 {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
