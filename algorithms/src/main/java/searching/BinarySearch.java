package searching;

public class BinarySearch {

    static int binarySearchRecursive(int[] array, int low, int high, int data) {

        int middle = low + (high - low) / 2;

        if(low > high) {
            // We could conclude that the number is not in the array.
            return -1;
        }
        if(data == array[middle]) {
            return middle;
        }
        if(data < array[middle]) {
            return binarySearchRecursive(array, low, middle - 1, data);
        } else {
            return binarySearchRecursive(array, middle + 1, high, data);
        }
    }

    public static int binarySearchRecursive(int[] array, int data) {
        return binarySearchRecursive(array, 0, array.length -1, data);
    }
}
