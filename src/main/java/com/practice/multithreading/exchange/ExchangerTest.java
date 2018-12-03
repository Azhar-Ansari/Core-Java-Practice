package com.practice.multithreading.exchange;

import java.util.concurrent.Exchanger;

public class ExchangerTest {

	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<>();
		new WriteBuffer(exchanger);
		new ReadBuffer(exchanger);
	}
}
