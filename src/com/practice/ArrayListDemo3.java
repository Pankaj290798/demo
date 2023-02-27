package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		List <Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(8);
		al.add(2);
		al.add(9);
		al.add(25);
		al.add(52);
		Collections.sort(al);
		System.out.println("Accending Order :");
		System.out.println(al);
		System.out.println("Deccending Order :");
		Collections.reverse(al);
		System.out.println(al);
	}
	

}
