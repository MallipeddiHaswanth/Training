package com.Project;

import java.util.*;

//Arrays and arrays List 
public class Com_Day5 {

	public Com_Day5(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		a[0] = 1;

		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("---------------------------");

		Com_Day5[] obj1 = new Com_Day5[5];
		obj1[0] = new Com_Day5(1, "H");
		obj1[1] = new Com_Day5(2, "Ha");
		obj1[2] = new Com_Day5(3, "Has");
		obj1[3] = new Com_Day5(4, "Hasw");
		obj1[4] = new Com_Day5(5, "Haswanth");
		for (int i = 0; i < obj1.length; i++) {
			System.out.println(obj1[i]);
		}

		System.out.println("ArrayList");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(15);
		numbers.add(20);
		numbers.add(00);

		System.out.println(numbers.get(3));

		System.out.println(numbers);
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}

}
