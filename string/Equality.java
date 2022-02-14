package com.string;

import java.util.Scanner;

public class Equality {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
		System.out.println("Enter the String 1 = ");
		String st1 = sc.next();
		System.out.println("Enter the String 2 = ");
		String st2 = sc.next();
		
		boolean eq = st1.equals(st2);	
		System.out.println("str1 is Equal to str2 ="+eq);
		
		}
	

		
		}
		
		
		
		
	}












//Input : 
//String 1 : Java
//String 2 : Java;
//
//Example:
//---------
//Input : 
//String 1 : Java
//String 2 : java
//
//Example:
//---------
//Input : 
//String 1 : Green Technology
//String 2 : GreenTechnology.
//
//Example(use equalsIgnoreCase):
//---------
//Input : 
//String 1 : Java
//String 2 : java
//
//Example(use equalsIgnoreCase) :
//---------
//Input : 
//String 1 : Nisha
//String 2 : nisha