package com.seveneleven.palindromechecker;
import java.util.*;

class StackStrategy implements PalindromeStrategy {

	 public boolean checkPalindrome(String input) {

	     String str = input.replaceAll("\\s+", "").toLowerCase();
	     Stack<Character> stack = new Stack<>();

	     for(char c : str.toCharArray()) {
	         stack.push(c);
	     }

	     for(char c : str.toCharArray()) {
	         if(c != stack.pop()) {
	             return false;
	         }
	     }

	     return true;
	 }
}	 
	 
	 
