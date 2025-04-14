package com.stack;

import java.util.Stack;

public class PushElementAtBottom {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(12);
		stack.push(34);
		stack.push(35);
		stack.push(36);
		stack.push(37);
		stack.push(38);
		System.out.println(stack);
		
		//add element at bottom/any index of stack
		Stack<Integer> rev_Stack=new Stack<Integer>();
		while(stack.size()>=1) {
			rev_Stack.push(stack.pop());
		}
		System.out.println(rev_Stack);
		stack.add(11);//adding new element in stack at bottom
		while(rev_Stack.size()>=1) {
			stack.push(rev_Stack.pop());
		}
		System.out.println(stack);//original stack
	}
}
