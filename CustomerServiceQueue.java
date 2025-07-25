package QueueDemo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CustomerServiceQueue {

	public static void main(String[] args) {
		Queue<String> csq=new LinkedList<>();
		csq.add("Anuj");
		csq.add("Anbvi");
		csq.add("Diya");
		csq.add("Anwar");
		while(!csq.isEmpty())
		{
			System.out.println(csq.peek()+" is being served");
			csq.poll();//Remove served customer
		}
		
	}

}
