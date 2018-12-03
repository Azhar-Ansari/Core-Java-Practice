package com.practice.interfac.multipleinheritance;

public class Concrete implements InterfaceA,InterfaceB {

	@Override
	public void method() {
		// InterfaceA.super.method();
		// InterfaceB.super.method();
		System.out.println("Concrete method");
	}

}
