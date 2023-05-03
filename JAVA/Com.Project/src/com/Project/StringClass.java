package com.Project;

public class StringClass {
	// Strings and arrays
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String str = "Haswanth";
		int array[] = { 1, 2, 4 }; // array literals
		System.out.println(array[0]);
		for (int a : array) {
			System.out.println(a);
		}
		str.concat("Mallipeddi");
		str = str.concat("Mallipeddi");

		StringBuffer sb = new StringBuffer("Hello"); // string Buffer

		sb.append("Java"); // append concatenates
		sb.insert(1, "Java"); // The insert() method inserts the given String with this string at the given
								// position.
		System.out.println(sb);

		StringBuilder bs = new StringBuilder("Hello ");
		bs.insert(1, "Java");// now original string is changed
		System.out.println(bs);// prints HJavaello

		/*
		 * System.out.println(str); System.out.println(str.charAt(0));
		 * System.out.println(str.hashCode());
		 */

	}

}
