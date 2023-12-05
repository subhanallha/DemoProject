package com.practice.www;

public class method {
	
    // Method signature: int addNumbers(int a, int b)
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        method math = new method();

        // Calling the method with arguments 5 and 7
        int result = math.addNumbers(5, 7);

        // Printing the result
        System.out.println("Sum: " + result);
    }
}
