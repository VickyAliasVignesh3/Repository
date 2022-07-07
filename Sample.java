package com.exe.sample;

import org.junit.*;

public class Sample {
	@Before
	public void beforeCase() {
		System.out.println("Welcome");
	}
	
	@Test
	public void testCase() {
		System.out.println("This is JUnit test case");
	}
	
	@After
	public void aftercase() {
		System.out.println("Thank You");
	}
}
