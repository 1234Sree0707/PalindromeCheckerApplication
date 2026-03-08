package com.seveneleven.palindromecheckerapp.main;
/**
 * MAIN CLASS
 * 
 * Use Case 2 : HardCoded Palindrome Validation
 * 
 * Description:
 * This class demonstrates basic palindrome validation using a hardcoded string value
 * 
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether a string is palindrome
 * - Displays the result on the console
 * 
 * This use case introduces fundamental comparison logic before using advanced data structures.
 * 
 * @author Developer
 * @version 2.0
 * 
 */
public class PalindromeChecker {
	public static void main(String args[]) {
		String str="madam";
		boolean isPalindrome=true;
		int k=str.length()-1;
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(k)) {
				isPalindrome=false;
			}
			k--;
			
		}
		System.out.println("Input text: madam");
		System.out.println("Is It a Palindrome ? : " + isPalindrome);
	}
}
