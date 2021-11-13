/*
Utwórz obiekt typu LocalDate przechowujący datę 01.01.2017 oraz obiekt typu
LocalDate przechowujący datę 05.05.2017. Wykorzystując obiekt typu Period
Wyświetl ile czasu minęło pomiędzy datami.
*/

package playground.week2.exercises.dateandtime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex12 {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2017, 1, 1);
        LocalDate localDate2 = LocalDate.of(2017, 5, 5);

        Period period = Period.between(localDate1, localDate2);
        System.out.println(period);
        System.out.println(ChronoUnit.DAYS.between(localDate1, localDate2));
    }
}
