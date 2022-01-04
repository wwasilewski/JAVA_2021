/*
Przygotuj klasę kalkulator posiadającą metody sum, divide, multiply, substract. Każda
z metod ma przyjmować dwie liczby i zwracać wynik. Przygotuj odpowiednią
implementację oraz testy jednostkowe sprawdzające działanie każdej z metod.
*/

package playground.week3.exercises.unittests.ex21;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ex21 {

    public double sum(double x, double y) {
        log.info("adding {} and {}", x, y);
        log.info("result = {}", x + y);
        return x + y;
    }

    public double subtract(double x, double y) {
        log.info("subtracting {} and {}", x, y);
        log.info("result = {}", x - y);
        return x - y;
    }

    public double multiply(double x, double y) {
        log.info("multiplying {} by {}", x, y);
        log.info("result = {}", x * y);
        return x * y;
    }

    public double divide(double x, double y) {
        log.info("dividing {} by {}", x, y);
        if (0 == y) {
            throw new ArithmeticException("can't divide by 0");
        }
        log.info("result = {}", x / y);
        return x / y;
    }
}
