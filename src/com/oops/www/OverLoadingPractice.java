package com.oops.www;


class Mate{
    public static int add(int m, int n){
        return m+n;
    }
    public static int add(int m, int n, int p){
        return m+n+p;
    }
}
public class OverLoadingPractice{
    public static void main(String[] args){
        System.out.println(Mate.add(2,3));
        System.out.println(Mate.add(2,3,5));
    }
}


//public class  {
//	public static void main(String[] args) {	
//		Demo objer=new Demo();
////		objer.add(3, 5);
//		System.out.println(objer.add(3, 5));
//	}

