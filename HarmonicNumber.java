package com.day4Functionalprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		for(double i = 1; i < n; i++) {
		if(i != n) {
			System.out.println("1/" + i + "+");
		}else if (i == n){
			System.out.println("1/" + 1);
		}
		
		}
	}
}
