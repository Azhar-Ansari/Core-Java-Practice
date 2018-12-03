package com.practice.multithreading.executorwithCdl;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

	public static void main(String[] args) {
		CountDownLatch countDownLatchA = new CountDownLatch(5);
		CountDownLatch countDownLatchB = new CountDownLatch(5);
		CountDownLatch countDownLatchC = new CountDownLatch(5);
		CountDownLatch countDownLatchD = new CountDownLatch(5);
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		System.out.println("Starting...");
		
		executorService.execute(new Worker(countDownLatchA, "Thread1"));
		executorService.execute(new Worker(countDownLatchB, "Thread2"));
		executorService.execute(new Worker(countDownLatchC, "Thread3"));
		executorService.execute(new Worker(countDownLatchD, "Thread4"));
		
		try {
			countDownLatchA.await();
			countDownLatchB.await();
			countDownLatchC.await();
			countDownLatchD.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		executorService.shutdown();
		
		System.out.println("Finished...");
	}
}
