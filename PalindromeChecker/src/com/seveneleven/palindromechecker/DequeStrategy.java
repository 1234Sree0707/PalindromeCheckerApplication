package com.seveneleven.palindromechecker;
import java.util.*;
class DequeStrategy implements PalindromeStrategy {

	 public boolean checkPalindrome(String input) {

	     String str = input.replaceAll("\\s+", "").toLowerCase();
	     Deque<Character> deque = new ArrayDeque<>();

	     for(char c : str.toCharArray()) {
	         deque.addLast(c);
	     }

	     while(deque.size() > 1) {
	         if(!deque.removeFirst().equals(deque.removeLast())) {
	             return false;
	         }
	     }

	     return true;
	 }
}
