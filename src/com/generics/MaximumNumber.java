package com.generics;

public class MaximumNumber<T extends Comparable> {
	//variable declaration
	T x, y, z;
	
	public MaximumNumber(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	//method: find maximum integer
	public void findMaximum()  {
		T max = x;
		if(y.compareTo(max) > 0) {
			max = y;
		}
		else if(z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("Maximun is: "+max);
	}	

}
