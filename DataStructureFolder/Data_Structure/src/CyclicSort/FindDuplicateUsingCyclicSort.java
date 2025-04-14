package CyclicSort;

public class FindDuplicateUsingCyclicSort {

	public static void main(String[] args) {
		int arr[]= {1,2,1,6,3,4,5};
		System.out.println(findDuplicate(arr));
	}

	private static int findDuplicate(int[] arr) {
		
		int n=arr.length;
		while(true) {
			int i=arr[0];
			if(arr[i]==i)return i;
			else {
				int temp=arr[i];
				arr[i]=arr[temp];
				arr[temp]=temp;
			}
		}
	}
}
