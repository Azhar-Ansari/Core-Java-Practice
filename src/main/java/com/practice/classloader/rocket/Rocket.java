package com.practice.classloader.rocket;

public class Rocket {
	private int launchType;
	public static String engine;

	private void launch() {
	}

	private String takeOff() {
		return "success";
	}

	public void getClassLoader() {
		System.out.println(Rocket.class.getClassLoader().getClass().getName());
	}
}
