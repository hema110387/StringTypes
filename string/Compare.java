package com.string;

import java.util.Scanner;

public class Compare {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	for(int i=0;i<2;i++) {
	System.out.println("Enter the String1:");
    String str1=sc.next();
    System.out.println("Enter the String2:");
    String str2=sc.next();
    
    //boolean eq= str1.equals(str2);
    int com= str1.compareTo(str2);
    System.out.println(com);
	}
}
}