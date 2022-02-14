package com.string;

import java.util.Scanner;

public class Count_Vowel_Consnant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener the string : ");
		String str = sc.nextLine();
		int vcount=0,ccount=0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
				vcount++;
			
			}
			else {
				ccount++;
				
			}
		
		}
		System.out.println("Count of vowels :"+vcount);
		System.out.println("count of cosonants :"+ccount);
	
}
}