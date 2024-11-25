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
		Merge_Sort(arr,0,a-1);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	public static void Merge_Sort(int[] arr,int low,int high) {
		if(high>low) {
			int mid=(low+high)/2;
			Merge_Sort(arr,low,mid);
			Merge_Sort(arr, mid+1, high);
			combine(arr,low,mid,high);
		}
	}
	public static void combine(int arr[],int low,int mid,int high)
	{
	int[] c =new int[high+1];
	//logic of merging both the arrays[bags]
	int i = low;
	int j = mid+1;
	int k = low;
	//Check whether both bag contains element or not
	while (i<=mid && j<=high)
	{
	if (arr[i]< arr[j])
	{
	c[k]= arr[i];
	i++;
	}
	else
	{
	c[k] = arr[j];
	j++;

	}
	k++;
	}
	//1st bag empty
	if (i>mid)
	{
	//copy all 2nd bag elements to new bag
	while (j<=high)
	{
	c[k]=arr[j];
	j++;
	k++;
	}
	}
	else
	{
	//copy all 1st bag elements to new bag
	while (i<=mid)
	{
	c[k]=arr[i];
	i++;
	k++;
	}
	}
	//Copy from old bag to new bag
	for (k=low;k<=high;k++ )
	{
	arr[k] = c[k];
	}
	}
//time complexity is O(nlogn)
}
