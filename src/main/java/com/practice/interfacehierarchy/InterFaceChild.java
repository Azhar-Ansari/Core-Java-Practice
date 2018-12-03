package com.practice.interfacehierarchy;

public interface InterFaceChild extends InterFaceParent {
	
	void childMethod1();
	void childMethod2();
	
	@Override
	default void parentMethod4() {
		System.out.println("InterfaceChild default method");
	}
}
