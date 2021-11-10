package playground.switchs;

public class SwitchTests {
    public static void main(String[] args) {

        int number = 2;

        // old switch
        switch (number) {
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            case 2:
                System.out.println("number is 2");
                break;
            default:
                System.out.println("wrong number");
        }

        // enhanced switch
        switch (number) {
            case 0 -> System.out.println("number is 0");
            case 1 -> System.out.println("number is 1");
            case 2 -> System.out.println("number is 2");
            default -> System.out.println("wrong number");
        }
    }
}
