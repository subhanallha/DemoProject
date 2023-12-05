package com.oops.www;

class MainC extends Shape {
 public void draw() {
	 System.out.println("This is implemention for draw methods");
 }
	public static void main(String[] args) {
		
		MainC sha = new MainC();
		sha.draw();
		sha.displayInfo();

	}

}
