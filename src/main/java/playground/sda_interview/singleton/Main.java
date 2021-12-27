package playground.sda_interview.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample example = SingletonExample.getInstance();
        System.out.println(example);

        SingletonExample example2 = SingletonExample.getInstance();
        System.out.println(example2);
    }
}
