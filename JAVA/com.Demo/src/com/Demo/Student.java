package com.Demo;

public class Student // class

{
	int id; // data members or fields or instance variables

	String name;
 static  String clg= "Wright";

 
	public void Display(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(id + " ; " + name +" ; " + clg);
	}
}
