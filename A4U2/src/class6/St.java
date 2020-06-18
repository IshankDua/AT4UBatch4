package class6;

import java.util.Iterator;
import java.util.Stack;

public class St {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Stack <String> stack = new Stack<String>();
		  
		  
		  stack.push("Ravi");
		  stack.push("Garvit");
		  stack.push("Ram");
		  stack.push("Ravi1");
		  stack.push("Ishank");
		  
		  stack.pop();
		  
		  Iterator <String> itr = stack.iterator();
		  
		  while(itr.hasNext()) {
			  
			  System.out.println(itr.next());
		  }
		  
		  
		
	}

}
