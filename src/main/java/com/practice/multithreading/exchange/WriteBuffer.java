package com.practice.multithreading.exchange;

import java.util.concurrent.Exchanger;

public class WriteBuffer implements Runnable {

	private String buffer;
	private Exchanger<String> exchanger;

	public WriteBuffer(Exchanger<String> exchanger) {
		this.buffer = new String();
		this.exchanger = exchanger;
		new Thread(this).start();
	}

	@Override
	public void run() {
		char ch = 'A';
		for (int i=0; i<3; i++) {
			for (int j=0; j<5; j++) {
				this.buffer += ch++;				
			} 
			try {
				System.out.println("Sending... "+buffer);
				this.buffer = this.exchanger.exchange(this.buffer);
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
		}
	}
}
