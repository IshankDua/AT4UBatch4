package class7;

import java.util.Iterator;
import java.util.LinkedList;

public class LL {
	
	public static void main(String args[]) {
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("manish");
		al.add("Ishnak");
		al.add("ish");
		al.add("Aditya");
		al.add("Adi");
		al.add("Yugansh");
		al.add("Ravi");
		al.add("manish");
		al.add("Ishnak");
		al.add("ish");
		al.add("Aditya");
		al.add("Adi");
		al.add("Yugansh");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
	}

}
