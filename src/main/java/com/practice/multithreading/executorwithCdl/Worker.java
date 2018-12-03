package com.practice.multithreading.executorwithCdl;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {

	private CountDownLatch countDownLatch;
	private String name;
	
	public Worker(CountDownLatch countDownLatch, String name) {
		this.countDownLatch = countDownLatch;
		this.name = name;
		new Thread(this).start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(this.name+":"+i);
			this.countDownLatch.countDown();
		}
	}
}
