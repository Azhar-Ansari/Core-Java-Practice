package com.practice.java8.lambda;

import java.util.Arrays;

public class LambdaException {

	public static void main(String[] args) throws EmptyArrayException {
		
		Array sumArr = array->{
			double sum = 0;
			if (array.length == 0) 
				throw new EmptyArrayException();
			
			sum = Arrays.stream(array).sum();
			return sum;
		};
		
		double[] arr = {1.0, 2.0, 3.0, 4.0};
		System.out.println("Sum of array elements: "+sumArr.sum(arr));
	}
}


interface Array{
	double sum(double arr[]) throws EmptyArrayException; 
}