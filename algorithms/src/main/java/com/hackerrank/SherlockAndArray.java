/*
 * SherlockAndArray.java
 *
 * Jan 16, 2018
 *
 * Copyright (c) Smartmatic Corp.
 * 1001 Broken Sound Parkway NW, Suite D
 * Boca Raton FL 33487, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and propietary information of
 * Smartmatic Corp. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered
 * into with Smartmatic Corp.
 */
package com.leetcode.hackerrank;

import java.util.Scanner;

/**
 */
public class SherlockAndArray {


    String solve(int[] a) {
        if(a.length == 1) {
            return "YES";
        }

        int i = a.length / 2;

        int lSum = sumEachElements(a, 0, i);
        int rSum = sumEachElements(a, i + 1, a.length);

        if (lSum < rSum) {
            return goLeft(i, a);
        } else if (lSum > rSum) {
            return goRight(i, a);
        } else {
            return "YES";
        }
    }

    String goLeft (int i, int[] a) {
        String ans = "NO";
        while (i > 0 && i < a.length) {
            int lSum = sumEachElements(a, 0, i);
            int rSum = sumEachElements(a, i + 1, a.length);
            if (lSum == rSum) {
                ans = "YES";
                break;
            } else if(lSum < rSum) {
                i++;
            } else {
                break;
            }
        }
        return ans;
    }

    String goRight (int i, int[] a) {
        String ans = "NO";
        while (i > 0 && i < a.length) {
            int lSum = sumEachElements(a, 0, i);
            int rSum = sumEachElements(a, i + 1, a.length);
            if (lSum == rSum) {
                ans = "YES";
                break;
            } else if(lSum > rSum) {
                i--;
            } else {
                break;
            }
        }
        return ans;
    }

    int sumEachElements (int[] a, int min, int max) {
        int res = 0;

        for (int i = min; i < max; i++) {
            res += a[i];
        }

        return res;
    }


    public static void main(String[] args) {
        SherlockAndArray t = new SherlockAndArray();
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = t.solve(a);
            System.out.println(result);
        }
    }
}
