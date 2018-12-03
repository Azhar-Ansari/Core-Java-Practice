package com.practice.multithreading;

public class Loopover1LakhNumber implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
