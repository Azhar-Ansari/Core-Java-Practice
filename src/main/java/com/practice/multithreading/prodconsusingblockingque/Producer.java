package com.practice.multithreading.prodconsusingblockingque;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {

	private BlockingQueue<Integer> sharedQueue;
	
	public Producer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				System.out.println("Preparing dish: "+i);
				sharedQueue.put(i);
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}				
		}
	}
}
