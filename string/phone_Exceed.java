package com.string;

import java.util.Scanner;

public class phone_Exceed {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for (int i = 1; i <3; i++) {
	
			
		
		System.out.println("Enter the Phone no :");
		String str = sc.next();
		
		if(str.length()<=10) {
			System.out.println("Valid Number");
		}
		else {
			System.out.println("Invalid Number");
		}
		
		}
		
	}		
}
