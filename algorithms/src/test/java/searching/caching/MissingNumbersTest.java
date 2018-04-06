package searching.caching;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 */
public class MissingNumbersTest {

    private MissingNumbers target;

    @Before
    public void setUp() {
        target = new MissingNumbers();
    }

    @Test
    public void missingNumbers_test1() {
        int[] arr = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] brr = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

        int[] results = target.missingNumbers(arr, brr);

        Assert.assertArrayEquals(new int[]{204, 205, 206}, results);
    }
}
