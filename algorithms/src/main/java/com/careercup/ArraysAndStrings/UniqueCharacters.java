package com.careercup.ArraysAndStrings;

/**
 * Implement an algorithm to determine if a string has unique characters. What if you cannot use additional data
 * structures?
 */
public class UniqueCharacters {

    public static final int ASCII_TABLE_SIZE = 128;

    boolean isUniqueChars(String str) {
        if(str.length() > ASCII_TABLE_SIZE) {
            return false;
        }
        boolean[] array = new boolean[ASCII_TABLE_SIZE];
        for(int i=0; i<str.length(); i++) {
            int c = str.charAt(i);
            if(array[c]) {
                return false;
            } else {
                array[c] = true;
            }
        }
        return true;
    }
}
