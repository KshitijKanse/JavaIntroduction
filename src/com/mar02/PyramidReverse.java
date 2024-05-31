package com.mar02;

import java.util.Scanner;

public class PyramidReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number Of Lines Of Pyramid You Want To Print: ");
		int no=sc.nextInt();
		//here i is rows and j is columns
		for (int i=no;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}

}
