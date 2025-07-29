package SortingDemo;

import java.util.Arrays;

public class SortStringDemo {
	public static void main(String[] args) {
	String[] names = {"Meena", "Arun", "Priya", "Zara", "Bala"};

    Arrays.sort(names);  // Alphabetical order

    System.out.println("Sorted names:");
    for (String name : names)
        System.out.print(name + " ");
}


}