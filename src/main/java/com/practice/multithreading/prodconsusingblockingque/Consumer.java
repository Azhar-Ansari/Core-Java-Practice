package com.practice.multithreading.prodconsusingblockingque;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {

	private BlockingQueue<Integer> sharedQueue;
	
	public Consumer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				TimeUnit.SECONDS.sleep(10);
				int i = sharedQueue.take();
				System.out.println("Serving dish: "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}				
		}
	}
}
