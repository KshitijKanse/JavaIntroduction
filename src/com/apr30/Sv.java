package com.apr30;

public class Sv {
	
	public void show() { //here void show is function
		String msg="Hi,How are you??";
		System.out.println(msg);//local variable
	}
	public static void msg() { 		//static variable
		String name="John Smith";
		int age=18;
		System.out.println("Name is "+name+"\n"+"And age is "+age);
	}

	public static void main(String[] args) {
		Variables v=new Variables();//instance variable
		v.show();
		Sv.msg();//with the help of static keyword we have called funtion without instance variable
	}

}
