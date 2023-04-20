package com.Demo;

public class Class2 extends Abstract {

	@Override
	void m2(int a, int b) {
		System.out.println("Values :" + a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 obj = new Class2();
		m1(32, 12);

		obj.m2(19, 19);
	}

}
