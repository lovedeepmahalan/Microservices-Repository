package SortingArr;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Enter the array value");
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Bubble_Sort(arr,a);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	public static void Bubble_Sort(int arr[],int a) {
		for(int i=0;i<a-1;i++) {
			for(int j=0;j<a-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
	}

}
