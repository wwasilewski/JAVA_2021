package playground.week3.exercises.regex.ex2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Ex2Test {

    Ex2 ex2 = new Ex2();

    @Test
    public void checkIfZipCodeTest() {
        assertTrue(ex2.checkIfZipCode("12-212"));
        assertTrue(ex2.checkIfZipCode("00-123"));
        assertTrue(ex2.checkIfZipCode("99-999"));
        assertFalse(ex2.checkIfZipCode("11-a12"));
        assertFalse(ex2.checkIfZipCode("1-a12"));
        assertFalse(ex2.checkIfZipCode("11-a1"));
        assertFalse(ex2.checkIfZipCode("11+222"));
    }
}
