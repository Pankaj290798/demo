package com.practice;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s= new Stack();
		s.push("pankaj");
		s.push(2);
		s.push(5);
		s.push(8);
		System.out.println(s.peek());
		//System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.search(3));
	}

}
