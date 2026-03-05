package com.seveneleven.palindromechecker;
import java.util.*;
public class UCTenPalindromeChecker {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string");
		String name=sc.nextLine();
		String newname="";
		name.toLowerCase();
		for(char c:name.toCharArray()) {
			if(c!=' ') {
				newname+=c;
			
			}else {
				newname+="";
			}
			
			
		}
		boolean isPalindrome=true;
		for(int i=0;i<newname.length()/2;i++) {
			if(newname.charAt(i)!=newname.charAt(newname.length()-1-i)) {
				isPalindrome=false;
				break;
			}else {
				continue;
			}
			
		}
		System.out.println("isPalindrome? "+isPalindrome);
		
	}

}
