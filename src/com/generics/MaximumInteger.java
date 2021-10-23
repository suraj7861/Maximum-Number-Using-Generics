package com.generics;

public class MaximumInteger {
	
	//variable declaration
	private Integer num1, num2, num3;

	public MaximumInteger(Integer num1, Integer num2, Integer num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public void findMax() {
		Integer max = num1;
		if(num2.compareTo(max) > 0) {
			max = num2;
		}
		else if(num3.compareTo(max) > 0) {
			max = num3;
		}
		System.out.println("Maximun number is: "+max);
	}
}
