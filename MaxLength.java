package com.exe.sample;

public class MaxLength {
	
	public String maxLen(String[] s) {
		int max = 0;
		String s1 = null;
		for(String x : s) {
			if(max<x.length()) {
				max=x.length();
				s1=x;
			}
		}
		return s1.toUpperCase();
	}
	
}
