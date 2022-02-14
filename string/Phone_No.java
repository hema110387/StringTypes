package com.string;

import java.util.Scanner;

public class Phone_No {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<3;i++) {
	System.out.println("Enter the Phone no :");
	String str = sc.next();
	 if (str.matches("[0-9]+")){
             
        	 System.out.println(str.matches("[0-9]+"));
         }
         else {
             System.out.println(str.matches("[0-9]+"));
         }
	} 

}
}

