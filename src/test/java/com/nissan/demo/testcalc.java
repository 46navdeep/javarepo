package com.nissan.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcalc {

	@Test
	public void test() {
		calc o1 = new calc();
		assertEquals(10, o1.sum(5,5));
	}

}
