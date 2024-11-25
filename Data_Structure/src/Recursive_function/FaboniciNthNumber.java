package Recursive_function;

import java.util.Scanner;

public class FaboniciNthNumber {

	public static int faboniciNumber(int a) {
		//base case
		if(a==0||a==1) {
			return 1;
		}
		return faboniciNumber(a-1)+faboniciNumber(a-2);
	}//its time complexity is O(2^n) because it is tree like structure and height of tree is n
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a =sc.nextInt();
		System.out.println(faboniciNumber(a));
	}
}
