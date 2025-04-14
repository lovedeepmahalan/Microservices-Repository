package CyclicSort;

public class FirstPositiveMissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,-1,1,2,3,6,6};
		System.out.println(byCyclicSort(arr));
	}

	private static int byCyclicSort(int[] arr) {
		int n=arr.length;
		int i=0;
		while(i<n) {
			int ele=arr[i];
			if(ele<=0||ele==arr[i]+1||ele>n||ele==arr[ele-1]) {
					i++;
			}else {
				int temp=arr[i];
				arr[i]=arr[temp];
				arr[temp]=arr[i];
			}
			for(i=0;i<n;i++) {
				if(arr[i]!=i+1) {
					return i+1;
				}
			}
			
		}
		return i;
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
