package com.oops.www;

public class ConstructorsE {
	    // Instance variable
	    int x;

	    // Constructor with a default value for x
	    public ConstructorsE() {
	        // Initializing the instance variable with a default value of 5
	        x = 5;
	    }

	    // Method to display information
	    public void displayInfo() {
	        // Accessing the instance variable directly
	        System.out.println("Value of x: " + x);
	    }

	    public static void main(String[] args) {
	        // Creating an object of the class using the default constructor
	        ConstructorsE constro = new ConstructorsE();

	        // Calling the displayInfo method to show information
	        constro.displayInfo();
	    }

}
