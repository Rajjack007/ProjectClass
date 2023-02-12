package org.hcl;

import org.testng.annotations.Test;

public class A1 {
	
	@Test(groups="Sanity")
	private void test11() {
		System.out.println("Test 11");
	}
	
	@Test(groups="E2E")
	private void test12() {
		System.out.println("Test 12");
	}
	
	@Test(groups="Reg")
	private void test13() {
		System.out.println("Test 13");
	}
	
	@Test(groups="Smoke")
	private void test14() {
		System.out.println("Test 14");
	}

}
