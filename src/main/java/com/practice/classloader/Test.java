package com.practice.classloader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.practice.classloader.rocket.Rocket;

public class Test {

	public static void main(String[] args) {
		System.out.println(Test.class.getClassLoader().getClass().getName());
		
		Rocket rocket = new Rocket();
		rocket.getClassLoader();
		Class<Rocket> clazz = Rocket.class;
		System.out.println(clazz.getName());
		System.out.println(clazz.getCanonicalName());
		
		for(Field field:clazz.getDeclaredFields()) {
			System.out.println(field.getName());
		}
		
		for(Method method:clazz.getDeclaredMethods()) {
			System.out.println(method.getName());
		}
	}
}
