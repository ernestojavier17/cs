/*
 * CommonElementsArray.java
 *
 * Jan 10, 2018
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
package searching.caching;

import java.util.Arrays;

/**
 * Problem: Given two arrays sorted and distinct, find numbers of elements in common between them.
 * Also Union and Intersection of two sorted arrays: (https://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/)
 * Also Given two arrays of integers, unsorted. Write a program to find the common elements within the two (
 * https://www.careercup.com/question?id=14946142)
 *
 */
public class CommonElementsArray {

    int[] findElementsInCommon(int[] arr, int[] brr) {
        int[] r = new int[1000];
        int i = 0, j = 0, y = 0;

        while(i < arr.length &&  j < brr.length) {
            if(arr[i] == brr[j]) {
                r[y++] = arr[i++];
                j++;
            } else if (arr[i] < brr[j])
                i++;
            else
                j++;

        }
        return findCeroValuePos(r);
    }

    int[] findCeroValuePos(int[] arr) {
        int pos = -1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                pos = i;
                break;
            }
        }
        int[] nArr;
        if(pos > 0) {
            nArr = new int[pos];
            for(int i = 0; i<nArr.length; i++) {
                nArr[i] = arr[i];
            }
            return nArr;
        } else
            return arr;
    }
}
