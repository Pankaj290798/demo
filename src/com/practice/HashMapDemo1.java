package com.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
	public HashMap <Integer, String> getEmployee() {
		HashMap <Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(101, "Pankaj");
		hashMap.put(102,"Vaibhav");
		hashMap.put(103,"Aniket");
		return hashMap;
	}
	public static void main(String[] args) {
		HashMapDemo1 hm=new HashMapDemo1();
		System.out.println("first way "+hm.getEmployee());
		Map<Integer,String>map=hm.getEmployee();
		System.out.println("second way "+map);
		HashMap <Integer, String> hashmap=hm.getEmployee();
		System.out.println("Third way "+hashmap );
	}

}
