package com.mar02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int no=sc.nextInt();
		
		int i=1;
		while(i<=10) {
			System.out.println(no+"x"+i+"="+no*i);
			i++;
		}
		
	}

}
