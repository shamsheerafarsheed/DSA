package collectionDemo;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> name=new ArrayList<>();
		name.add("Pratiksha");
		name.add("Nilesh");
		name.add("Tejshri");
		name.add("Pranjali");
		//name.add(2);Generics given as String so will not accept Integer value
		name.remove(1);
		System.out.println(name);
		System.out.println("Size of an ArrayList:"+name.size());
		
//to trav<erse an element from list using Iterator()
		Iterator<String>itr=name.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//using foreach loop
		for(String str:name)
		{
			System.out.println("Names List using  foreach loop"+str);
		}
		
	}
	

}
