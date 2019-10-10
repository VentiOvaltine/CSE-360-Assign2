/**
 * Name: Qingya Chen
 * ID: 1215416787
 * CSE 360 Assignment2
 * <p>
 * This is a simple Java program to learn github. It is easy to implement
 * <p>
 * This AddingMachine method has the function of doing adding and subtracting, calculate the total and 
 * print out the transaction
 * @author      Qingya_Chen
 * @version     %I%, %G%
 * @since       1.8
 */
package cse360assign2;
/**
 * This class is write to do doing adding and subtracting, calculate the total and 
 * print out the transaction
 */
public class AddingMachine {
	/**
	 * set the int total to store the result of calculation
	 * initialize the string
	 */
	private int total;
	private String transactionString = "";
	/**
	 * set the int total to store the result of calculation
	 * initialize the string
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	/** 
	 * @return the current total
	 */
	public int getTotal () {
		return this.total;
	}
	/** 
	 * @param value add the user's new number to the transactionString
	 */
	public void add (int value) {
		total += value;
		transactionString += " + " + value;
	}
	/** 
	 * @param value subtract the user's new number to the transactionString
	 */
	public void subtract (int value) {
		total -= value;
		transactionString += " - " + value;
	}
	/** 
	 * @return the string of object
	 */	
	public String toString () {
		return "0" + transactionString;
	}

	public void clear() {
		transactionString = "";
	}
}

