package com.mar03;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Marks(Out of 100) of Subject1: ");
		int m1=sc.nextInt();
		System.out.println("Enter Marks(Out of 100) of Subject2: ");
		int m2=sc.nextInt();
		System.out.println("Enter Marks(Out of 100) of Subject3: ");
		int m3=sc.nextInt();
				
		int total = m1+m2+m3;
		double avg = total/3;
		
		System.out.println("Total marks of Robert is "+total+" and Percentage is "+avg+".");
	}

}
