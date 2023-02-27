package com.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinksedHashSetDemo { 
	public static void main(String[] args) {
		
	
	LinkedHashSet <String> lhs=new LinkedHashSet <String>();
	lhs.add("5");
	lhs.add("25");
	lhs.add("5");
	lhs.add("Pankaj");
	/*Iterator <Integer> itr=lhs.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(lhs);*/
	for (  String i:lhs) {
		System.out.println(i);
	}
	}

}	
