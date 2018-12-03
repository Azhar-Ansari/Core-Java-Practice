package com.practice.interfacehierarchy;

public interface InterFaceParent {

	void parentMethod1();
	void parentMethod2();
	void parentMethod3();
	
	default void parentMethod4() {
		System.out.println("InterfaceParent default method");
	}
}
