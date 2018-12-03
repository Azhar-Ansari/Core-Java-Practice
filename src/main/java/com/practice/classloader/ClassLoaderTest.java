package com.practice.classloader;

public class ClassLoaderTest {

	public static void main(String[] args) {
		ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
		System.out.println(classLoader.getClass().getName());
		System.out.println(classLoader.getParent().getClass().getName());
		System.out.println(classLoader.getParent().getParent());
	}
}
