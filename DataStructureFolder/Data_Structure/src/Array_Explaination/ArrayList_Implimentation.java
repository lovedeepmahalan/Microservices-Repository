package Array_Explaination;
import java.io.*;
import java.util.*;

public class ArrayList_Implimentation {

	

	
	    public static void main(String[] args) {
	        
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        
	        // add elements
	        arr.add(10);
	        arr.add(7);
	        arr.add(9);
	        
	        arr.set(1,300);
	        arr.remove(2);
	        
	        System.out.println(arr.contains(3)); // O(n) -1
	        System.out.println(arr.contains(30));//-1
	        
	        System.out.println(arr.indexOf(3));
	        System.out.println("Index of 3 is "+arr.indexOf(30));
	        
	        System.out.println(arr.isEmpty());
	        
	        // arr.clear();
	        
	        for(int i=0;i<arr.size();i++) {
	            System.out.print(arr.get(i)+" ");
	        }
	        System.out.println();
	        
	        System.out.println("Size: " + arr.size());
	        
	        ArrayList<String> students = new ArrayList<>();
	        students.add("Abhinav");
	        students.add("Aman");
	        students.add("Abhishek");
	        students.add("Rahul");
	        
	        ArrayList<String> passedStudents = new ArrayList<>();
	        passedStudents.add("Rahul");
	        passedStudents.add("Abhishek");
	        passedStudents.add("Raj");
	        
	        students.removeAll(passedStudents);
	        
	        System.out.println(students);
	        
	    }
	
}
