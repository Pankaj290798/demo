package com.practice;

import java.util.HashMap;

public class HashMapSetDemo2 {
	public static void main(String[] args) {
	   HashMap <Employee,String> hashmap=new HashMap <Employee,String>();
	   Employee emp=new  Employee();
	   System.out.println(emp);
	  hashmap.put(emp, emp.getSalary());
	   System.out.println(emp);
	   System.out.println("Salary of Employee = "+emp.getSalary());
	   System.out.println("Name of Employee is "+emp.getName());
	}

}
