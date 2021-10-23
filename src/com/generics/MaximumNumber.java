package com.generics;

public class MaximumNumber {
	
	//method: find maximum integer
	public <T extends Comparable> void findMaximum(T num1, T num2, T num3)  {
		T max = num1;
		if(num2.compareTo(max) > 0) {
			max = num2;
		}
		else if(num3.compareTo(max) > 0) {
			max = num3;
		}
		System.out.println("Maximun is: "+max);
	}	

}
