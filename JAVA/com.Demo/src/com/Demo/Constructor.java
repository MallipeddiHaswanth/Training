package com.Demo;

public class Constructor {
	int id = 100;
	String name = "Haswanth";

	Constructor(int a, String b) {
		this.id = a;
		this.name = b;

	}

	public void display() {

		System.out.println("Student name:" + " " + name + " " + "Student Id is :" + " " + id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor(1, "H");
		Constructor obj1 = new Constructor(2, "Ha");

		obj.display();
		obj1.display();
// System.out.println(obj.a);

	}

}
