package playground.week3.exercises.unittests.ex20;

import org.junit.Assert;
import org.junit.Test;

public class Ex20Test {

    Ex20 ex20 = new Ex20();

    @Test
    public void TestCountVowels() {
        Assert.assertEquals(3, ex20.countVowels("Wojciech"));
        Assert.assertEquals(4, ex20.countVowels("Magdalena"));
        Assert.assertEquals(4, ex20.countVowels("Katarzyna"));
        Assert.assertEquals(0, ex20.countVowels("Kkkkkk"));
    }

    @Test
    public void TestCountConsonants() {
        Assert.assertEquals(5, ex20.countConsonants("Wojciech"));
        Assert.assertEquals(2, ex20.countConsonants("anna"));
        Assert.assertEquals(4, ex20.countConsonants("Mmarta"));
        Assert.assertEquals(0, ex20.countConsonants("AAAaaa"));
    }
}