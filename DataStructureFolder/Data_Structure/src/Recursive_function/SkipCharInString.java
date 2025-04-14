package Recursive_function;

public class SkipCharInString {

	public static void main(String[] args) {
		String s="Raghav";
		String str="";
		skipA(0,s,str);
	}
	//skip A and print whole string
	private static void skipA(int i, String s, String str) {
		if(i==s.length()) {
			System.out.println(str);
			return ;
		}
		
		if(s.charAt(i)!='a' && s.charAt(i)!='A') {
			str+=s.charAt(i);
		}
		skipA(i+1,s,str);
	}
}
