package com.practice;

public class ReapitingString {
	public static void main(String[] args) {
		String s="Pankaj";
		int count;
		char string[]=s.toCharArray();
		for (int i=0;i<string.length;i++) {
			count=1;
			for(int j=i+1; j<string.length;j++) {
				if(string[i]==string[j]) {
					count++;
					
				}
			}
			if(count>1) {
				System.out.println(string[i]);
			}
		}
	}

}
