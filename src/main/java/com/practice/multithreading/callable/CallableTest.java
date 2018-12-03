package com.practice.multithreading.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Future<Integer> f1;
		Future<Integer> f2;
		Future<Double> f3;
		
		System.out.println("Starting...");
		
		f1 = executorService.submit(new Sum());
		f2 = executorService.submit(new Factorial());
		f3 = executorService.submit(new Hypotenuse());
		
		System.out.println(f1.get());
		System.out.println(f2.get());
		System.out.println(f3.get());
		
		executorService.shutdown();
		System.out.println("Finished...");
	}
}
