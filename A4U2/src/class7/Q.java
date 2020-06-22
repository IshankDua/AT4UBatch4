package class7;

import java.util.LinkedList;
import java.util.Queue;

public class Q {
	
	public static void main(String args[]) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		queue.add("five");
		queue.add("six");
		
		System.out.println(queue);     // printing the queue for first time
		
		System.out.println("Queue size is " +queue.size());
		
		
		queue.remove("three");
		
      System.out.println(queue);
		
		System.out.println("Queue size is " +queue.size());   // Printing the queue after removing a value 
		
		
		
		
		queue.clear();
		System.out.println("Queue size is " +queue.size());     // Printing the queue after clearing
		
		
		
	}

}
