package com.day4Functionalprograms;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value b : ");
		int b = sc.nextInt();
		int temp = 0;
		System.out.println("Before swap");
		System.out.println("First Number = " + a);
		System.out.println("second Number = " + b);
		{
			
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println("After swap");
		System.out.println("First Number : " + a);
		System.out.println("Second Number : " + b);
	}
}
