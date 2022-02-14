package com.string;

public class Literal_NonLiteral {
	public static void main(String[] args) {
		System.out.println("==========Literal==============");
		String str="Selenium";
		System.out.println(System.identityHashCode(str));
		
		String str1="Selenium";
		System.out.println(System.identityHashCode(str1));
		
		System.out.println("==========Three Literal =========");
		String strt="Welcome";
		System.out.println(System.identityHashCode(strt));
		String strt1="Java";
		System.out.println(System.identityHashCode(strt1));
		String strt2="Selenium";
		System.out.println(System.identityHashCode(strt2));
		

		System.out.println("=========== Two Non Literal===========");
	
		StringBuffer sb= new StringBuffer("Hello");
		System.out.println(System.identityHashCode(sb));
		
		StringBuffer sb1= new StringBuffer("Hello");
		System.out.println(System.identityHashCode(sb1));
		
		System.out.println("==========Three Non literal ================");
		
		StringBuffer st= new StringBuffer("Hema");
		System.out.println(System.identityHashCode(st));
		
		StringBuffer st1= new StringBuffer("latha");
		System.out.println(System.identityHashCode(st1));
		
		StringBuffer st2= new StringBuffer("HemaLatha");
		System.out.println(System.identityHashCode(st2));
		
		
		
}
}




