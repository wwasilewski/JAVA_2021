/*
Wyświetl bieżącą godzinę w Bydgoszczy. Wykorzystaj DateTimeFormatter aby
wyświetlić datę w następującym formacie: 3 lutego 2018 roku, sobota 22:12:27
*/

package playground.week2.exercises.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex15 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        String formattedLDT = localDateTime.format(DateTimeFormatter.ofPattern
                ("d MMMM yyyy 'roku,' EEEE HH:mm:ss"));
        System.out.println(formattedLDT);
    }
}
