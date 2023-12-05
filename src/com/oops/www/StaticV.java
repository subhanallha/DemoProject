package com.oops.www;

public class StaticV {

	    // Static variable declared and initialized within the class
	    static int staticX = 10;

	    // Method to print the value of the static variable
	    public static void printStaticX() {
	        System.out.println("Value of staticX: " + staticX);
	    }

	    public static void main(String[] args) {
	        // Accessing the static variable directly
//	        System.out.println("Value of staticX: " + StaticV.staticX);

	        // Calling the method to print the static variable
	        StaticV.printStaticX();
	    }

}
