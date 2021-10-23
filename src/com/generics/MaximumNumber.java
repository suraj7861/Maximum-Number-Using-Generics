package com.generics;

public class MaximumNumber<T extends Comparable> {
	//variable declaration
	T x1, x2, x3, x4;
	
	public MaximumNumber(T x1, T x2, T x3, T x4) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
	}
	//method: find maximum 
	public void findMaximum()  {
		T max = x1;
		if(x2.compareTo(max) > 0) {
			max = x2;
		}
		else if(x3.compareTo(max) > 0) {
			max = x3;
		}
		else if(x4.compareTo(max) > 0) {
			max = x4;
		}
		System.out.println("Maximun is: "+max);
	}	

}
