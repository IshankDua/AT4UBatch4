package class6;

import java.util.ArrayList;
import java.util.Iterator;

public class AL {
	
	
public static void main(String args[]) {
		
		ArrayList<String> al =new ArrayList<String>();
		
		al.add("Ishank");
		al.add("Ravi");
		al.add("Manish");
		al.add("A4U");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
