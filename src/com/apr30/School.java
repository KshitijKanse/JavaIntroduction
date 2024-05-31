package com.apr30;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter Student Name: ");
		String name=sc.next();
		
		System.out.println("Enter Marks of Maths");
		int m1=sc.nextInt();
		
		System.out.println("Enter Marks of Sceince");
		int m2=sc.nextInt();
		
		System.out.println("Enter Marks of English");
		int m3=sc.nextInt();
		
		int total = m1+m2+m3;
		double avg = total/3;
		
		System.out.println("Name of the student is "+name);
		System.out.println("Toatl of marks is "+total);
		System.out.println("Percentage is "+avg);
		
		if(avg<35){
			System.out.println("Failed in exam");	
		}
		else if (avg<=35 && avg<40)
		{
			System.out.println("Grade is l");
		}
		else if (avg<=40 && avg<50)
		{
			System.out.println("Grade is E");
		}
		else if (avg<=50 && avg<60)
		{
			System.out.println("Grade is D");
		}
		else if (avg<=60 && avg<70)
		{
			System.out.println("Grade is C");
		}
		else if (avg<=70 && avg<80)
		{
			System.out.println("Grade is B");
		}
		else {
			System.out.println("Grade is A");
		}
		
	}

}
