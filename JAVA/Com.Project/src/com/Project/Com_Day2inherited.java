package com.Project;

public class Com_Day2inherited extends com_Day2 {

	// Derived Class / child class

	// Method overriding
	public void m1() {
		super.m1(); // super keyword is used to access attributes and data members from parent class
		System.out.println("overriding ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Com_Day2inherited car1 = new Com_Day2inherited();
		car1.m1();
	}

}
