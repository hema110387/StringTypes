package com.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_words {
public static void main(String[] args) {
	
	String s="by the people of the people for the class";
	
	String[] sp= s.split(" ");
	
	Map<String, Integer>m1=new LinkedHashMap <> ();
	
	for (String str: sp) {
		 if(m1.containsKey(str)) {
			 Integer num = m1.get(str);
			 m1.put(str,num+1);
			 }
		 else {
			 m1.put(str,1);
		 }
	}
	
	System.out.println(m1);
	
	 Set<Entry<String, Integer>> en = m1.entrySet();
	 System.out.println(en);
	 for (Entry<String, Integer> entry : en) {
		if(entry.getValue()>1) {
		 System.out.println(entry);
	 }
	
}
}
}