package playground.week3.threads;

public class RunnableTests {

    public static void main(String[] args) {

        System.out.println("thread: " + Thread.currentThread());

        Thread thread1 = new Thread(new ThreadsWithRunnable());
        thread1.start();
    }
}
