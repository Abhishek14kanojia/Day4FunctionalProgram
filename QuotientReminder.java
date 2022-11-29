package com.day4Functionalprograms;

import java.util.Scanner;

public class QuotientReminder {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the value of Dividend : ");
		int dividend = sc.nextInt();
		System.out.println("Enter the value of Divisor : ");
		int divisor = sc.nextInt();
		
		int Quotient = dividend / divisor;
		System.out.println("Quotient : " + Quotient);
		
		int Reminder = dividend % divisor;
		System.out.println("Reminder is : " + Reminder);
	}
}
