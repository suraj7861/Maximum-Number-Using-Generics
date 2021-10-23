package com.generics;

public class Generics {
	
	public static void main (String[] args) {
		System.out.println("welcome to Generics proogram");
		//object creation
		MaximumNumber maxInt = new MaximumNumber();
		//method call to find max int
		maxInt.findMaxInt(32,23,12);
		
		//object creation
		MaximumNumber maxfloat = new MaximumNumber();
		//method call to find max float
		maxfloat.findMaxFloat(32.5f,23.3f,12.6f);

	}
}
