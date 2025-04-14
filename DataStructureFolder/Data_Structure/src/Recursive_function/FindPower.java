package Recursive_function;

import java.util.Scanner;

public class FindPower {

	public static int findPower(int a,int b) {
		if(b==0)return 1;
		if(b==1)return a;
		return a*findPower(a, b-1);
	}//its time complexity is O(b)
	
	//using for loop
	public static int findPowerByLoop(int a,int b) {
		int y=1;
		for(int i=1;i<=b;i++) {
			y*=a;
		}
		return y;
	}//its time complexity is O(b)
	
	//efficient method of power
	public static int findPowerInEfficientWay(int a,int b) {
		if(b==0)return 1;
		if(b==1)return a;
		
		if(b%2 !=0) {
			int y =a*findPowerInEfficientWay(a, (b-1)/2);
			return a*y*y;
		}else {
			int x= (findPowerInEfficientWay(a, b/2));
			return x*x;
		}//its time complexity is O(log b)
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println(findPower(a, b));
		System.out.println();
		System.out.println(findPowerByLoop(a, b));
		System.out.println();
		System.out.println(findPowerInEfficientWay(a, b));
	}
}
