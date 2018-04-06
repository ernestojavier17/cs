package searching.com.hr;

import com.leetcode.hackerrank.SherlockAndArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 */
public class SherlockAndArrayTest {

    private SherlockAndArray target;

    @Before
    public void setUp() {
        this.target = new SherlockAndArray();
    }

    @Test
    public void solve_test01() {

        int[] a = new int[] {1, 2, 3};

        Assert.assertEquals("NO", target.solve(a));
    }

    @Test
    public void solve_test02() {

        int[] a = new int[] {1, 2, 3, 3};

        Assert.assertEquals("YES", target.solve(a));
    }

    @Test
    public void solve_test03() {

        int[] a = new int[] {2, 2, 2, 2};

        Assert.assertEquals("NO", target.solve(a));
    }

    @Test
    public void solve_test04() {

        int[] a = new int[] {2, 2, 2, 2, 2};

        Assert.assertEquals("YES", target.solve(a));
    }
}
