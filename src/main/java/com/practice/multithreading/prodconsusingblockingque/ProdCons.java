package com.practice.multithreading.prodconsusingblockingque;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdCons {

	public static void main(String[] args) {
		//BlockingQueue<Integer> dishQueue = new SynchronousQueue<>();
		BlockingQueue<Integer> dishQueue = new ArrayBlockingQueue<>(1);
		Thread producerThread = new Thread(new Producer(dishQueue));
		Thread consumerThread = new Thread(new Consumer(dishQueue));
		producerThread.start();
		consumerThread.start();
	}
}
