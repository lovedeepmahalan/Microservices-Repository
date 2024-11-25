package String_Explaination;

import java.util.Scanner;

public class BasicMethodOfString {

	private static Scanner sc=new Scanner(System.in);
	
	public static void stringInfo() {
		
		System.out.println("enter the string value");
		String str1=sc.nextLine();
		System.out.println(str1);
		
		//split function
		String str2="Lovedeep nitin shubham";
		String[] arr=str2.split(" ");
		for(String st:arr)
			System.out.println(st);
		
		String str3="Lovedeep";//L=65
		String str4="lovedeep";//l=97
		System.out.println(str3.compareTo(str4));//65-97=-32
		
		String str5="Lovedeep";
		System.out.println(str5.replace("L", "l"));
		System.out.println(str5.startsWith("love"));//true
		System.out.println(str5.endsWith("dep"));//false
	}
	
	public static void main(String[] args) {
		stringInfo();
	}
}
