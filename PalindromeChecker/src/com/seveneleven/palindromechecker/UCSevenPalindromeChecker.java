/*
 * UC 7
 * Check whether a given string is palindrome or not by using dequeue
 */
package com.seveneleven.palindromechecker;
import java.util.*;
public class UCSevenPalindromeChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		//Takes user input
		String name=sc.nextLine();
		//Declares a Deque of character datatype
		Deque<Character> d=new ArrayDeque<>();
		//inserts elements to the dequeue
		for(char c:name.toCharArray()) {
			d.addFirst(c);
		}
		boolean isPalindrome=true;
		while(d.size()>1) {
			//compares first and last element
			if(d.getFirst()!=d.getLast()) {
				isPalindrome=false;
				break;
			}
			d.pollFirst();
			d.pollLast();
		}
		System.out.println("Palindrome? "+isPalindrome);
	}
}
