package SortingArr;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] a= {12,23,25,16,45,14};
		int[] b= {11,45,21,64,27,36};
		int[] c=new int[(a.length+b.length)];
		 // Sort arrays before merging
        Arrays.sort(a);
        Arrays.sort(b);
		merge(a,b,c);
		System.out.println(Arrays.toString(c));
	}

	private static void merge(int[] a, int[] b, int[] c) {

		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				c[k++]=a[i++];
			}else {
				c[k++]=b[j++];
			}
		}
		
			while(j<b.length) {
				c[k++]=b[j++];
			}
			while(i<a.length) {
				c[k++]=a[i++];
			}
	}
}
