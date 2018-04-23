import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {

    Palindrome myPalindrome = new Palindrome();

    @Test
    public void testIsPalindrome() {
        assertEquals(myPalindrome.isPalindrone("racecar"), true);
        assertEquals(myPalindrome.isPalindrone("civic"), true);
        assertEquals(myPalindrome.isPalindrone("radar"), true);
    }

    @Test
    public void testIsNotPalindrome() {
        assertEquals(myPalindrome.isPalindrone("kitten"), false);
        assertEquals(myPalindrome.isPalindrone("milkshake"), false);
        assertEquals(myPalindrome.isPalindrone("robot"), false);
    }
}
