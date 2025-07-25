package QueueDemo;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		//add element
	
		
		queue.add(50);
		queue.add(60);
		queue.add(57);
		System.out.println("Initial Queue:"+queue);
		//peek at front
		
		System.out.println("Front elemnt is:"+queue.peek());
		//remove elements
		System.out.println("FRemoved elemnt is:"+queue.remove());
		System.out.println("Final queue:"+queue);
		

	}

}
