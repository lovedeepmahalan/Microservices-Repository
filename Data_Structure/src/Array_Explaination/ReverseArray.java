package Array_Explaination;
import java.util.*;
public class ReverseArray {

	public static void reverseByWhileLoop() {
		int[] arr= {12,34,56,34,12,6,5};
		int a=0;
		int b=arr.length-1;
		while(a<b) {
			int x=arr[a];
			arr[a]=arr[b];
			arr[b]=x;
			a++;
			b--;
		}
		
		for(int z:arr) {
			System.out.print(z);
		}
	}//its time complexity is O(n)
	
	//we can do it by one more type which is create a new array and insert all element in it.
	//and its time comlexity is O(n).
	
	public static void main(String[] args) {
		reverseByWhileLoop();
	}
}
