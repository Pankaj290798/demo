package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ArrayListDemo4 {
	public static void main(String[] args) {
		List <Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(8);
		al.add(2);
		al.add(9);
		al.add(25);
		al.add(52);
		TreeSet <Integer> ts=new TreeSet <Integer>(al);
		ts.addAll(al);
		System.out.println("Manimum Number "+ts.first());
		System.out.println("Maximum Number "+ts.last());
	}

}
