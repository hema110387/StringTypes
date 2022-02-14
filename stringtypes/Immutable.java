package com.stringtypes;

public class Immutable {
	public static void main(String[] args) {
		String s="Java";
		System.out.println(System.identityHashCode(s));
		
		String s1="Java";
		System.out.println(System.identityHashCode(s1));// share memory
		
		String s2=s+s1;
		System.out.println(System.identityHashCode(s2)); // new memory
		
		
	}

}


