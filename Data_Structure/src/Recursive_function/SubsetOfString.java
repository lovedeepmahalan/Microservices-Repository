package Recursive_function;

public class SubsetOfString {
	
	public static void main(String[] args) {
		String str="Love";
		int i=0;
		String ans="";
		printSubSet(i,str,ans);
	}

	private static void printSubSet(int i, String str, String ans) {
		
		if(i==str.length()) {
			System.out.println(ans);
			return ;
		}
		char ch=str.charAt(i);
		printSubSet(i+1, str, ans+ch);//take
		printSubSet(i+1, str, ans);//not take
		
	}
}
