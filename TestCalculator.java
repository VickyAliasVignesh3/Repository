package com.exe.sample;

import org.junit.*;

public class TestCalculator {
	Calculator calculator = new Calculator();
	
	@Test
	public void testAddition() {
		calculator.addition();
	}
	@Test
	public void testSubtraction() {
		calculator.subtraction();
	}
	@Test
	public void testMultiplication() {
		calculator.multiplication();
	}
	@Test
	public void testDivision() {
		calculator.division();
	}
}
