package com.seveneleven.palindromechecker;
import java.util.*;
public class UCElevenPalindromeChecker {
	public static void main(String[] args){
		PalindromeService pd=new PalindromeService();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String name=sc.nextLine();
		boolean result=pd.checkPalindrome(name);
		System.out.println("isPalindrome? "+result);
		
	}

}
class PalindromeService{
	public boolean checkPalindrome(String s) {
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				return false;
			}else {
				continue;
			}
		}
		return true;
	}
	
}
