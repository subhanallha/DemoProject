package com.oops.www;

class Building{
	void floor () {
		System.out.println("Find your floor");
	}
}

class Ground extends Building{
	void floor() {
		System.out.println("This is GroundFloor");
	}
}

class FirstFl extends Building{
	void floor() {
		System.out.println("This is FirstFloor");
	}
}
public class OverridingPractice {

	public static void main(String[] args) {
		Building obey1=new Ground();
		Building obey2=new FirstFl();
		obey1.floor();
		obey2.floor();
		
	}

}
