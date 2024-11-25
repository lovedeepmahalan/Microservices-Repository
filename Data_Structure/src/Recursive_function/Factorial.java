package Recursive_function;

import java.util.Scanner;

public class Factorial {

	public static long factorial(int a) {
		//base case
		if(a==0||a==1) {
			return 1;
		}
		//recursive case
		return a*factorial(a-1);
	}//its time complexity is O(n)
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of which you want factoial");
		int a=sc.nextInt();
		System.out.println(factorial(a));
	}
}
