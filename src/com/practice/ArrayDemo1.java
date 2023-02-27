package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int a[]= {5,7,8,9,10};
	
	List <Integer> al=new ArrayList<Integer>();
	for (int i=0;i<a.length;i++) {
		al.add(a[i]);
	}System.out.println("by using iterator");
	System.out.println(al);
	System.out.println("by using iterator");
	Iterator<Integer> itr = al.iterator();
	while (itr.hasNext()) {
		
		System.out.println(itr.next());
	}
	
	
	}
}
