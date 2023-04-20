package com.Project;

public class Com_Day1 {
// Constructor 

	int id;
	String name;

	public Com_Day1() {
		System.out.println("Default constructor ");
	}

	public Com_Day1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println(id +" " + name);
	}

	public static void main(String args[]) {

		Com_Day1 obj1 = new Com_Day1();
		Com_Day1 obj2 = new Com_Day1(10, "Ram");
	}
}
