package com.seveneleven.palindromechecker;


import java.util.*;

/**
 * MAIN CLASS
 * 
 * Use Case 12 : Strategy Pattern for Palindrome Algorithms
 * 
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the strategy design pattern.
 * 
 * No performance comparison is done in this use case.
 * The focus is purely on algorithm interchangeability.
 * 
 * The goal is to teach extensible algorithm design.
 * 
 * @author Developer
 * @version 12.0
 */
public class UCTwelvePalindromeChecker {

	public static void main(String[] args) {
		StackStrategy stackCheck=new StackStrategy();
		DequeueStrategy dequeCheck=new DequeueStrategy();
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("Input : " + input );
		System.out.println("Is Palindrome ? :(Using Stack) " + stackCheck.checkPalindrome(input));
		System.out.println("Is Palindrome ? :(Using Deque) " + dequeCheck.check(input));

	}

}