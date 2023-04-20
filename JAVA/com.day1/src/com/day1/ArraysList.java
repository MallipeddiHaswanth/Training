package com.day1;

import java.util.*;

public class ArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a[];//declaration
		// a= new int[5];// instaniate
		int a[] = new int[5];// initialization
		a[0] = 10;
		int Array[] = { 1, 2, 3, 4, };
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}

		List list = new ArrayList<>(); // size is 10 by default
		// ArrayList list1 = new ArrayList<>();
		list.add(198);
		list.add("Haswanth");
		list.add(198);
		list.add(true);

		Employee obj1 = new Employee(1, "Ram", 100);
		obj1.toString();
		list.add(obj1);
		System.out.println(list);
	}

}

class Employee {
	int id;
	String fname;
	long sal;

	public Employee(int id, String fname, long sal) {
		super();
		this.id = id;
		this.fname = fname;
		this.sal = sal;
	}

}