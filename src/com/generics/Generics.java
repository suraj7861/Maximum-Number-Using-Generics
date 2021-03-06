package com.generics;

public class Generics {
	
	public static void main (String[] args) {
		System.out.println("welcome to Generics program");
		//object creation for Integer
		MaximumNumber<Integer> maxInt = new MaximumNumber<Integer>(32,23,12,43);
		//method call to find max Integer
		maxInt.findMaximum();
		maxInt.printMax();
		
		//object creation for Float
		MaximumNumber<Float> maxfloat = new MaximumNumber<Float>(32.5f,23.3f,12.6f,43.5f);
		//method call to find max float
		maxfloat.findMaximum();
		maxfloat.printMax();
		
		
		//object creation for String
		MaximumNumber<String> maxString = new MaximumNumber<String>("Truck", "Ford", "Car","Tata");
		//method call to find max String
		maxString.findMaximum();
		maxString.printMax();

	}
}
 