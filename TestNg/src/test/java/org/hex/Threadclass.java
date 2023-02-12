package org.hex;

import org.testng.annotations.Test;

public class Threadclass {
	
	@Test
	private void class1() {
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void class2() {
		System.out.println(Thread.currentThread().getId());
	}
	
	
}
