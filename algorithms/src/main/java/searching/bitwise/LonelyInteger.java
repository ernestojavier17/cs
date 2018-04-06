package searching.bitwise;

import java.util.Scanner;

/**
 * Problem: https://www.hackerrank.com/challenges/ctci-lonely-integer/problem
 */
public class LonelyInteger {


    int lonelyinteger(int[] a) {
        // Complete this function
        int[] cache = new int[100];

        int r = -1;

        for (int i = 0; i < a.length; i++) {
            cache[a[i]] += 1;
        }

        for (int i = 0; i < cache.length; i++) {
            if(cache[i] == 1) {
                r = i;
                break;
            }
        }
        return r;
    }

    int lonelyIntegerXOR(int[] arr) {
        int value =0;
        for (int i = 0; i < arr.length; i++) {
            value ^= arr[i];
        }
        return value;
    }

    public static void main(String[] args) {
        LonelyInteger lI = new LonelyInteger();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lI.lonelyIntegerXOR(a);
        System.out.println(result);
    }

/* 3
 * 1 1 2 -> 2*/
/* 5
   0 0 1 2 1 -> 2 */
}
