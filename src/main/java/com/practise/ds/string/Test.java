package com.practise.ds.string;

public class Test {

	public static void main(String[] args) {
		String a = "abcde";
		String b = "cdeab";

		if (a.length() != b.length()) {
			System.out.println("false");
			System.exit(0);
		}

		for (int i = 0; i < a.length(); i++) {
			a = Shift(a);
			if (a.equals(b)) {
				System.out.println("true");
				System.exit(0);
			}
		}
		System.out.println("false");
	}

	public static String Shift(String s) {
		return s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
	}

}