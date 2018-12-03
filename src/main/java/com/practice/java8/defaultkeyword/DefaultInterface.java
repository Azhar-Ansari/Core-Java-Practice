package com.practice.java8.defaultkeyword;

public interface DefaultInterface {

	public default void defaultMethod() {
		System.out.println("Interface default method");
	}
	
	public default int hashcode() {
		return -100;
	}
}
