package com.practice;

public class Reverse {
	public static void main(String[] args) {
		
	

	String s="Aaakaakkaakk";
	int rev=0;
	for (int i=0;i<s.length();i++) 
	{
		for (int j=i+1;j>s.length();j++) {
			char ch=s.charAt(i);
			char a=s.charAt(j);
			if( ch == a) {
	 
				rev++;
			} System.out.println(rev);
		}
	}
		
	}
}
