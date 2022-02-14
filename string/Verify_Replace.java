package com.string;

import java.util.Scanner;

public class Verify_Replace {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the Email-id = ");
		String str = sc.next();
		
		boolean b = str.contains("gmail");
//		System.out.println(b);
		if(b==str.contains(str)) {
		String replace = str.replace("gmail", "yahoo");
		System.out.println(replace);
		}
		else {
			System.out.println(" Give valid gmail id ");
		}
	}

}

