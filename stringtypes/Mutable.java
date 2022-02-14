package com.stringtypes;

public class Mutable {
public static void main(String[] args) {
	
	
	StringBuffer sb=new StringBuffer("java");
	System.out.println(System.identityHashCode(sb));
	
	StringBuffer sb1=new StringBuffer("java");
	System.out.println(System.identityHashCode(sb1)); //duplicate-create a new memory 
	
	
	System.out.println(System.identityHashCode(sb1.append(sb))); // append - share memory
	
	System.out.println("======mutable using String Builder==========");
	
	StringBuilder sbu=new StringBuilder("Sql");
	StringBuilder sbu1=new StringBuilder("Selenium");
	
	System.out.println(System.identityHashCode(sbu)); 
	System.out.println(System.identityHashCode(sbu1));
	
	
	
	System.out.println(System.identityHashCode(sbu.append(sbu1)));
	
	StringBuilder sbu2=new StringBuilder("Selenium");
	System.out.println(System.identityHashCode(sbu2));
	
}
}
