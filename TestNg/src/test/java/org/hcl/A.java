package org.hcl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	
	@Test
	private void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	private void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	private void test3() {
		Assert.assertTrue(false);
	}
	
	@Test
	private void test4() {
		Assert.assertTrue(false);
	}

}
