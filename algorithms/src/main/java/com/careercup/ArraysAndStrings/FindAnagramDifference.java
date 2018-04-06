package com.careercup.ArraysAndStrings;

/**
 * Given two strings (lowercase a->z), how many characters do we need to remove (from either) to make them anagrams?
 * EXAMPLE: hello, billion --> ANSWER: 6 (he from hellow and biin from billion).
 */
public class FindAnagramDifference {

    public static final int LETTER_NUMBERS = 26;

    public int charactersToRemove(String first, String second) {
        int[] firstLettersCount = getLettersCount(first);
        int[] secondLettersCount = getLettersCount(second);

        int diff = 0;
        for(int i=0; i<LETTER_NUMBERS; i++) {
            if(firstLettersCount[i] != secondLettersCount[i]) {
                diff += Math.abs(firstLettersCount[i] - secondLettersCount[i]);
            }
        }
        return diff;
    }

    int[] getLettersCount(String s) {
        int[] lettersCount = new int[LETTER_NUMBERS];
        int offset = 'a';
        for(int i=0; i<s.length(); i++) {
            lettersCount[s.charAt(i) - offset]++;
        }
        return lettersCount;
    }
}
