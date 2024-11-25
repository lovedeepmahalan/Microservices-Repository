package Array_Explaination;

import java.util.Scanner;

public class Print_2DArray {

	public static Scanner sc=new Scanner(System.in);
	public static void printArray(int a,int b) {
		int[][] arr=new int[a][b];
		
		for(int p=0;p<a;p++) {
			for(int q=0;q<b;q++) {
				System.out.println("Enter the value of array indices "+p +","+q);
				arr[p][q]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a;i++) {
			for(int x=0;x<b;x++) {
				System.out.print(arr[i][x]+",");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the no of rows...");
		int a=sc.nextInt();
		System.out.println("Enter the number of columns...");
		int b=sc.nextInt();
		printArray(a, b);
		
		//simillarly we can crate 2_D ArrayList also
	}
}
