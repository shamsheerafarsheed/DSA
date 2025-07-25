package QueueDemo;

import java.util.*;

//ArrayDeque is faster than LinkedList,stack and queue
public class ArrayDequeEx {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<>();
		dq.offer("Java");
		dq.offer("C++");
		dq.offer("Python");
		dq.offer(".net");
		System.out.println("Deque as queue:"+dq);
		System.out.println("Remove from front:"+dq.pollFirst());
		System.out.println("Remove from last:"+dq.pollLast());
		System.out.println("Add in last:"+dq.offerFirst("PHP"));
		
		System.out.println("Updated  queue:"+dq);
		

	}

}
