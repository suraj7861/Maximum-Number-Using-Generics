package com.generics;

public class Generics {
	
	public static void main (String[] args) {
		System.out.println("welcome to Generics proogram");
		//object creation for Integer
		MaximumNumber maxInt = new MaximumNumber();
		//method call to find max int
		maxInt.findMaxInt(32,23,12);
		
		//object creation for Float
		MaximumNumber maxfloat = new MaximumNumber();
		//method call to find max float
		maxfloat.findMaxFloat(32.5f,23.3f,12.6f);
		
		//object creation for String
		MaximumNumber maxString = new MaximumNumber();
		//method call to find max float
		maxString.maxString("Truck", "Ford", "Sedan1");

	}
}
