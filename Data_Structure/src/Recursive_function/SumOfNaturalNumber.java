package Recursive_function;

public class SumOfNaturalNumber {

	//By passing a extra parameter
	public static void findSumOfNaturalNumber(int a,int b) {
		if(a==0) {
			System.out.println(String.format("Sum of natural number is %d", b));;
			return ;
		}
		findSumOfNaturalNumber(a-1, b+a);
	}
	
	//without using an extra parameter
	
	public static int SumOfNaturalNumber(int a) {
		if(a==0) {
			return 0;
		}
		return (a + SumOfNaturalNumber(a-1));
	}
	public static void main(String[] args) {
		findSumOfNaturalNumber(12, 0);
		System.out.println(SumOfNaturalNumber(12));
	}
}
