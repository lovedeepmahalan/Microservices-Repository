package Array_Explaination;

public class Palindrome_Array {
	public static void checkPalindrome() {
	    int[] arr = {2, 3, 6, 5, 4, 3, 2};
	    int a = 0;
	    int b = arr.length - 1;
	    boolean isPalindrome = true; // Assume it's a palindrome initially

	    while (a < b) {
	        if (arr[a] != arr[b]) {
	            isPalindrome = false; // Found a mismatch
	            break;
	        }
	        a++;
	        b--;
	    }
	    //its time complexity is O(n) and space is O(1).
	    System.out.println(isPalindrome);
	}

	public static void main(String[] args) {
		checkPalindrome();
	}
}
