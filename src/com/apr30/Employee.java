package com.apr30;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1:Enter employee name: ");
		System.out.println("Press 2:Employee Address: ");
		System.out.println("Press 3:Enter Employee Contact:");
		System.out.println("Press 4:Enter Employee Designation:");
		System.out.println("Press 5:Enter Employee Salary:");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter employee name: ");
			String name=sc.next();
			System.out.println("Employee name: "+name);
			break;
		case 2:
			System.out.println("Employee Address: ");
			String address=sc.next();
			System.out.println("Employee Address is: "+address);
			break;	
		case 3:
			System.out.println("Enter Employee Contact:");
			long number=sc.nextLong();
			System.out.println("Employee Contact Number is: "+number);
			break;
		case 4:
			System.out.println("Enter Employee Designation:");
			String Designantion=sc.next();
			System.out.println("Employee Designantion is: "+Designantion);
			break;
		case 5:
			System.out.println("Enter Employee Salary:");
			String salary=sc.next();
			System.out.println("Employee Salary is: "+salary);
			break;
		default:
			System.out.println("Enter a valid choice!!!");
		}
		
	}

}
