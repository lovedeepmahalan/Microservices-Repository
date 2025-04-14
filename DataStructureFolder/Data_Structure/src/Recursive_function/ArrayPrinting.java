package Recursive_function;

public class ArrayPrinting {
	public static void main(String[] args) {
		int[] arr= {23,12,45,23,5,63};
		int a=0;
		printArray(a,arr);
	}

	private static void printArray(int a, int[] arr) {
		if(a==arr.length) return;
		System.out.println(arr[a]);
		printArray(a+1, arr);
		
	}
}
