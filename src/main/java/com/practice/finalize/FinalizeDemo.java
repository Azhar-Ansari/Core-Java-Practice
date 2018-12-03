package com.practice.finalize;

public class FinalizeDemo {
	
	private String name;
	
	public FinalizeDemo(String name) {
		this.name = name;
		System.out.println("Constructor called with param: "+name);
	}
	
	public static void main(String[] args) {
		String name = "Azhar";
		FinalizeDemo finalizeDemo = new FinalizeDemo(name);
		finalizeDemo.name = null;
		System.gc();
		finalizeDemo.method();
	}

	private void method() {
		System.out.println("Method called");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called...");
		super.finalize();
	}
}
