package com.string;

import java.util.Scanner;

public class Split {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
   
	System.out.println("Enter the String:");
    String str=sc.nextLine();
    
    String[] sp= str.split(" ");
    for (String str3 : sp) {
		System.out.println(str3);
	    }
    
    System.out.println(sp.length);
    System.out.println("----Split by l----");
    
    String[] sp1= str.split("l");
    for (String str4 : sp1) {
		System.out.println(str4);
	    }
	
}
}
