package StackDemo;

import java.util.Stack;

public class TemperatureStack {
    private Stack<Integer> tempStack;    // Stack to store all temperatures
    private Stack<Integer> minTempStack; // Stack to track the minimum temperatures

    public TemperatureStack() {
        tempStack = new Stack<>();
        minTempStack = new Stack<>();
    }

    // Record a new temperature
    public void recordTemperature(int temp) {
        tempStack.push(temp);
        if (minTempStack.isEmpty() || temp <= minTempStack.peek()) {
            minTempStack.push(temp);
        }
    }

    // Remove the most recent recorded temperature
    public void removeRecentTemperature() {
        if (tempStack.isEmpty()) {
            throw new RuntimeException("No temperatures recorded.");
        }
        int removed = tempStack.pop();
        if (removed == minTempStack.peek()) {
            minTempStack.pop();
        }
    }

    // Get the most recent recorded temperature
    public int getRecentTemperature() {
        if (tempStack.isEmpty()) {
            throw new RuntimeException("No temperatures recorded.");
        }
        return tempStack.peek();
    }

    // Get the lowest temperature recorded so far
    public int getLowestTemperature() {
        if (minTempStack.isEmpty()) {
            throw new RuntimeException("No temperatures recorded.");
        }
        return minTempStack.peek();
    }

    // Check if any temperature is recorded
    public boolean isEmpty() {
        return tempStack.isEmpty();
    }



	public static void main(String[] args) {
		 TemperatureStack ts = new TemperatureStack();

	        ts.recordTemperature(30);
	        ts.recordTemperature(25);
	        ts.recordTemperature(28);

	        System.out.println("Recent Temperature: " + ts.getRecentTemperature()); // 28
	        System.out.println("Lowest Temperature: " + ts.getLowestTemperature()); // 25

	        ts.removeRecentTemperature(); // removes 28

	        System.out.println("Recent Temperature: " + ts.getRecentTemperature()); // 25
	        System.out.println("Lowest Temperature: " + ts.getLowestTemperature()); // 25

	        ts.removeRecentTemperature(); // removes 25

	        System.out.println("Lowest Temperature: " + ts.getLowestTemperature()); // 30
	    
	
	}

}
