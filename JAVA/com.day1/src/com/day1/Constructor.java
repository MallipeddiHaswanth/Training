package com.day1;

public class Constructor {
	static int a = 10;
	String sr = "Haswanth";

	public Constructor(String rs) {
		super();

		sr = rs;
	}

	public static void main(String[] args) {
		Constructor obj1 = new Constructor("App");
		Constructor obj2 = new Constructor("Map");

		System.out.println(obj1.sr);
		System.out.println(obj2.sr);

	}

}
