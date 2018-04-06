package searching.caching;

import java.util.*;

/**
 * Problem: https://www.hackerrank.com/challenges/missing-numbers/problem
 */
public class MissingNumbers {

    int[] missingNumbers(int[] arr, int[] brr) {
        List<Integer> numbers = new ArrayList<>();

        Arrays.sort(arr);
        Arrays.sort(brr);

        int j = 0;

        for (int i = 0; i < brr.length; ) {
            int f1 = checkFrequency(i, brr);
            int f2 = checkFrequencyOfTarget(brr[i], j, arr);
            if(f1 != f2) {
                numbers.add(brr[i]);
            }
            i += f1;
            j += f2;
        }
        int[] r = numbers.stream().mapToInt(i -> i).toArray();
        return r;
    }

    int checkFrequency(int x0, int[] arr) {
        int f = 1;
        for (int i = x0 + 1; i < arr.length; i++) {
            if (arr[x0] == arr[i]) {
                f++;
            } else {
                break;
            }
        }
        return f;
    }

    int checkFrequencyOfTarget(int target, int x0, int[] arr) {
        int f = 0;
        for (int i = x0; i < arr.length ; i++) {
            if(target == arr[i]) {
                f++;
            } else {
                break;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        MissingNumbers t = new MissingNumbers();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for(int brr_i = 0; brr_i < m; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        int[] result = t.missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
