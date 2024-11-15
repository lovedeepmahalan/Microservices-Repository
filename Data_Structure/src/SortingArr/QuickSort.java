package SortingArr;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

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
		Quick_Sort(arr,0,a-1);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	public static void Quick_Sort(int[] arr,int low,int high) {
		int j;
		if(low<high) {
			j=partition(arr,low,high);
			Quick_Sort(arr,low,j);
			Quick_Sort(arr,j+1,high);
		}
	}
	public static int partition(int[] arr,int low,int high) {
		int key=arr[low];
		int i=low+1;
		int j=high;
		while(true) {
			while(arr[i]<key && i<high) {
				i++;
			}
			while(arr[j]>key && j>low) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			else {
				int temp=arr[low];
				arr[low]=arr[j];
				arr[j]=temp;
				System.out.println(j);
				return j;
			}
		}
	}

}
