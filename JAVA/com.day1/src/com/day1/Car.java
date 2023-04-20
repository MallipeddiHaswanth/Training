package com.day1;

public class Car { // class

	static String type = "Car"; // static variables
	String Model, color;// fields / Instance variables
	int price;
	private int speed = 100;

	public void spec(int speed) {
		speed--;

		System.out.println(speed);

	}

	public static void main(String args[]) {
		Car obj1 = new Car();
		obj1.color = "red";
		System.out.println(obj1.color);
		obj1.spec(245);

		System.out.println(type);
	}
}
