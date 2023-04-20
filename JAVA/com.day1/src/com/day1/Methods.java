package com.day1;

public class Methods {

	public void findgreater(int a, int b) {
		System.out.println("Enter values of a ,b");
		System.out.println("value of a:" + a + " Value of b: " + b);

		if (a <= b) {
			System.out.println(a + " " + "A value less than B value " + b);
		} else {
			System.out.println("B Value :" + b + "is less than A value:" + a);

		}
	}

	public void findgreater(int a, int b, int c) { // method overloading 
		System.out.println("Enter values of a ,b");
		System.out.println("value of a:" + a + " Value of b: " + b + "value of c:" + c);

		if (a >= b) {
			if (a >= c)
				System.out.println(a + " is the largest number.");
			else
				System.out.println(c + " is the largest number.");
		} else {
			if (b >= c)
				System.out.println(b + " is the largest number.");
			else
				System.out.println(c + " is the largest number.");
		}
	}

	// if(a<=b && a<=c) {
	// System.out.println("A value" + a + " is less than b value " + b +" " + c +"
	// "+"and c value ");

	// }

	// }

	public static void findEvenOdd(int num) {

		// method body
		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//findEvenOdd(98);

		Methods obj1 = new Methods();
		//obj1.findgreater(20, 30);
		obj1.findgreater(10, 99, 66);
	}

}
