package Recursive_function;

import java.util.Scanner;

public class Maze_Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows of matrix :");
		int a=sc.nextInt();
		System.out.print("Enter the column of matrix :");
		int b=sc.nextInt();
		System.out.println(maze(a,b));
	}

	private static int maze(int a, int b) {
		if(a==1 || b==1)return 1;
		int rightWays=maze(a-1,b);
		int leftWays =maze(a,b-1);
		return rightWays+leftWays;
	}
}
