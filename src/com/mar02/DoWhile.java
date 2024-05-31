package com.mar02;

public class DoWhile {

	public static void main(String[] args) {
		int i=1;
		do {
			
			System.out.println(i);
			i++;
			if(i==5) {
			break;
			}
		}while(i<=10);
	}

}
