package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveConjugativeRepatitiveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String:");
        String str = sc.next();
        Stack<Character> stack = new Stack<>();

        for (char element : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == element) {
                stack.pop();  // Remove consecutive duplicate
            } else {
                stack.push(element);  // Push unique character
            }
        }

        // Construct final string (characters should be in correct order)
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());  // Insert at beginning to maintain order
        }

        // Print final result
        System.out.println("Processed String: " + sb.toString());
    }
}
