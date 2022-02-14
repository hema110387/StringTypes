package com.string;

public class Count_Upper_Lower {
public static void main(String[] args) {
	int ucount=0,lcount=0;
	String str1="WelcomeToJava";
	
	
	for(int i=0;i<str1.length();i++) {
	if(Character.isUpperCase(str1.charAt(i))) {
		ucount++;
	}
	else {
		lcount++;
	}
	}
	System.out.println("Count of uppercase is"+ucount);
	System.out.println("Count of lowercase is"+lcount);
}
}
