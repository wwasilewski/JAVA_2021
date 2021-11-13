/*
Wykorzystując obiekt typu LocalDate wyświetl aktualną datę.
*/

package playground.week2.exercises.dateandtime;

import java.time.LocalDate;

public class Ex10 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}
