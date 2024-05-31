package com.mar02;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Number: ");
		int num=sc.nextInt();
		
		int i=1,sum=0;
		while(i<=num) {
			
			sum=sum+i;//sum+=1;
			i++;
		}
		System.out.println("Sum is "+sum);

	}

}
