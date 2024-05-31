package com.mar02;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
        
		int i, j, k;
		 
        // outer loop to handle rows
        for (i = 1; i <= n; i++) {
           
            // inner loop to print spaces.
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
           
            for (k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }
 
            System.out.println(" ");
        }
    }
}
		
		
		 /*System.out.println("Enter the number of lines of pyramid you want to print: ");
	        int no = sc.nextInt();
	        
	        // Outer loop for rows
	        for (int i = 1; i <= no; i++) {
	            // Inner loop for spaces
	            for (int j = no - i; j > 0; j--) {
	                System.out.print(" ");
	            }
	            // Inner loop for asterisks
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            // Move to the next line
	            System.out.println();
	        }
	    }
	}
	
		
		System.out.println("Enter The Number Of Lines Of Pyramid You Want To Print: ");
		int no=sc.nextInt();
		//here i is rows and j is columns
		for (int i=1;i<=no;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/

	


//
