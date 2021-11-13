/*
Utwórz obiekt typu LocalTime przechowujący godzinę 14:11 oraz obiekt typu
LocalTime przechowujący godzinę 18:41. Wykorzystując klasę Duration oblicz ile
czasu upłynęło pomiędzy godzinami.
*/

package playground.week2.exercises.dateandtime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex13 {
    public static void main(String[] args) {

        LocalTime localTime1 = LocalTime.of(14, 11);
        LocalTime localTime2 = LocalTime.of(18, 41);

        Duration duration = Duration.between(localTime1, localTime2);
        System.out.println(duration);
    }
}
