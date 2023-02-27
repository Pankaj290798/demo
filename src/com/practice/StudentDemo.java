package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {public static void main(String[] args) {
	

  ArrayList <Student> al=new ArrayList<Student>();
  al.add(new Student(2,"Sachin"));
  al.add(new Student(1,"Pankaj"));
  Collections.sort(al,new IdComparator());
  for (Student emp : al) {
		System.out.println("id>>" + emp.getId() + " name>>" + emp.getName());
	}

  }
}
