package CyclicSort;

public class FirstPositiveMissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,-1,1,2,3,6,6};
		System.out.println(byBrutForce(arr));
	}

	private static int byBrutForce(int[] arr) {
		
		int num=arr.length;
		int i;
		for(i=1;i<=num+1;i++) {
			boolean found=false;
			for(int j:arr) {
				if(i==j) {
					found =true;
					break;
				}
			}
			if(!found) {
				return i;
			}
		}
		return num+1;
	}
}
