package com.exe.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;

public class JUnitExample {
	@Test
	public void testCase1() {
		assertEquals("word", "word");
	}
	@Test
	public void testCase2() {
		assertNotEquals("word", "Word");
	}
	@Test
	public void testCase3() {
		assertSame("WorD", "WorD");
	}
	@Test
	public void testCase4() {
		assertNotSame("A#aD", "aad");
	}
	@Test
	public void testCase5() {
		String s = null;
		assertNull(s);
	}
	@Test
	public void testCase6() {
		String s = "";
		assertNotNull(s);
	}
	@Test
	public void testCase7() {
		assertTrue(true);
	}
	@Test
	public void testCase8() {
		assertFalse(false);
	}
	@Test
	public void testCase9() {
		String[] a = {"1","2","A","$"};
		String[] b = {"1","2","A","$"};
		assertArrayEquals(a,b);
	}
}
