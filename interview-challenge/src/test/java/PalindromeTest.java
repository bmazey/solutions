import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {

    Palindrome myPalindrome = new Palindrome();

    @Test
    public void testIsPalindrome() {
        assertEquals(myPalindrome.isPalindrome("racecar"), true);
        assertEquals(myPalindrome.isPalindrome("civic"), true);
        assertEquals(myPalindrome.isPalindrome("radar"), true);
    }

    @Test
    public void testIsNotPalindrome() {
        assertEquals(myPalindrome.isPalindrome("kitten"), false);
        assertEquals(myPalindrome.isPalindrome("milkshake"), false);
        assertEquals(myPalindrome.isPalindrome("robot"), false);
    }
}
