package playground.loops;

public class LoopTests {
    public static void main(String[] args) {

//        while loop
        int counter = 0;
        String[] names = {"Ann", "Tom", "Jack", "Mary"};
        while (counter < names.length) {
            System.out.println(names[counter]);
            counter++;
        }

//        do-while loop
        counter = 0;
        do {
            System.out.println("This is a loop");
            counter++;
        } while (counter < 5);
        System.out.println("End of the loop");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
