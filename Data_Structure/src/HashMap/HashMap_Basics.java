package HashMap;

import java.util.HashMap;

public class HashMap_Basics {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Sumit");
		hm.put(2, "Amit");
		hm.put(3, "Lovedeep");
		hm.put(1, "Ankit");//key can not be duplicate only value will be changed
		
		System.out.println(hm);//{1=Ankit, 2=Amit, 3=Lovedeep}
		System.out.println(hm.keySet());//print the key set
		System.out.println(hm.values());//print the value set
		System.out.println(hm.containsKey(1));//check the key is present or not
		System.out.println(hm.containsValue("Amit"));//check the value is present or not
		System.out.println(hm.entrySet());//print the hashmap complete  [1=Ankit, 2=Amit, 3=Lovedeep]
	}
}
