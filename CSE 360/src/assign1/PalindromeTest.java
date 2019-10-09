package assign1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	public void test1() {
		Palindrome newPalindrome = new Palindrome("abcba");
		boolean test1 = newPalindrome.isPalindrome();
		assertTrue("'abcba' is Palindrome", test1);
	}// basic palindrome case

	@Test
	public void test2() {
		Palindrome newPalindrome = new Palindrome("abc");
		boolean test2 = newPalindrome.isPalindrome();
		assertFalse("'abc' is not Palindrome", test2);
	}// basic non-palindrome case

	@Test
	public void test3() {
		Palindrome newPalindrome = new Palindrome("   ");
		boolean test3 = newPalindrome.isPalindrome();
		assertFalse("'   ' is not Palindrome", test3);
	}// case with spaces

	@Test
	public void test4() {
		Palindrome newPalindrome = new Palindrome("*&huufyuy  ^%");
		boolean test4 = newPalindrome.isPalindrome();
		assertFalse("'*&huufyuy  ^%' is not Palindrome", test4);
	}// case with non-alphanumeric chars

	@Test
	public void test5() {
		Palindrome newPalindrome = new Palindrome(null);
		boolean test5 = newPalindrome.isPalindrome();
		assertFalse("null is not Palindrome", test5);
	}// null is not palindrome

	@Test
	public void test6() {
		Palindrome newPalindrome_a = new Palindrome("ag     g  a");
		Palindrome newPalindrome_b = new Palindrome("agga");
		boolean test6a = newPalindrome_a.isPalindrome();
		boolean test6b = newPalindrome_b.isPalindrome();
		assertEquals("'ag     g  a' and 'agga' are same and are both Palindrome", test6a, test6b);
	}// to check if the spaces affect palindrome

	@Test
	public void test7() {
		Palindrome newPalindrome = new Palindrome("a2e3e2a");
		boolean test7 = newPalindrome.isPalindrome();
		assertTrue("'a2e3e2a' is Palindrome", test7);
	}// to check the string with both numbers and alpha

}
