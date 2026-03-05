package com.seveneleven.palindromechecker;
import java.util.*;

public class UCSixPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();

        for (char c : input.toCharArray()) {
            q.add(c);
            s.push(c);
        }

        boolean isPalindrome = true;

        while (!q.isEmpty()) {
            char a = q.poll();
            char b = s.pop();
            if (a != b) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("isPalindrome? "+isPalindrome);
    }
}