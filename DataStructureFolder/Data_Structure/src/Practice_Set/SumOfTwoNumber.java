package Practice_Set;

import java.util.Arrays;

public class SumOfTwoNumber {

	public static String findIndex(int[] arr,int num) {
		int[] arr1=new int[2];
		int a=0;
		int b=arr.length-1;
		while(a<b) {
			if((arr[a]+arr[b])>num) {
				b--;
				System.out.println("The value of b is "+b);
			}else if ((arr[a]+arr[b])<num) {
				a++;
				System.out.println("The value of a is "+a);
			}else {
				arr1[0]=a;
				arr1[1]=b;
				return Arrays.toString(arr1);
			}
		}
		return "no valid pair found";
		
	}
	public static void main(String[] args) {
		int[] arr= {1,3,5,7,11,12,14,15};
		int a=50;
		System.out.println("Indices of two number which sum is 21 are :: "+findIndex(arr, a));
	}
}
