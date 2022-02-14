package com.string;

import java.util.Scanner;

public class Contains_pincode {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<3;i++) {
		
	System.out.println("Enter the Address  :");
	String str = sc.nextLine();
	
	if (str.contains("pincode"))
	{
		System.out.println("Valid Address");
	}
	else {
		System.out.println("Invalid Address");
	}
	}
	
}
}
