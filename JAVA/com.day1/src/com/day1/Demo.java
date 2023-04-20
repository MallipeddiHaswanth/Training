package com.day1;

public class Demo implements Demo1 , Demo2 {
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("HP");
	}
@Override
public void method2() {
	// TODO Auto-generated method stub
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Demo1 {
	public void method1();
}

interface Demo2 {
	public void method1();

	void method2();
}
