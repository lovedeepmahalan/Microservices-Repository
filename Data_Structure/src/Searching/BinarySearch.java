package Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the size of an array :: ");
	int n = scan.nextInt();
	//Creating an Array
	int[] arr = new int[n];
	//loop to read the array elements
	for (int i=0;i<= n-1;i++ )
	{
	System.out.print("Enter the array element:: ");
	arr[i] = scan.nextInt();
	}
	//Asking to enter the key element
	System.out.print("Enter the key element :: ");
	int key =scan.nextInt();
	int index = binary_search(arr,n,key);
	//processing it based on the index value
	scan.close();
	if (index == -1)
	{
	System.out.println("Key element not found");
	}
	else
	{
	System.out.println("Key element found at index :: "+index);
	}
	}
	public static int binary_search(int[] arr,int n,int key)
	{
	int L = 0;
	int H = n-1;
	while (L<=H)
	{
	int mid =(L+H)/2;
	if (key==arr[mid])
	return mid;
	else if(key > arr[mid])
	L=mid+1;
	else if(key < arr[mid])
	H=mid-1;

	}
	return -1;
	}
}
