/*
Spróbuj przekonwertować następujące wartości:
1. short - > int
2. short -> long
3. int -> float
4. int -> double
5. long -> int
6. short -> byte
7. char -> int
*/

package playground.typeconversion;

public class TypeConversion {
    public static void main(String[] args) {

//        short -> int
        short number1 = 3;
        int number2 = number1;
        System.out.println(number2);
//        short -> long
        long number3 = number1;
        System.out.println(number3);
//        int -> float
        float number4 = number2;
        System.out.println(number4);
//        int -> double
        double number5 = number2;
        System.out.println(number5);
//        long -> int, need casting because long > int
        int number6 = (int) number3;
        System.out.println(number6);
//        short -> byte, need casting because short > byte
        byte number7 = (byte) number1;
        System.out.println(number7);
//        char -> int
        char character1 = 'a';
        int number8 = character1;
        System.out.println(number8);
    }
}
