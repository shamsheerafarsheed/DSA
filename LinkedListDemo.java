package collectionDemo;

import java.util.*;

/*
 * All the elemnts are called nodes .3 parts
 * 1.reference to the previous Elemnts
 * 2.value of the elements
 * 3.Reference to the Next Elements
 * we can insert elemnts from both side as well as from the middle of the list
 * get,add,remove,removeAll,peek()--return first Elements,poll--->remove first Elements
 * offer---adding elements in the end
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args) {
	List<String>Lang=new LinkedList<>();
	Lang.add("Java");
	Lang.add("Python");
	Lang.add("C++");
	Lang.add(".net");
	System.out.println("Linked List of Language:"+Lang);
	//Remove Elements from List
	String str=Lang.remove(3);
	System.out.println("Updated Linked List of Language:"+Lang);
	System.out.println("Removed Elements is:"+str);
	//Add elements in a specific Position
	
	Lang.add(2,"PHP");
	System.out.println("Updated Linked List of Language:"+Lang);
	//Iterator method using for display the List
	Iterator <String> itr=Lang.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
//retrieve elements using index number
	
	String str1=Lang.get(0);
	System.out.println("Elements at index 0:"+str1);
	//Replace an Element
	Lang.set(2, "Typescript");
	System.out.println("Updated Linked List of Language:"+Lang);
	//for remove all Elements
	//Lang.clear();
	//System.out.println("Updated Linked List of Language:"+Lang);
	
	//Checking Elements using Contains Method
	System.out.println(Lang.contains("Python"));
	//For getting Index Number
	System.out.println("Index number of Python:"+Lang.indexOf("Python"));
	
	}

}
