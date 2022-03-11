package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class NumberCalculationTest {
	public NumberCalculation nc = new NumberCalculation();
	
	@Test
	public void testCase1() {
		assertEquals(nc.add(1, 2), 3);
	}
	
	@Test
	public void testCase2() {
		assertEquals(nc.convertCase("hEllo"), "HeLLO");
	}
	
	@Test
	public void testCase3() {
		assertEquals(nc.convertCase("lowercasewithsymbols %^"), "LOWERCASEWITHSYMBOLS %^");
	}
	@Test
	public void testCase4() {
		assertEquals(nc.add(-5, -5), -10);
	}
	@Test
	public void testCase5() {
		assertEquals(nc.convertCase("LOWERCASEWITHSYMBOLS %^"), "lowercasewithsymbols %^");
	}
	
}
