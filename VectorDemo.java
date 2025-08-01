package collectionDemo;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		List<String> Fruits=new Vector<>();
		
		Fruits.add("Banana");
		Fruits.add("Orange");
		Fruits.add("Pear");
		Fruits.add("Mango");
		System.out.println(Fruits);
		List<String> Vegetables=new Vector<>();
		Vegetables.add("Carrot");
		Vegetables.add("Cucumber");
		Vegetables.add("Beans");
		Vegetables.add("CauliFlower");
		System.out.println(Vegetables);
		//AddAll(joining 2 list)
		Fruits.addAll(Vegetables);
		System.out.println(Fruits);
		//Removeall(to seperate the list)
		Fruits.removeAll(Vegetables);
		System.out.println(Fruits);
	}

}
