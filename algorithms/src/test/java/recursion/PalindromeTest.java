package recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

    private Palindrome palindrome;

    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void isPalindrome_TrueOddWord() {
        Assert.assertTrue(palindrome.isPalindrome("rotor"));
    }

    @Test
    public void isPalindrome_TrueEvenWord() {
        Assert.assertTrue(palindrome.isPalindrome("redder"));
    }

    @Test
    public void isPalindrome_False() {
        Assert.assertFalse(palindrome.isPalindrome("motor"));
    }

    /**** Recursive ***/

    @Test
    public void isPalindromeR_TrueOddWord() {
        char[] w = "rotor".toCharArray();
        Assert.assertTrue(palindrome.isPalindromeR(w, 0, w.length - 1));
    }

    @Test
    public void isPalindromeR_TrueEvenWord() {
        char[] w = "redder".toCharArray();
        Assert.assertTrue(palindrome.isPalindromeR(w, 0, w.length - 1));
    }

    @Test
    public void isPalindromeR_False() {
        char[] w = "motor".toCharArray();
        Assert.assertFalse(palindrome.isPalindromeR(w, 0, w.length - 1));
    }

    @Test
    public void isPalindromeR_False_02() {
        char[] w = "ABCBDEFDBCBA".toCharArray();
        Assert.assertFalse(palindrome.isPalindromeR(w, 0, w.length - 1));
    }

    /**** Index ***/

    @Test
    public void indexPalindrome_WordIsPalindrome() {
        Assert.assertEquals(-1, palindrome.palindromeIndex("aaa".toCharArray()));
    }

    @Test
    public void indexPalindrome_WordIsNotPalindrome() {
        Assert.assertEquals(3, palindrome.palindromeIndex("aaab".toCharArray()));
    }
}
