package com.practice.www;


public class C{
public void add(int x)
{
	System.out.println("Hello");
}

public void login(int d)
{
	System.out.println("this is login");
}

public void multi(int y, int z)
{
	System.out.println(y*z);
}

public static void main(String[] args) {
	C obj=new C();
	   // object
	
	obj.add(1);
	
	obj.login(2);
	
	obj.multi(0, 4);
	
}
}