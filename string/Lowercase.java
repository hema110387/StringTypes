package com.string;

import java.util.Scanner;

public class Lowercase {

	public static void main(String[] args) {
		
		int ucount=0,lcount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name  :");
		String str = sc.next();
		
		String lowerCase = str.toLowerCase();
		System.out.println("Lower case is:   "+lowerCase);
		
		String uc = str.toUpperCase();
		System.out.println("Upper case is:   "+uc);
		
		
		
	}
}
