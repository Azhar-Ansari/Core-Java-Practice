package com.practice.interfac.multipleinheritance;

public class Client {

	public static void main(String[] args) {
		InterfaceA impl = new Concrete();
		impl.method();
	}

}
