package com.Project;

//Exceptions 
public class Com_day6 {
	void display() {
		try {
			int a = 5 / 0;
		} catch (ArithmeticException error) {
			System.out.println(error);
		}
	}

	public static void main(String args[]) {
		Com_day6 obj1 = new Com_day6();
		obj1.display();
	}

}
