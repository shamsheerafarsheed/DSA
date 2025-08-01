package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {

	public static void main(String[] args) {
		Collection a=new ArrayList();
		a.add("Pen");//String
		a.add("Book");//String
		a.add('Z');//Char
		a.add(10);//int
		a.add(12.3);//float
		System.out.println(a);

	}

}
