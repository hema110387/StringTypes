package com.string;


public class Replace {
	public static void main(String[] args) {
		
		String str="Welcome to the Java Class";
		String str1= "greens Adayar";
		String replace = str.replace("Java", "Sql");
		String replace2 = str1.replace("Adayar", "Omr");
		System.out.println(str);
		System.out.println(replace);
		System.out.println();
		System.out.println(str1);
		System.out.println(replace2);
		System.out.println();
		System.out.println(str);
		String replace3 = str.replace(" ", "#");
		System.out.println(replace3);
	}

}
