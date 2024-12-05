package HashSet_Explaination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class BasicsOfHashset {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>(3,.075f);
		//here 3 is capacity of Hashset and 0.75 is load factor if the 75per size is filled of it then automatically
		// is doubled same like as StringBuilder
		//we cannot add duplicate data in hashset
			hs.add(12);
			hs.add(34);
			hs.add(45);
			
		ArrayList<Integer> as=new ArrayList<Integer>();
		as.add(56);
		as.add(67);
		as.add(78);
		hs.addAll(as);//addAll is a method which i used to add an collections in HashSet
		System.out.println(hs);
		
		//has map uses Iterator also
		Iterator<Integer> ir=hs.iterator();
		while(ir.hasNext()) {
			System.out.print(ir.next()+" ");
		}
	}
}
