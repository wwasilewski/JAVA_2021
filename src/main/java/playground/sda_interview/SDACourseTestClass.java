package playground.sda_interview;

public class SDACourseTestClass {
    public static void main(String[] args) {

//        int x = 6;
//        System.out.println(checkIfOddOrEven(x));

//        for (int i = 1; i < 11; i++) {
//            System.out.println(i);
//        }

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
//        }

//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }
//
//        System.out.println(sum);
//
//        System.out.println(sumArray(array));

//        int[] array2 = new int[10];
//        Random random = new Random();
//
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = random.nextInt(10);
//        }
//        System.out.println(Arrays.toString(array2));
//
//        int oddNumberIndex = 0;
//        int sum = 0;
//        for (int i = 0; i < array2.length; i++) {
//            sum = sum + array2[i];
//            if (array2[i] % 2 != 0) {
//                oddNumberIndex = i;
//                break;
//            }
//        }
//        System.out.println(oddNumberIndex);
//        System.out.println(sum);

//        System.out.println(concatStrings("this", "is", "a", "string"));
//        System.out.println(concatStrings2("this", "is", "a", "string"));
        System.out.println(count(2, 4, MathOperation.ADD));
        System.out.println(count(2, 4, MathOperation.DIVIDE));
    }

    public static String checkIfOddOrEven(int x) {
        if (x % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum = sum + number;
        }
        return sum;
    }

    public static String concatStrings(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
        }
        return String.valueOf(sb);
    }

    public static String concatStrings2(String... strings) {
        String result = "";

        for (String string : strings) {
            result = result + string;
        }
        return result;
    }

    public enum MathOperation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    public static double count(double n1, double n2, MathOperation operation) {
        double result = 0;
        switch (operation) {
            case ADD: {
                result = n1 + n2;
                break;
            }
            case SUBTRACT: {
                result = n1 - n2;
                break;
            }
            case MULTIPLY: {
                result = n1 * n2;
                break;
            }
            case DIVIDE: {
                result = n1 / n2;
                break;
            }
        }
        return result;
    }
}
