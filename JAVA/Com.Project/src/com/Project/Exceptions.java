package com.Project;

public class Exceptions {

	public void voter(int age) {
		if (age <= 18) {
			try {
				throw new ArithmeticException("Person is not eligible to vote");

				//throw new Exception();
			} catch (Exception a) {
				System.out.println(a);
			} finally {
				System.out.println("Finally always print");
			}
		}
	}

	public static void main(String[] args) {

		Exceptions obj1 = new Exceptions();
		obj1.voter(17);

		/*
		 * try {
		 * 
		 * try { int d = 10 / 0; // infinity value System.out.println(d); } catch
		 * (Exception error) { System.out.println(error); System.out.println("error1");
		 * }
		 * 
		 * try { int b[] = new int[10]; b[11] = 10;
		 * 
		 * } catch (Exception error1) { System.out.println(error1);
		 * System.out.println("Error2"); }
		 * 
		 * }
		 * 
		 * finally { System.out.println("Finally is always excetued");
		 */

	}
}
