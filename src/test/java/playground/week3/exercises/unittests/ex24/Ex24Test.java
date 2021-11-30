package playground.week3.exercises.unittests.ex24;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Ex24Test {

    Ex24 ex24 = new Ex24();

    @Test
    public void calculateBMITest() {
        assertEquals(24.85, ex24.calculateBMI(86, 186), 0.1);
        assertEquals(32, ex24.calculateBMI(100, 175), 1);
        assertNotEquals(17.43, ex24.calculateBMI(54, 176), 0);
    }
}
