package com.Demo;

public class StudentDetails_2 extends StudentDetails {

	public void Display(int id, String name) {
		System.out.println("------------------------");
		this.Display2(id, name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails_2 Student_4 = new StudentDetails_2();
		Student_4.Display(3, "Nihar");
	}

}