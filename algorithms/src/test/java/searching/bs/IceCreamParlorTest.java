package searching.bs;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IceCreamParlorTest {

    private IceCreamParlor target;

    @Before
    public void setUp() {
        target = new IceCreamParlor();
    }

    @Test
    public void icecreamParlor_test1() {
        int m = 4;
        int[] flavors = new int[]{1, 4, 5, 3, 2};

        int[] results = target.icecreamParlor(m, flavors);

        Assert.assertArrayEquals(new int[]{1, 4}, results);
    }

    @Test
    public void icecreamParlor_test2() {
        int m = 4;
        int[] flavors = new int[]{2, 2, 4, 3};

        int[] results = target.icecreamParlor(m, flavors);

        Assert.assertArrayEquals(new int[]{1, 2}, results);
    }


    @Test
    public void icecreamParlor_test3() {
        int m = 200;
        int[] flavors = new int[]{150, 24, 79, 50, 88, 345, 3};

        int[] results = target.icecreamParlor(m, flavors);

        Assert.assertArrayEquals(new int[]{1, 4}, results);
    }
}
