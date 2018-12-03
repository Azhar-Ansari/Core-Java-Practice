package com.practice.java8.defaultkeyword;

public class ConcreteImpl implements DefaultInterface {

	public void defaultMethod() {
		System.out.println("Concrete default method");
	}
	
	
	@Override //overriden method of object class, not DefaultInterface
	public int hashCode() {
		return 100;
	}
	
	public static void main(String[] args) {
		System.out.println(new ConcreteImpl().hashCode());
	}

}
