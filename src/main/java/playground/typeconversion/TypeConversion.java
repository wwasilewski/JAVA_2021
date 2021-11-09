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
        int number2 = 7;
        int sum = number1 + number2;
        System.out.println(sum);

//        short -> long
        short number3 = 4;
        long number4 = 322223;
        long sum2 = number3 + number4;
        System.out.println(sum2);

//        int -> float
        float number5 = 45f;
        float sum3 = number2 + number5;
        System.out.println(sum3);

//        int -> double
        double number6 = 42d;
        double sum4 = number2 + number6;
        System.out.println(sum4);

//        long -> int, need casting because long > int
        int sum5 = (int) (number4 + number2);
        System.out.println(sum5);

//        short -> byte, need casting because short > byte
        byte number7 = 21;
        short sum6 = (short) (number1 + number7);
        System.out.println(sum6);

//        char -> int
        char character1 = 'a';
        int sum7 = character1 + number2;
        System.out.println(sum7);
    }
}
