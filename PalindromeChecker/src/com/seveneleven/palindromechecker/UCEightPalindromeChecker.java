package com.seveneleven.palindromechecker;
import java.util.*;

class Node {
    char data;
    Node next;
    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UCEightPalindromeChecker {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter a string");
        name = sc.nextLine();

        // Build linked list
        Node node = new Node(name.charAt(0));
        Node head = node;
        for (int i = 1; i < name.length(); i++) {
            node.next = new Node(name.charAt(i));
            node = node.next;
        }

        // Find middle using slow/fast pointers
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node middle = reverse(slow);

        // Compare halves
        boolean isPalindrome = true;
        Node temp = head;
        while (middle != null) {
            if (temp.data != middle.data) {
                isPalindrome = false;
                break;
            }
            temp = temp.next;
            middle = middle.next;
        }

        System.out.println(isPalindrome);
    }

    // Helper method to reverse a linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}