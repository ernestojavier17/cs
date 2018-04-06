package sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {

    private InsertionSort insertionSort;

    @Before
    public void setUP() {
        insertionSort = new InsertionSort();
    }

    @Test
    public void sort_test01() {
        int[] a      = {10, 7, 3, 13, 2, 8, 5};
        int[] sorted = {2, 3, 5, 7, 8, 10, 13};

        insertionSort.sort(a);

        Assert.assertArrayEquals(sorted, a);
    }

    @Test
    public void test_sortSmallArray() {
        int[] arr = {64, 25, 12, 22, 11};
        int[] sorted = {11, 12, 22, 25, 64};

        insertionSort.sort(arr);
        Assert.assertArrayEquals(arr, sorted);
    }

    @Test
    public void test_sortArrayWorstCase() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        insertionSort.sort(arr);
        Assert.assertArrayEquals(arr, sorted);
    }


    @Test
    public void sort_testSyntax2() {
        int[] a      = {10, 7, 3, 13, 2, 8, 5};
        int[] sorted = {2, 3, 5, 7, 8, 10, 13};

        insertionSort.sortSintax2(a);

        Assert.assertArrayEquals(sorted, a);
    }

    @Test
    public void test_sortArrayWorstCaseSyntax2() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        insertionSort.sortSintax2(arr);
        Assert.assertArrayEquals(arr, sorted);
    }
}
