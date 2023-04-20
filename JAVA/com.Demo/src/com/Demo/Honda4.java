package com.Demo;

public class Honda4 extends Bike {

	@Override
	void run() {
		System.out.println("Bike ");
	}

	public static void main(String[] args) {
		Honda4 obj1 = new Honda4();
		obj1.run();
	}

}
