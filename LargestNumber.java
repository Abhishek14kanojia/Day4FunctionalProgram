package com.day4Functionalprograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value a:");
		int a = sc.nextInt();
		System.out.println("Enter the Value b:");
		int b = sc.nextInt();
		System.out.println("Enter the Value c:");
		int c = sc.nextInt();
	        
	        if (a > b && a > c)
	        {
	            System.out.println(a + " is a largest ");
	        }
	        else if(b > a && b > c)
	        {
	            System.out.println(b + " is a largest ");
	        }
	        else
	        {
	            System.out.println(c + " is a largest ");
	     }
		
		
		
	}
}
