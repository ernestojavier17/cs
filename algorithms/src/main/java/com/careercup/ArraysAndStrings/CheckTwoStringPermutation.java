package com.careercup.ArraysAndStrings;

import java.util.Arrays;

/**
 * Given two string, write a method to decide if one is a permutation of the other.
 */
public class CheckTwoStringPermutation {

    public boolean permutation(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        char[] charS1 = s1.toCharArray();
        char[] charS2 = s2.toCharArray();
        Arrays.sort(charS1);
        Arrays.sort(charS2);
        return (new String(charS1).equals(new String(charS2)));
    }
}
