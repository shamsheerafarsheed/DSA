package StackDemo;

public class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public ArrayStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // stack is empty initially
    }

    // Push element onto stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return stack[top--];
    }

    // Peek / Top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
