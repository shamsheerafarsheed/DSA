package StackDemo;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		//Generics-->every data type 
		//Declare stack
		Stack<String> stack=new Stack<>();
		//Stack<Integer> stack=new Stack<>();
		//Add element
		stack.push("Java");
		stack.push("python");
		stack.push("C");
		stack.push("C++");
		System.out.println(stack);
		System.out.println(stack.peek());
		//remove an element
		String removed=stack.pop();//remove c++
		System.out.println("Removed elements is :"+removed);
		
		System.out.println(stack);
		//Check stack is empty
		System.out.println("is stack is empty???"+stack.isEmpty());

	}

}
