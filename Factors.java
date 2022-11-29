package com.day4Functionalprograms;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int factor = 1;

		for(int i = 0; i <= n; i++) {
			factor = factor * n;
			System.out.println("Factors is : " + factor);
		}
	}
}
