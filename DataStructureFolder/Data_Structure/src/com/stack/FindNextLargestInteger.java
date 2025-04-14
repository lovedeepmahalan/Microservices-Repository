package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class FindNextLargestInteger {
    public static void main(String[] args) {
        int[] arr = {23, 12, 56, 34, 42, 78, 43};
        nextLarger(arr);
    }

    private static void nextLarger(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Start from the last element
        for (int i = n - 1; i >= 0; i--) {
            // Remove smaller or equal elements from stack
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element exists
            output[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element onto stack
            stack.push(arr[i]);
        }

        // Print output array
        System.out.println("Next larger elements: " + Arrays.toString(output));
    }
}
