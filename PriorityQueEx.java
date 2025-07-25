package QueueDemo;
//element served by priority
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueEx {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		//add element
	
		
		pq.add(50);
		pq.add(60);
		pq.add(57);
		pq.add(27);
		pq.add(10);
		System.out.println("Priority queue:(natural order)");
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}

	}

}
