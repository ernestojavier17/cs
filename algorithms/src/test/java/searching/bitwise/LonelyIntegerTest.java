package searching.bitwise;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 */
public class LonelyIntegerTest {


    private LonelyInteger target;

    @Before
    public void setUp() {
        target = new LonelyInteger();
    }

    @Test
    public void lonelyinteger_test1() {
        int[] arr = new int[]{0, 0, 1, 2, 1};

        Assert.assertEquals(target.lonelyIntegerXOR(arr), 2);
    }
}
