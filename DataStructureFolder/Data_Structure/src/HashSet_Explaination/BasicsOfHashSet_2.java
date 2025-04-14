package HashSet_Explaination;

import java.util.HashSet;

public class BasicsOfHashSet_2 {

	public static void main(String[] args) {
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(12);
		hs1.add(23);
		hs1.add(34);
		
		HashSet<Integer> hs2=new HashSet<Integer>();
		hs2.add(13);
		hs2.add(24);
		hs2.add(3);
		
		System.out.println(hs1.addAll(hs2));//union of two hashsets
		System.out.println(hs1.retainAll(hs2));//intersation of two sets
		System.out.println(hs1.removeAll(hs2));//difference of teo hashsets
		
	}
}
