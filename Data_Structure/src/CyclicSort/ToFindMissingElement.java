package CyclicSort;

public class ToFindMissingElement {

	public static void main(String[] args) {
		int[] arr= {1,0,3,2,4,6,5,9,8};
		System.out.println(missingNumber(arr));
	}

	private static int missingNumber(int[] arr) {
		int n=arr.length;
		int i=0;
		while(i<n) {
			if(arr[i]==i || arr[i]==n)i++;
			else {
				int temp=arr[i];
				arr[i]=arr[temp];
				arr[temp]=temp;
			}
			
		}
		for(i=0;i<n;i++) {
			if(arr[i]!=i) {
				return i;
			}
		}
		return -1;
	}

	private static int missingNo(int[] arr) {
	    int n = arr.length;
	    boolean[] b = new boolean[n + 1]; // Boolean array to track numbers

	    // Mark the numbers present in the array
	    for (int i : arr) {
	        if (i >= 0 && i <= n) { // Ensure i is within bounds
	            b[i] = true;
	        }
	    }

	    // Find the missing number
	    for (int i = 0; i <= n; i++) {
	        if (!b[i]) {
	            return i; // Return the first missing number
	        }
	    }

	    return -1; // Return -1 if no missing number found
	}
}
