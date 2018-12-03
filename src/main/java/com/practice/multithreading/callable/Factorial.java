package com.practice.multithreading.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Factorial implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		TimeUnit.SECONDS.sleep(5);
		return 4*3*2*1;
	}

}
