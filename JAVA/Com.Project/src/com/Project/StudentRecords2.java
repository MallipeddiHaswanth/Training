package com.Project;

public class StudentRecords2 implements StudentRecord {
	int id;
	String name;

	@Override
	public void display(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(id + "   " + name + "   " + clg);
		System.out.println(clg);
	}

	public static void main(String[] args) {

		//StudentRecords2 S1 = new StudentRecords2();
		
		
		//S1.display(1, "Haswanth");
	}

}
