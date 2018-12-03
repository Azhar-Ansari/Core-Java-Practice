package com.practice.multithreading.reentrantlock;

import java.util.concurrent.TimeUnit;

public class Worker extends Thread {

	private static Counter counter = new Counter();
	
	@Override
	public void run() {
		try {
			while(counter.getCount() <= 9)
				TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
