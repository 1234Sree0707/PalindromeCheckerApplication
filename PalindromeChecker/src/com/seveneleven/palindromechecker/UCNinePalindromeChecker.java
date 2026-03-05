package com.seveneleven.palindromechecker;
import java.util.*;
public class UCNinePalindromeChecker {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	System.out.println("Enter a string:");
	name=sc.nextLine();
	UCNinePalindromeChecker checker=new UCNinePalindromeChecker();
	boolean result=checker.isPalindrome(name,0,name.length()-1);
	System.out.println("Ispalindrome? "+result);
	sc.close();
	}
	private boolean isPalindrome(String s,int start,int end) {
		if(start>=end) {
			return true;
		}
		else if(s.charAt(start)!=s.charAt(end)) {
			return false;
		}
		return isPalindrome(s,start+1,end-1);
		
		
	}
	
}
