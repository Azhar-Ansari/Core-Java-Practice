package com.practice.multithreading.exchange;

import java.util.concurrent.Exchanger;

public class ReadBuffer implements Runnable {

	private Exchanger<String> exchanger;

	public ReadBuffer(Exchanger<String> exchanger) {
		this.exchanger = exchanger;
		new Thread(this).start();
	}

	@Override
	public void run() {
		for (int i=0; i<3; i++) {
			try {
				System.out.println("Reading buffer...");
				String buffer = this.exchanger.exchange(new String());
				System.out.println("Got: " + buffer);
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
		}
	}
}
