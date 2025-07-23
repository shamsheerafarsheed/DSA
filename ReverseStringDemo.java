package StackDemo;

import java.util.Stack;

public class ReverseStringDemo {

	public static void main(String[] args) {
		String input="JAVA";
		Stack<Character> stack=new Stack<>();
		for(char c:input.toCharArray())
		{
			stack.push(c);
		}
		
		StringBuilder reversed=new StringBuilder();
		while(!stack.isEmpty())
		{
			reversed.append(stack.pop());
		}
System.out.print("Reversed:"+reversed.toString());
	}

}
