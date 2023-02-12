package org.hcl;

import org.testng.annotations.Test;

public class TestNgTest {
	
	@Test(priority=-5)
	private void test1() {
		System.out.println("Test 1");
	}
	
	@Test(invocationCount=5)
	private void test2() {
		System.out.println("Test 2");
	}
	
	@Test(enabled=false)
	private void test5() {
		System.out.println("Test 5");
	}
	
	@Test(priority=3)
	private void test3() {
		System.out.println("Test 3");
	}
	
	@Test(priority=-5)
	private void test4() {
		System.out.println("Test 4");
	}
}
