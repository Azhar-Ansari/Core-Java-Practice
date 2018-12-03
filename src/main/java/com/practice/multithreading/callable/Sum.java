package com.practice.multithreading.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Sum implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		TimeUnit.SECONDS.sleep(2);
		return 10+20;
	}

}
