package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		final double TICKET_PRICE_PER_KM = 0.21;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many kms do you want to ride?");
		int kms = Integer.valueOf(in.nextLine());
		
		System.out.println("How old are you?");
		int age = Integer.valueOf(in.nextLine());
		
		in.close();
		
		double sale = 0.0;
		
		if (age < 18) sale = 0.20;
		else if (age > 65) sale = 0.40;
		
		double cost = kms * TICKET_PRICE_PER_KM;
		double finalCost = cost - (cost * sale);
		
		System.out.println("Your ticket will cost: " + finalCost + "€");		
	}
}
