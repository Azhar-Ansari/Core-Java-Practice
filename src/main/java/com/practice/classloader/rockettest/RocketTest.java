package com.practice.classloader.rockettest;

import com.practice.classloader.rocket.Rocket;

public class RocketTest {

	public static void main(String[] args) {
		System.out.println(RocketTest.class.getClassLoader().getClass().getName());
		Rocket rocket = new Rocket();
		rocket.getClassLoader();
	}
}
