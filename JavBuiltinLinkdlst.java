package LinkedListDemo;

import java.util.LinkedList;

public class JavBuiltinLinkdlst {

	public static void main(String[] args) {
		//Declaration of linkedList
		LinkedList<String> fruits=new LinkedList<>();
		//add elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pear");
		fruits.add("Orange");
		System.out.println(fruits);
		//add elements at begining
		fruits.addFirst("Mango");
		fruits.addLast("Grapes");
		System.out.println("Updates List:"+fruits);
		//add at the specific position(eg:at index 2)
		fruits.add(2, "Pineapple");
		System.out.println(fruits);
		//remove by value
		fruits.remove("Banana");
		System.out.println(fruits);
		//remove  from specific index
		fruits.remove(4);
		System.out.println(fruits);
		//accessing elements
		
		System.out.println("First fruit:"+fruits.getFirst());
		System.out.println("last fruit:"+fruits.getLast());
		
		

	}

}
