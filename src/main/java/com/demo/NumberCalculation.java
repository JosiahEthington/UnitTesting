package com.demo;

public class NumberCalculation {
	public int add(int x, int y) {
		return x+y;
	}
	public String convertCase(String input) {
		StringBuilder builder = new StringBuilder("");
		for(char c : input.toCharArray()) {
			if(Character.isLowerCase(c)) {
				builder.append(Character.toUpperCase(c));
			}else {
				builder.append(Character.toLowerCase(c));
			}
		}
		return builder.toString();
	}
}
