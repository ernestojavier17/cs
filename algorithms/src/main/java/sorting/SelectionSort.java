package sorting;


public class SelectionSort {

    public void sort(int[] array) {
        int minIndex = 0;

        //Find the smallest element from right to left and put it at the right position.
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
