package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckValidParenthesis {
	//check the input string parenthesis is valid or not.
	//like "({}) ==true , ({(]})==false
	public static void main(String[] args) {
		Stack<Character> st=new Stack<Character>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.next();
		boolean flag=true;
		for(char element:str.toCharArray()) {
			if(element=='(') {
				st.push(element);
			}else if(element=='{') {
				st.push(element);
			}else if(element=='[') {
				st.push(element);
			}else if(st.isEmpty()||st.pop()==element) {
				flag=false;break;
			}
		}
		if(!st.isEmpty()) {
			flag=false;
		}
		System.out.println(flag);
		
	}
}
