package com.mar03;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name=sc.next();
		
		System.out.println("Enter Your Roll No. : ");
		int rl=sc.nextInt();
	
		System.out.println("Enter Your Field Of Intrest: ");
		String itr=sc.next();
		
		System.out.println("\nMy name is "+name+" and My roll no. is "+rl+". \nMy field of Intrest is "+itr+".");
	}

}
