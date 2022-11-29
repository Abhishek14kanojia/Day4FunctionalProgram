package com.day4Functionalprograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Flip_Coin = sc.nextInt();
		
		int Head = 0;
		int Tail = 0;
		
		for(int i = 0; i < Flip_Coin; i ++) {
			if(Math.random() < 0.5) {
				System.out.println("Tail");
				Tail++;
			}else {
				System.out.println("Head");
				Head++;
			}
		}
		
		System.out.println("Number of Tails is : " + Tail);
		System.out.println("Number of Heads is : " + Head);
		
		int TailsPercentage = (Tail*100)/Flip_Coin;
		int HeadPercentage = (Head*100)/Flip_Coin;
		
		System.out.println("Percentages of Heads is : " + Head );
		System.out.println("percentages of Tails is : " + Tail);
	}
	
	
}
