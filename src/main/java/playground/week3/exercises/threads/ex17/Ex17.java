/*
Wykorzystaj pulę wątków (5 wątków). Niech każdy z wątków po uruchochomieniu
losuje czas uśpienia z zakresu 1-5 sekund i usypia się. Po wybudzeniu każdy wątek
powinien wyświetlić losową godzinę w postaci 12h13m14s34ms
*/

package playground.week3.exercises.threads.ex17;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Ex17 implements Runnable {

    private final Random RANDOM = new Random();
    private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH'h'mm'm'ss's'SS'ms'");

    @Override
    public void run() {
        try {
            Thread.sleep(RANDOM.nextInt(4001) + 1000);
            System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now().format(FORMATTER));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
