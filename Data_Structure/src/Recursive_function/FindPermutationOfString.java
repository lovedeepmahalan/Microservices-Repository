package Recursive_function;

public class FindPermutationOfString {

	public static void main(String[] args) {
		String str="Arun";
		String ans="";
		findPermutation(str,ans);
	}

	private static void findPermutation(String str, String ans) {
		if(str.length()==0) {
			System.err.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String left=str.substring(0,i);
			String right=str.substring(i+1);
			findPermutation( left+right,ans+ch);
		}
		
	}
}
