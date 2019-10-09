/**
 * Name: Qingya Chen
 * ID: 1215416787
 * CSE 360 Assignment1
 * <p>
 * The method isPalindrome is to determine if a string is a palindrome.
 * A palindrome, for this assignment, is defined as a word or phrase consisting
 * of alphanumeric characters that reads the same frontwards and backwards 
 * while ignoring cases, punctuation and white space. 
 * <p>
 * If there are no alphanumeric characters, the string is considered a palindrome. 
 * The method should return true if it is a palindrome and false otherwise.
 * @author      Qingya_Chen
 * @version     %I%, %G%
 * @since       1.8
 */
package assign1;

/**
 * This class is write to set a value of a string and check if it is a
 * Palindrome
 */

public class Palindrome {
	private String testString;

	/**
	 * Sets a string to be checked if it is a Palindrome
	 *
	 * @param testString The string to be checked Must not be <code>null</code>.
	 */
	public Palindrome(String testString) {
		this.testString = testString;
	}

	/**
	 * Deal with null exception Replace all non-alphanumeric characters with "" and
	 * transfer to lower case if the corresponding element is same and they do not
	 * cross, check if they are Palindrome.
	 * 
	 * @return true if it is Palindrome, otherwise False
	 */
	public boolean isPalindrome() {
		int i = 0;
		if (testString == null)
			return false;
		testString = testString.replaceAll("[^A-Za-z0-9]", "");
		// replace all non-alphanumeric will ""
		testString = testString.toLowerCase();// transfer all alpha to lowercase
		boolean isP = true;
		if (testString.equals(""))
			isP = false;
		else {
			// when the corresponding element is same and do not cross, continue the loop
			while (testString.charAt(i) == testString.charAt(testString.length() - 1 - i)
					&& (i < (testString.length() - 1) / 2)) {
				i++;
			}
			// if the corresponding element is different
			if (!(testString.charAt(i) == testString.charAt(testString.length() - 1 - i))) {
				isP = false;
			}
		}
		return isP;
	}
}
