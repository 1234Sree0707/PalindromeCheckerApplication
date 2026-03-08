package com.seveneleven.palindromecheckerapp.main;

import java.util.Scanner;

/**
 * MAIN CLASS
 * 
 * Use Case 3: Reverse String Based Palindrome Check
 * 
 * Description:
 * 
 * This class checks whether a string is a palindrome 
 * by reversing the string and comparing it with the original value.
 * 
 * At this stage , the application :
 * 
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result. 
 * 
 * This introduces transformation-based validation.
 * 
 * @author Developer
 * @version 3.0
 * 
 * 
 */
public class PalindromeChecker {
	
	/**
	 * Application entry point for UC3
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		Scanner u=new Scanner(System.in);
		String input=u.nextLine();
		String temp="";
		boolean isPalindrome=false;
		for(int i=input.length()-1;i>=0;i--) {
			temp+=input.charAt(i);
		}
		if(input.equals(temp)) {
			isPalindrome=true;
		}
		System.out.println("Original : " + input);
		System.out.println("Reversed : " + temp);
		System.out.println("Is It a Palindrome ? : " + isPalindrome);
		
		 
		
	}

}
