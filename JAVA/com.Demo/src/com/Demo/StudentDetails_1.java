package com.Demo;

public class StudentDetails_1  extends Student{

	
		public void Display2(int id, String name) {
			System.out.println("-------------------");

			this.Display(id, name);

		}

		public static void main(String[] args) {

			Student Student_1 = new Student();
			StudentDetails Student_2 = new StudentDetails();
	//Student Student_3 = new StudentDetails();
	// Doubt 1  (Student_3.) 

			Student_1.Display(1, "Haswanth");
			Student_2.Display2(2, "Ram");

		}
	}


