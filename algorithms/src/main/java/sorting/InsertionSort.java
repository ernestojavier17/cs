package sorting;

public class InsertionSort {

    public void sort(int[] a) {
        int key = 0;
        for (int i = 0; i < a.length; i++) {
            key = a[i];
            for (int j = i; j > 0; j--) {
                if (key < a[j-1]) {
                    a[j] = a[j-1];
                    a[j-1] = key;
                } else {
                    break;
                }
            }
        }
    }

    public void sortSintax2(int[] a) {
        int key = 0;
        for (int i = 0; i < a.length; i++) {
            key = a[i];
            for (int j = i; j > 0 && key < a[j-1]; j--) {
                a[j]   = a[j-1];
                a[j-1] = key;
            }
        }
    }

}
