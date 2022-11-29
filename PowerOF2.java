package com.day4Functionalprograms;

import java.util.Scanner;

public class PowerOF2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number power of 2 (0-31) : ");
		int n = sc.nextInt();
		
		while (n <= 0 || n >= 31) {
			System.out.println("Please Enter the Power can't lower than 0 & greater the 31");
			System.err.println("Enter the power");
			n = sc.nextInt();
			
		}
		System.out.println("Power of 2");
		for(int i = 0; i < n; i++) {
			System.out.println((int)Math.pow(2, i));
		}
	}

}
