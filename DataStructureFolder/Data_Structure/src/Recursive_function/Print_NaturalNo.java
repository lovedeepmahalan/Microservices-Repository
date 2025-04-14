package Recursive_function;

import java.util.Scanner;

public class Print_NaturalNo {

	public static void printNumbers(int a,int b) {
		if(a>b) {
			return;
		}
		System.out.print(a +" ");
		printNumbers(a+1,b);
	}// its time complexity is o(n)
	
	//this is using reverse stack technique 
	public static void printNumberInReverseOrder(int a,int b) {
		if(a>b) {
			return;
		}
		printNumberInReverseOrder(a+1, b);
		System.out.print(a + " ");
	}// its time complexity is o(n)
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbr a");
		int a=sc.nextInt();
		System.out.println("Entr the number b");
		int b=sc.nextInt();
		printNumbers(a, b);
		System.out.println();
		printNumberInReverseOrder(a, b);
	}
}
