package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamJoining {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add("D");
		String listToString = strList.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(listToString);
	}
}
