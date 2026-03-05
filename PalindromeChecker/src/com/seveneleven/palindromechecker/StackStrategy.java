package com.seveneleven.palindromechecker;
import java.util.*;
public class StackStrategy implements PalindromeStrategy{
	public boolean checkPalindrome(String input) {
		Stack<Character> s=new Stack<>();
		for(char c:input.toCharArray()) {
			s.push(c);
		}
		boolean isPalindrome=true;
		for(char c:input.toCharArray()) {
			if(c==s.pop()) {
				continue;
			}else {
				isPalindrome=false;
				return isPalindrome;
			}
		}
		return isPalindrome;
	}
	

}
