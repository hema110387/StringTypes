package com.string;

import java.util.Scanner;

public class Substring {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Ener the string : ");
			String str = sc.nextLine();
			String sub = str.substring(0, 7);
			System.out.println(sub);
}
}
