package com.practice.multithreading.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Hypotenuse implements Callable<Double> {

	@Override
	public Double call() throws Exception {
		TimeUnit.SECONDS.sleep(3);
		double hypo = Math.sqrt(10*10+12*12);
		return hypo;
	}

}
