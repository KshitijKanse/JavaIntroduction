package com.apr30;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int ch=sc.nextInt();
		
		switch(ch) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tueday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter a valid choice");
		}

	}

}
