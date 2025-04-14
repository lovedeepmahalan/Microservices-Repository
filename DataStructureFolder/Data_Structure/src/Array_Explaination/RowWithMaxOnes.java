package Array_Explaination;

import java.util.Scanner;

public class RowWithMaxOnes {

	private static Scanner sc=new Scanner(System.in);
	public static void rowWithMaxOnes(int a,int b) {
		
		int count;
		int max=0;
		int p;
		int[][] arr=new int[a][b];
		for(p=0;p<a;p++) {
			for(int q=0;q<b;q++) {
				System.out.println("Enter the value of array indices "+p +","+q);
				arr[p][q]=sc.nextInt();
			}
		}
		
		for(p=0;p<a;p++) {
			count=0;
			for(int q=0;q<b;q++) {
				if(arr[p][q]==1)
					count++;
			}
			if(count>max)
				max=count;
		}
		System.out.println("Maximum no of 1 is "+max+"of row no. "+p);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the row value");
		int a=sc.nextInt();
		System.out.println("Enter the cloumn value");
		int b=sc.nextInt();
		rowWithMaxOnes(a,b);
	}
}
