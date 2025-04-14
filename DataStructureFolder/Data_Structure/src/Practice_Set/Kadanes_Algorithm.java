package Practice_Set;

public class Kadanes_Algorithm {

	public static int findMax(int[] arr) {
		int sum=0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			max=(sum>max ? sum:max);
			sum=(sum<0 ? 0:sum);
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr= {2,-3,4,6,-12,3,6,8,4,-5};
		System.out.println("MAx sum is :: "+findMax(arr));
	}
}
