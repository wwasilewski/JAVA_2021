/*
Przygotuj aplikację uruchamiającą 1 wątek wyświetlający losową liczbę z zakresu
10-100. Wątek powinien wyświetlić liczbę 5 razy w odstępie 1 sekundy. Przygotuj
wątek poprzez dziedziczenie z klasy Thread
*/

package playground.week3.exercises.threads.ex15;

import java.util.Random;

public class Ex15 extends Thread {
    private Random random = new Random();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(91) + 10);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
