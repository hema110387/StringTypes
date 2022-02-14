package com.string;

public class Reverse_String {
	public static void main(String[] args) {
		String str="Hello World All";
		System.out.println("GivenString is  : "+str);
		String rev="";
		for (int i = str.length()-1; i>=0; i--) {
			char c = str.charAt(i);
			rev=rev+c;
		}
		
		System.out.println("reversed String is :  "+rev);
	}

}
