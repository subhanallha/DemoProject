package com.oops.www;

public class InstanceV {
    // Public instance variable
//    public int number;
//
//    public static void main(String[] args) {
//        // Creating an object of the InstanceV class
//        InstanceV myInstance = new InstanceV();
//
//        // Accessing the public instance variable directly (not recommended)
//        myInstance.number = 42;
//
//        // Printing the value of the public instance variable
//        System.out.println("Number: " + myInstance.number);
//    }

	    // Instance variable declared and initialized within the class
	    int x = 10;

	    // Method to print the value of x
	    public void printValueOfX() {
	        System.out.println("Value of x: " + x);
	    }

	    public static void main(String[] args) {
	        // Creating an object of the InstanceV class
	        InstanceV myInstance = new InstanceV();

	        // Accessing the method to print the value of x
	        myInstance.printValueOfX();
	    }
}


