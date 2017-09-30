package com.jikexueyuan.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.jikexueyuan.util.Calculator;

public class CalculatorTest {
	
	@Test
	public void testAdd(){
		Calculator cal = new Calculator();
		int result = cal.add(3,  5);
		assertEquals(8, result);
	}
	
	@Test
	public void testSubstract(){
		Calculator cal = new Calculator();
		int result = cal.subtract(1, 6);
		assertEquals(-5, result);
	}
	
	@Test
	public void testMultiply(){
		Calculator cal = new Calculator();
		int result = cal.multiply(5, 9);
		assertEquals(45, result);
	}
	
	

}
