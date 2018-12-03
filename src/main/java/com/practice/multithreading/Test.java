package com.practice.multithreading;

public class Test {

	public static void main(String[] args) {
		Loopover1LakhNumber loop = new Loopover1LakhNumber();
		
		Thread thread1 = new Thread(loop);
		//thread1.start();
		try {
			Thread.sleep(Integer.MAX_VALUE/2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*Thread thread2 = new Thread(loop);
		thread2.start();
		
		Thread thread3 = new Thread(loop);
		thread3.start();
		
		Thread thread4 = new Thread(loop);
		thread4.start();*/
	}

}
