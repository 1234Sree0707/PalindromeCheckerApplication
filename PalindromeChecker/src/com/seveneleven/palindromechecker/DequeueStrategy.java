package com.seveneleven.palindromechecker;

import java.util.*;
public class DequeueStrategy{
	public  boolean check(String name) {
		//Takes user input
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
				return isPalindrome;
			}
			d.pollFirst();
			d.pollLast();
		}
		return isPalindrome;
	}
}