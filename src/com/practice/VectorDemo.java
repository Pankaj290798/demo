package com.practice;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v=new Vector (0);
		for (int i=0; i<20;i++) {
			System.out.println("pankaj");
		}
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		System.out.println(v);
		System.out.println(v.capacity());
		
	}

}
