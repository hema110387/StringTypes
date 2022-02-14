package com.string;

import java.util.Scanner;

public class StartsWith {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
		System.out.println("Enter the String:");
	    String str=sc.next();
	    boolean sw = str.startsWith("welcome");
	    if(sw==str.equals(str)) {
	System.out.println(sw);
	}
	    else {
	    	System.out.println(sw);
	    }
	}
	
}
}
