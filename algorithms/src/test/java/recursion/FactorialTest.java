package recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

    private Factorial factorial;

    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void factorial_testFactorialOf5() {
        Assert.assertEquals(factorial.calFac(5), 120);
    }

    @Test
    public void factorial_testFactorialOf3() {
        Assert.assertEquals(factorial.calFac(3), 6);
    }

    @Test
    public void factorial_testFactorialOf1() {
        Assert.assertEquals(factorial.calFac(1), 1);
    }

    @Test
    public void factorial_testFactorialOf0() {
        Assert.assertEquals(factorial.calFac(0), 1);
    }

    @Test
    public void factorial_testFactorialOf10() {
        Assert.assertEquals(factorial.calFacIter(10), 3628800);
    }


    //**  Test Iterative factorial *//
    @Test
    public void factorial_testFactorialIterOf5() {
        Assert.assertEquals(120, factorial.calFacIter(5));
    }

    @Test
    public void factorial_testFactorialIterOf3() {
        Assert.assertEquals(factorial.calFacIter(3), 6);
    }

    @Test
    public void factorial_testFactorialIterOf1() {
        Assert.assertEquals(factorial.calFacIter(1), 1);
    }

    @Test
    public void factorial_testFactorialIterOf0() {
        Assert.assertEquals(factorial.calFacIter(0), 1);
    }

    @Test
    public void factorial_testFactorialIterOf10() {
        Assert.assertEquals(factorial.calFacIter(10), 3628800);
    }
}
