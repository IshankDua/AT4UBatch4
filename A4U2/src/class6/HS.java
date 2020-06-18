package class6;

import java.util.HashSet;
import java.util.Iterator;

public class HS {
	
	public static void main(String args[]) {
		
		HashSet <String> set = new HashSet<String>();
		
		set.add("Ajay");      //The unique values
		set.add("Ravi");
		set.add("Amrit");
		set.add("Amrit");
		set.add("Amrit");
		set.add("Ravi");
		set.add("Ravi");
		set.add("Ravi");
		
		
		
		Iterator <String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		
	}

}
