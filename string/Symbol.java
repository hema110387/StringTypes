package com.string;

import java.util.Scanner;

public class Symbol {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=2;i++) {
		System.out.println("Enter the Email-id = ");
		String str = sc.next();
		
		System.out.println("Given Email-id containd @ symbol :"+str.contains("@"));
//		
//		if(str.contains("@")) {
//			System.out.println("Valid email-id");
//		}
//		else {
//			System.out.println("Invalid Email-id");
//		}
	}
	}
}
