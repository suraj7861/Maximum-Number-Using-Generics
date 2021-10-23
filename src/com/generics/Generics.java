package com.generics;

public class Generics {
	
	public static void main (String[] args) {
		System.out.println("welcome to Generics proogram");
		//object creation for Integer
		MaximumNumber maxInt = new MaximumNumber(32,23,12);
		//method call to find max Integer
		maxInt.findMaximum();
		
		//object creation for Float
		MaximumNumber maxfloat = new MaximumNumber(32.5f,23.3f,12.6f);
		//method call to find max float
		maxfloat.findMaximum();
		
		//object creation for String
		MaximumNumber maxString = new MaximumNumber("Truck", "Ford", "Car");
		//method call to find max String
		maxString.findMaximum();

	}
}
