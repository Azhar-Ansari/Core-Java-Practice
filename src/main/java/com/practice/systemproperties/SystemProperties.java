package com.practice.systemproperties;

public class SystemProperties {

	public static void main(String[] args) {
			System.getProperties().forEach((key,value)->System.out.println(key+":"+value));
	}
}
