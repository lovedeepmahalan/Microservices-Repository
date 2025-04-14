package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinerarSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of key");
		int n=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Enter the array value");
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
		int index=linear_Search(arr, a, n);
		if(index>=0) {
			System.out.println("Value will get at number ::"+index);
		}else{
			System.out.println("value not found");
		}
		
	}
	public static int linear_Search(int[] arr,int a,int n) {
		for(int i=0;i<=n;i++) {
			if(arr[i]==n) {
				return i+1;
			}
		}
		return -1;
	}//O(n)

}
