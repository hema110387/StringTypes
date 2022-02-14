package com.string;

import java.util.Scanner;

public class Convert_char_Lower_Upper {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		int n=str.length();
		for(int i=0;i<n;i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) 
				str.replace(i, i+1,Character.toUpperCase(ch)+"");
			else
				str.replace(i, i+1,Character.toUpperCase(ch)+"");
		}
	System.out.println(str);
}
}
//=====================================================
//        for (int i = 0; i < ln; i++) {
//            Character c = str.charAt(i);
//            if (Character.isLowerCase(c))
//                str.replace(i, i + 1,
//                            Character.toUpperCase(c) + "");
//            else
//                str.replace(i, i + 1,
//                            Character.toLowerCase(c) + "");
//        }
//    }
// 
//    public static void main(String[] args)
//    {
//        StringBuffer str
//            = new StringBuffer("GeEkSfOrGeEkS");
//        // Calling the Method
//        convertOpposite(str);
// 
//        System.out.println(str);
//    }
//}