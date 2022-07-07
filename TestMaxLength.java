package com.exe.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestMaxLength {
	String[] a = {"Arun","Arjundas","Balamuruganandam"};
	MaxLength maxlength = new MaxLength();
	
	@Test
	public void testCase1() {
		String s1 = maxlength.maxLen(a);
		assertEquals(a[2].toUpperCase(), s1);
	}
	
	@Test
	public void testCase2() {
		String s1 = maxlength.maxLen(a);
		assertNotNull(s1);
	}
}
