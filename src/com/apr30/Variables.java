package com.apr30;
//Local Variables we can within block
/*Multiline Comment*/

public class Variables {
	
	public void show() { //here void show is function
		String msg="Hi,How are you??";
		System.out.println(msg);//local variable
	}

	public static void main(String[] args) {
		Variables v=new Variables();
		v.show();//Here show() is method
		
		
		//When we call function via instance variable it becomes method

	}

}
