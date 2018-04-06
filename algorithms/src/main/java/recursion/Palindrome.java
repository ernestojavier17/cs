package recursion;

import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(String word) {
        char[] a = word.toCharArray();
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            if (a[i] != a[j]) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeR(char[] a, int s, int e) {
        //Base case #1
        if(s == e) { // All the array was checked or the end of sub-problems
            return true;
        }
        //Base case #2
        if(a[s] != a[e]) {
            return false;
        }
        //Recursive case
        return isPalindromeR(a, s + 1, e - 1);
    }

    public int palindromeIndex(char[] word) {
        int index = -1;
        int i = 0;
        int j = word.length - 1 - i;

        while(i < j) {
            if(word[i] != word[j]) {
                if(index != -1) {
                    index = -1;
                    break;
                }
                if(word[i + 1] == word[j]) {
                    index = i;
                    i++;
                } else if(word[i] == word[j - 1]) {
                    index = j;
                    j--;
                } else {
                    break;
                }
            }
            i++;
            j--;
        }
        return index;
    }

    public static int palindromeIndex(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                if(s.charAt(i+1) != s.charAt(j))
                    return j;
                else if(s.charAt(i) != s.charAt(j-1))
                    return i;
                else {
                    if(s.charAt(i+2) != s.charAt(j-1))
                        return j;
                    if(s.charAt(i+1) != s.charAt(j-2))
                        return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
