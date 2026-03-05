package com.seveneleven.palindromechecker;
import java.util.*;

public class UCThirteenPalindromeChecker {
	public static void main(String[] args) {

	     Scanner sc = new Scanner(System.in);

	     System.out.println("Enter String:");
	     String input = sc.nextLine();

	    

	     AlgorithmRunner.runAlgorithm("Stack Strategy", new StackStrategy(), input);
	     AlgorithmRunner.runAlgorithm("Deque Strategy", new DequeStrategy(), input);

	     sc.close();
	 }
}

class AlgorithmRunner {

 public static void runAlgorithm(String name, PalindromeStrategy strategy, String input) {

     long startTime = System.nanoTime();

     boolean result = strategy.checkPalindrome(input);

     long endTime = System.nanoTime();
     long executionTime = endTime - startTime;

     System.out.println("Algorithm: " + name);
     System.out.println("Is Palindrome: " + result);
     System.out.println("Execution Time (ns): " + executionTime);
    
 }
}

