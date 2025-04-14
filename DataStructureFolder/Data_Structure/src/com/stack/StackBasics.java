package com.stack;

import java.util.Stack;

public class StackBasics {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(12);
		stack.push(34);
		stack.push(35);
		stack.push(36);
		stack.push(37);
		stack.push(38);
		System.out.println(stack);
		stack.pop();
		//how to excess first element
		while(stack.size()>1) {
			stack.pop();
		}
		//first element is 
		System.out.println(stack.peek());
	}
}
