package Array_Explaination;

public class Array_1D {

	public static void main(String[] args) {
        int[] arr = new int[5];
        int[] age = {12, 4, 5, 2, 5};
        
        int n = arr.length;
        
        for(int i=0;i<age.length;i++) {
            System.out.print(age[i]+" ");
        }
        System.out.println();
        
        for(int x: age) {
            System.out.print(x+" ");
        }
        System.out.println();
        
        System.out.println("Size: "+n);
    }
}
