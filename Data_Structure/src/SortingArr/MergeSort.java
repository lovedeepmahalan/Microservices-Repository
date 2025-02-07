package SortingArr;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

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
		Merge_Sort(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	public static void Merge_Sort(int[] arr) {
		int n=arr.length;
		if(n==1) return;
		int[] arr1=new int[n/2];
		int[] arr2=new int[n-n/2];
		
		for(int i=0;i<n/2;i++) arr1[i]=arr[i];
		for(int i=0;i<(n-n/2);i++) arr2[i]=arr[n/2+i];
		
		Merge_Sort(arr1);
		Merge_Sort(arr2);
		
		merge(arr1, arr2, arr);
		//delete arr1 and arr2 to improve the space complexity
		arr1=null;
		arr2=null;//the array will by deleted by demon thread named called Garbage Collector.
	}
	
	private static void merge(int[] a, int[] b, int[] c) {

		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				c[k++]=a[i++];
			}else {
				c[k++]=b[j++];
			}
		}
		
			while(j<b.length) {
				c[k++]=b[j++];
			}
			while(i<a.length) {
				c[k++]=a[i++];
			}
	}

	
//time complexity is O(nlogn)
}
