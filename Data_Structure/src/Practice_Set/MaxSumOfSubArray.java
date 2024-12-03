package Practice_Set;

public class MaxSumOfSubArray {

	public static int findMaxSum(int[] arr,int a) {
		int sum=0;
		for(int i=0;i<a;i++) {
			sum+=arr[i];
		}
		int ans=sum;
		int p=a;
		while(p<arr.length) {
			sum+=arr[p];
			sum-=arr[p-a];
			if(sum>ans)
				ans=sum;
			p++;
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr= {12,45,23,12,56,12,67,34,23,67,34,36};
		int a=3;
		System.out.println("max sum od sub array is "+findMaxSum(arr, a));
	}
}
