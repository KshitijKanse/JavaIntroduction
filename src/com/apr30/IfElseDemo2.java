package com.apr30;

import java.util.Scanner;

public class IfElseDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name=sc.next();
		
		System.out.println("Enter his age: ");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println(name + " is eligable for Voting.");
		}
		else {
			System.out.println(name + " is not eligable for Voting.");
		}
	}

}
