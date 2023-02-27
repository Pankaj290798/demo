package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {
	public static void main(String[] args) {
      ArrayList<Employee1> al=new ArrayList<Employee1>();
	al.add(new Employee1(101,"Pankaj",50000));
	al.add(new Employee1(102,"Vaibhav",30000));
	al.add(new Employee1(103,"Bhavesh",80000));
	al.add(new Employee1(104,"Abijit",100000));
	al.add(new Employee1(105,"Aniket",10000));
	al.add(new Employee1(106,"Rohit",5000));
	
	Collections.sort(al);
	for(Employee1 empl : al) {
		System.out.println("id>>" + empl.getId() + " name>>" + empl.getName() + " salary" + empl.getSalary());
	}


	
	
	
	}
}
