package com.practice.multithreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {

	private int count;
	private final ReentrantLock lock = new ReentrantLock();

	public int getCount() {
		try {			
			lock.lock();
			System.out.println(Thread.currentThread().getName()+" acquired lock, count value: "+count);
		} finally {
			lock.unlock();
		}
		return ++count;
	}
}
