package com.Project;

class Com_Day3abstract extends Com_Day3 {

	@Override
	void Display() {
		System.out.println("Providing body for abstract method through overwriting :");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Com_Day3abstract obj1 = new Com_Day3abstract();
		obj1.Display();
		obj1.C_method();
	}

}
