package com.day1;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*In Java, the JVM maintains a string pool to store all of its strings inside the memory.
		 *  The string pool helps in reusing the strings.
	*/
		
		String sr = "Hello";
		String rs = "World!"; // string literal 
		 String name = new String("Java String"); //String 
		System.out.println(sr);
		System.out.println(sr.length()); // length
		System.out.println(sr.concat(rs)); // concat
		System.out.println(sr.equals(rs));
	}

}
