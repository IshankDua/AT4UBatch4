package class7;

import java.util.*;


public class Collections {

	public static void main(String args[]) {
		
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, " Ravi");
		map.put(2, " Ishank");
		map.put(3, " Aditya");
		map.put(4, "Manish");
		map.put(5, "Jai");
		map.put(6, "Aakash");
		map.put(7, "Yugansh");
		
		System.out.println("Iterating the Hashmap.....");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		
		
	}
}
