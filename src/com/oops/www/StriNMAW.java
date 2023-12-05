package com.oops.www;

class StriNMAW {

	//constructor
	int x;
	String y;
    StriNMAW(int i, String k){
		x=i;
		y=k;
	}

	void display(){
		System.out.println(x + " "+ "This is randomclass");
		System.out.println(y + " "+ "Countdown");
	}

	public static void main(String[] args) {
		StriNMAW casual= new StriNMAW(90,"Day");
		casual.display();
		

	}

}
