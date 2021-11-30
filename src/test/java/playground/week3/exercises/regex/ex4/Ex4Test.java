package playground.week3.exercises.regex.ex4;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Ex4Test {

    Ex4 ex4 = new Ex4();

    @Test
    public void checkIfAlaTest() {
        assertTrue(ex4.checkIfAla("AAAAalaasasc"));
        assertTrue(ex4.checkIfAla("aaaaaalaaaa"));
        assertTrue(ex4.checkIfAla("123ala123"));
        assertFalse(ex4.checkIfAla("ALLA aa"));
        assertFalse(ex4.checkIfAla("aaal aa"));
        assertFalse(ex4.checkIfAla("asasadfwfqdca"));
    }
}
