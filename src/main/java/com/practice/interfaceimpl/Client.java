package com.practice.interfaceimpl;

import com.practice.interfaceimpl.inter.ConcreteImpl;
import com.practice.interfaceimpl.inter.InterFace;

public class Client {
	
	private String string;
	private InterFace inter = new ConcreteImpl();
	public static void main(String[] args) {
		new Client().applyString();
	}
	private void applyString() {
		this.string =inter.getString(); 		
		System.out.println(string);
	}
}
