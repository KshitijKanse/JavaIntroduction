package com.mar03;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int b=sc.nextInt();
		System.out.println("Enter 3rd Number: ");
		int c=sc.nextInt();
		
		if(a==b && a==c)
		{
			System.out.println("All The Numbers are equal");
		}
		else if(a==b || a!=c)
		{
			System.out.println("First two numbers are equal");
		}
		else if(a!=b || a==c)
		{
			System.out.println("Last two numbers are equal");
		}
		else if(a==b || a==c)
		{
			System.out.println("First and Trird Numbers are equal.");
		}
		else {
			System.out.println("All Numbers are different.");
		}
	}

}
