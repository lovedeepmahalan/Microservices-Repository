package Recursive_function;

import java.util.Scanner;

public class StairsProblem {

	//to reach at nth stair if we take 1 or 2 steps at a time
	public static int stairs(int a) {
		//base case
		if(a==1||a==2) {
			return a;
		}
		return stairs(a-1)+stairs(a-2);
	}//its time complexity is O(2^n) because it is tree like structure and height of tree is n
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a =sc.nextInt();
		System.out.println(stairs(a));
	}
}
