package Array_Explaination;

import java.util.Scanner;

public class Transpose_Matrix {

	static Scanner sc=new Scanner(System.in);
	public static void squareMatrix(int a) {
		int[][] arr=new int[a][a];
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				System.out.print("Enter the value of matrix at indices "+i+","+j+" ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix before transpose");
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(i<j) {
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		
		System.out.println("MAtrix after transpose");
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}//time complexity is O(n^2)
	
	public static void rectunglarMatrix(int a,int b) {
		int[][] arr=new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print("Enter the value of matrix at indices "+i+","+j+" ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix before transpose");
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		
		//transpose the value
		int[][] transpose_arr=new int[b][a];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				transpose_arr[j][i]=arr[i][j];
			}
		}
		
		System.out.println("Matrix after transpose ...");
		
		for(int i=0;i<b;i++) {
			for(int j=0;j<a;j++) {
				System.out.print(transpose_arr[i][j]+",");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		System.out.print("Enter the value of row size   ");
		int a=sc.nextInt();
		System.out.println("Enter the value of column size  ");
		int b=sc.nextInt();
		if(a==b) {
			squareMatrix(a);
		}else {
			rectunglarMatrix(a, b);
		}
	}
}
