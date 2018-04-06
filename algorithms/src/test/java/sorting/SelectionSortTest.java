package sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {

    private SelectionSort selectionSort;

    @Before
    public void setU() {
        selectionSort = new SelectionSort();
    }

    @Test
    public void test_sortSmallArray() {
        int[] arr = {64, 25, 12, 22, 11};
        int[] sorted = {11, 12, 22, 25, 64};

        selectionSort.sort(arr);
        Assert.assertArrayEquals(arr, sorted);
    }

    @Test
    public void test_sortArrayWorstCase() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        selectionSort.sort(arr);
        Assert.assertArrayEquals(arr, sorted);
    }
}
