package com.mar02;

import java.util.Scanner;

public class FullPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no=sc.nextInt();
		
	 
	 
		//here i is rows and j is columns
		for (int i=1;i<=no;i++) 
		{
			for(int j=1;j<=no-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(no);
			}
			
			System.out.println();
		}
       
		/*
		for(int i=no;i>=1;i--) {
			for(int j=1;j<=no-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
	}
}
