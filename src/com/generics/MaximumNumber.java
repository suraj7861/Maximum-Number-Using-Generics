package com.generics;

public class MaximumNumber {
	
	//method: find maximum integer
	public void findMaxInt(Integer num1, Integer num2, Integer num3) {
		Integer max = num1;
		if(num2.compareTo(max) > 0) {
			max = num2;
		}
		else if(num3.compareTo(max) > 0) {
			max = num3;
		}
		System.out.println("Maximun Integer number is: "+max);
	}

}