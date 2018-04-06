package com.careercup.ArraysAndStrings;

import java.util.HashMap;

/**
 * Given a smaller string S and a bigger string B, design and algorithm to find all permutations of the shorter string
 * within the longer one. Print the location of each permutation.
 */
public class FindAllPermutation {


    public static void findPermutations(String s, String b) {
        HashMap<Character, CharFrequency> freqTable = getFrequencyMap(s);
        int wordLength = s.length();
        char[] array = b.toCharArray();
        for(int i=0; i < array.length - wordLength; i++) {
            boolean permutationBroken = false;
            for(int j=i; j < wordLength; j++) {
                if(freqTable.get(array[j]) == null) {
                    i += j;
                    permutationBroken = true;
                    break;
                } else {
                    if(!removeFrequency(array[j], freqTable)) {
                        permutationBroken = true;
                        break;
                    }
                }
            }
            // Look if there is match in all words.
            if(!permutationBroken) {
                if(permutationFound(freqTable)) {
                    System.out.println("Found at Index: "+i);
                }
            } else {
                //restartFrequencyCounters(freqTable);
            }
        }
    }

    static boolean removeFrequency(char c, HashMap<Character, CharFrequency> freqTable) {
        CharFrequency freq = freqTable.get(c);
        return freq.reduceByOne();
    }

    static boolean permutationFound(HashMap<Character, CharFrequency> freqTable) {
         boolean found = true;
         for(CharFrequency cF : freqTable.values()) {
             if(cF.getValueReached() != 0) {
                 found = false;
                 break;
             }
         }
         return found;
    }

    static void restartFrequencyCounters(HashMap<Character, CharFrequency> freqTable) {
        for(CharFrequency cF : freqTable.values()) {
            cF.resetValueReached();
        }
    }

    static HashMap<Character, CharFrequency> getFrequencyMap(String s) {
        HashMap<Character, CharFrequency> map = new HashMap<>();
        char[] array = s.toCharArray();

        for(int i=0; i < array.length; i++) {
            CharFrequency freq = map.get(array[i]);
            if(freq == null) {
                map.put(array[i], new CharFrequency(1));
            } else {
                freq.setTotal(freq.getTotal() + 1);
            }
        }
        return map;
    }

    public static class CharFrequency {
        private int total;
        private int valueReached;

        public CharFrequency() {
        }

        public CharFrequency(int total) {
            this.total = total;
            this.valueReached = total;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getValueReached() {
            return valueReached;
        }

        public boolean reduceByOne() {
            boolean reduced = false;

            if(valueReached > 0) {
                valueReached -= 1;
                reduced = true;
            }
            return reduced;
        }

        public void resetValueReached() {
            valueReached = total;
        }

        public boolean checkValueReached() {
            boolean reached = false;
            if(valueReached == 0) {
                reached = true;
            }
            resetValueReached();
            return reached;
        }
    }

    public static void main(String[] args) {
        String s = "abbc";
        String b = "cbabadcbbabbcbabaabccbabc";

        findPermutations("ABCD", "BACDGABCDA");
        //Output:   Found at Index 0
        //          Found at Index 5
        //          Found at Index 6
    }
}
