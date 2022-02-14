package com.string;

import java.util.Scanner;

public class equalIgnore {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	for(int i=0;i<2;i++) {
	System.out.println("Enter the String 1 = ");
	String st1 = sc.next();
	System.out.println("Enter the String 2 = ");
	String st2 = sc.next();
	
	boolean eqig = st1.equalsIgnoreCase(st2);
	System.out.println("str1 is Equal to str2 ="+eqig);
	System.out.println();
	
}
}
}