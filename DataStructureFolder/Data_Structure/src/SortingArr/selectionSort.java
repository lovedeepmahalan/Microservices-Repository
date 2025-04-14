package SortingArr;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Enter the array value");
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Selection_sort(arr,a);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	public static void Selection_sort(int[] arr,int a) {
		for(int i=0;i<a-1;i++) {
			int min=arr[i];
			int k=i;
			for(int j=i+1;j<a;j++) {
				if(arr[j]<min) {
					min=arr[j];
					k=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
	}//O(n^2)
}
