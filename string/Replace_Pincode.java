package com.string;

import java.util.Scanner;

public class Replace_Pincode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
				
				System.out.println("Enter the Address = ");
				String str = sc.nextLine();
				
				boolean pin = str.contains("pincode");
				//System.out.println(pin);
				if(pin==str.contains(str)) {
				String rep = str.replace("pincode", " ");
				System.out.println(rep);
				}
				else {
					System.out.println("give pincode");
				}
				
			}

		}


