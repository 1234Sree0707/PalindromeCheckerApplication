package com.seveneleven.palindromechecker;
import java.util.*;
public class UCFivePalindromeChecker {
	public static void main(String[] args) {
	Stack<Character> s=new Stack<>();
	String input="sreeram";
	for(char c:input.toCharArray()) {
		s.push(c);
	}
	boolean isPalindrome=true;
	for(char c:input.toCharArray()) {
		if(c==s.pop()) {
			continue;
		}else {
			isPalindrome=false;
			System.out.println(isPalindrome);
			return;
		}
	}
	System.out.println(isPalindrome);
	}
	
}
