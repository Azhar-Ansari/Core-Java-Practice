package com.practice.interfaceimpl.inter;


public abstract class InterFaceAbstractImpl implements InterFace{
	
	public String string; 
	
	public String getString() {
		new ConcreteImpl().setString();
		return this.string;
	}
}
