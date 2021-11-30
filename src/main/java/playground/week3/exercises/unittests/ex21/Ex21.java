package playground.week3.exercises.unittests.ex21;

public class Ex21 {

    public double sum(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (0 == y) {
            throw new ArithmeticException("can't divide by 0");
        }
        return x / y;
    }
}
