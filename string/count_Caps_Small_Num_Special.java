package com.string;

import java.util.Scanner;

public class count_Caps_Small_Num_Special {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ener the string : ");
	String str = sc.nextLine();
	int caps=0,small=0,num=0,special=0;
	for(int i=0;i<str.length();i++) {
		
	if(Character.isUpperCase(str.charAt(i))){
			caps++;
		
	}
			else if (Character.isLowerCase(str.charAt(i))){
			small++;
			}
			
		else if (Character.isDigit(str.charAt(i))){
			num++;
			
		}
		else {
			special++;
		}
	}
	
	
	
	

	System.out.println("Count of Capital Letters :"+caps);
	System.out.println("count of small letters :"+small);
	System.out.println("Count of numbers :"+num);
	System.out.println("count of special  :"+special);
	

}
}

























//
//caps count  :3
//small count :15
//number count:3
//Special char:5
