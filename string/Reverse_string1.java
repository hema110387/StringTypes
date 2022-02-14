package com.string;

public class Reverse_string1 {
public static void main(String[] args) {
	String s="Welcome to java";
	System.out.println("Given string is = "+s);
	String[] sp= s.split(" ");
	
	String rev="";
	for (int i =sp.length-1; i>=0; i--) {
		rev=rev+sp[i]+" ";
		
	}
	System.out.println();
	System.out.println("reversed String is  = "+rev);
}
}