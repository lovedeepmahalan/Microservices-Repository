package com.stack;

import java.util.Stack;

public class ReverseStackRecurvisey {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(12);
		stack.push(34);
		stack.push(35);
		stack.push(36);
		stack.push(37);
		stack.push(38);
		System.out.println(stack);
		printRecursively(stack);
	}

	private static void printRecursively(Stack<Integer> stack) {
		if(stack.isEmpty()) return;
		System.out.print(stack.pop());
		printRecursively(stack);
		
	}
}
