package com.stack;

import java.util.Stack;

public class MakeACopyOfStack {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(12);
		stack.push(34);
		stack.push(35);
		stack.push(36);
		stack.push(37);
		stack.push(38);
		System.out.println(stack);
		//reverse the stack
		//create a new stack and add into it
		Stack<Integer> rev_Stack=new Stack<Integer>();
		while(stack.size()>=1) {
			rev_Stack.push(stack.pop());
		}
		System.out.println(rev_Stack);
		while(rev_Stack.size()>=1) {
			stack.push(rev_Stack.pop());
		}
		System.out.println(stack);//original stack
	}
}
