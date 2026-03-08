package com.seveneleven.palindromecheckerapp.main;

import java.util.Scanner;

/**
 * MAIN CLASS
 * 
 * Use Case 4 : Character Array Based Validation
 * 
 * Description:
 * This class validates a palindrome by converting the string into a character array
 * and comparing using the two pointer technique.
 * 
 * At this stage, the application;
 * - Converts string into char array
 * - Uses start and end pointers
 * - Compares characters differently
 * - Displays the result
 * 
 * This reduces extra memory usage.
 * 
 * @author Developer
 * @version 4.0
 * 
 * 
 */
public class PalindromeChecker {
	
	/**
	 * Application entry point for UC4.
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		
		Scanner u=new Scanner(System.in);
		//Take input for input string.
		String input=u.nextLine();
		//Convert the string into character array.
		char[] chars=input.toCharArray();
		//Declare and initialize a variable for the start of the array.
		int start=0;
		//Declare and initialize a variable for the end of the array.
		int end=chars.length -1;
		//Assume palindrome initially.
		boolean isPalindrome=true;
		
		//Loop and check palindrome.
		while(start<end) {
			if(chars[start] != chars[end]) {
				isPalindrome=false;
			}
			start++;
			end--;
		}
		
		System.out.println("Input : " + input);
		System.out.println("Is Palindrome ? : " + isPalindrome);

	}

}
