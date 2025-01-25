package Recursive_function;

public class Print_NaturalNumberAfterRecursion {

	public static void printNaturalNumberIncOrder(int a) {
		if (a==0) return;
		printNaturalNumberIncOrder(a-1);
		System.out.print(a+" ");
	}
	
	public static void printNaturalNumberDesOrder(int a,int b) {
		if (a==b) return;
		printNaturalNumberDesOrder(a+1, b);
		System.out.print(a+" ");
	}
	public static void main(String[] args) {
		System.out.print("Natural number in increasing order : ");
		printNaturalNumberIncOrder(12);
		System.out.println();
		System.out.print("Natural number in descending order : ");
		printNaturalNumberDesOrder(1, 12);
	}
}
