package com.mar02;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int ch;
		
		System.out.println("\n********** Arithematic Program **********");
		do {
		System.out.println("\nPress 1: Addition ");
		System.out.println("Press 2 Sustraction ");
		System.out.println("Press 3: Multiplication ");
		System.out.println("Press 4: Divition ");
		System.out.println("Press 5: Exit ");
		
		System.out.println("\nNow,\nEnter Value Of A : ");
		int a=sc.nextInt();
		System.out.println("Enter Value Of B : ");
		int b=sc.nextInt();
		
		System.out.println("Enter A Choice");
		ch=sc.nextInt();
		
		switch(ch) {
		
		case 1:
		 System.out.println("Addition of " +a+ " & " +b+ " is :" +(a+b) );
		 break;
		case 2:
			 System.out.println("Sustraction of " +a+ " & " +b+ " is :" +(a-b) );
			 break;
		case 3:
			 System.out.println("Multiplication of " +a+ " & " +b+ " is :" +(a*b) );
			 break;
		case 4:
			 System.out.println("Divition of " +a+ " & " +b+ " is :" +(a/b) );
			 break;
		case 5:
			 System.out.println("Exit...!!!");
			 break;
		 default:
			 System.out.println("Enter A Valid Chice!!!!!!!!");
		}
		
		}while(ch!=5);

	}

}
