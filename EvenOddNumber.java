package com.day4Functionalprograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Number = sc.nextInt();
		
		if(Number % 2 == 0) {
			System.out.println("This Number is Even");
		}else {
			System.out.println("This Number is Odd");
		}
		
	}
}
