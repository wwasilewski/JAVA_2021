package playground.week3.exercises.unittests.ex21;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Ex21Test {

    Ex21 ex21 = new Ex21();

    @Test
    public void sumTest() {
        assertEquals(8, ex21.sum(3, 5), 0);
        assertEquals(8.6, ex21.sum(3.5, 5.1), 0);
        assertEquals(21, ex21.sum(21, 0), 0);
    }

    @Test
    public void subtractTest() {
        assertEquals(3, ex21.subtract(8, 5), 0);
        assertEquals(3.5, ex21.subtract(5, 1.5), 0);
        assertEquals(0, ex21.subtract(5.4, 5.4), 0);
    }

    @Test
    public void multiplyTest() {
        assertEquals(24, ex21.multiply(6, 4), 0);
        assertEquals(12.6, ex21.multiply(3.5, 3.6), 0);
        assertEquals(9.31, ex21.multiply(4, 2.33), 0.1);
    }

    @Test
    public void divideTest() {
        assertEquals(4, ex21.divide(8, 2), 0);
        assertEquals(3.5, ex21.divide(7, 2), 0);
        assertEquals(2.58, ex21.divide(6, 2.33), 0.1);

        try {
            ex21.divide(10, 0);
            Assert.fail();
        } catch (ArithmeticException e) {
            assertThat(e.getMessage(), is("can't divide by 0"));
        }
    }
}
