package com.practice;

//import java.util.LinkedList;

public class Arraydemo {
	public static void main(String[] args) {
		
	
	/*LinkedList <Integer> li=new LinkedList <Integer>();
	li.add(5);
	li.add(6);
	li.add(5);
	li.add(2);
	System.out.println(li);
	System.out.println(li.get(1));
	System.out.println(li.getFirst());
	System.out.println(li.getLast());
	int n=6;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.println(i);
		}*/
		int n=371;
		int old =n;
		int rev=0;
		while (n!=0) {
			int rem=n%10;
			rev +=rem*rem*rem;
			n=n/10;
			}
		System.out.println(rev);
		if(rev==old) {
			System.out.println("this is Armstrong number");
		}
		else {
			System.out.println("this is not armstrong number");
		}
			
			
	}
	

}
