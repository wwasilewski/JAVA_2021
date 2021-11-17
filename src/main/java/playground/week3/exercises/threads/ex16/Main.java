package playground.week3.exercises.threads.ex16;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Ex16());
        thread1.start();
    }
}
