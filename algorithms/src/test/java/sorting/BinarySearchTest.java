package sorting;

import org.junit.Assert;
import org.junit.Test;
import searching.BinarySearch;

public class BinarySearchTest {

    @Test
    public void test_binarySearchRecursiveFirstElement() {
        int[] array = {1, 3, 8, 9, 10, 17, 20, 20, 23, 24};
        int numberToBeFind = 1;
        Assert.assertEquals(0, BinarySearch.binarySearchRecursive(array, numberToBeFind));
    }

    @Test
    public void test_binarySearchRecursiveElementNotFound() {
        int[] array = {1, 3, 8, 9, 10, 17, 20, 20, 23, 24};
        int numberToBeFind = 4;
        Assert.assertEquals(-1, BinarySearch.binarySearchRecursive(array, numberToBeFind));
    }

    @Test
    public void test_binarySearchRecursiveTenNotFound() {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int numberToBeFind = 11;
        Assert.assertEquals(9, BinarySearch.binarySearchRecursive(array, numberToBeFind));
    }

}
