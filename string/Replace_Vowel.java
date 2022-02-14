package com.string;

import java.util.Scanner;

public class Replace_Vowel {
		public static void main(String[] args) {
			
					Scanner sc=new Scanner(System.in);
					System.out.println("Ener the string : ");
					String str = sc.nextLine();
					int replace=0;
					char[] ch = str.toCharArray();
					for(int i=0;i<ch.length;i++) {
						if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
							ch[i]='@';
						}
					}
					for(int i=0;i<ch.length;i++) {
					System.out.print(ch[i]);
					}
					
		}
		
}


					