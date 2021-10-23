package com.generics;

public class Generics {
	
	public static void main (String[] args) {
		System.out.println("welcome to Generics proogram");
		//object creation
		MaximumInteger maxInt = new MaximumInteger(32,23,12);
		//method call to find max int
		maxInt.findMax();
	}
}
