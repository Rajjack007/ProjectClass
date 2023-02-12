package org.hex;

import org.testng.annotations.Test;

public class ThreadClass2 {

	@Test
	private void class11() {
		System.out.println(Thread.currentThread().getPriority());
	}
	@Test
	private void class12() {
		System.out.println(Thread.currentThread().getPriority());
	}
	@Test
	private void class13() {
		System.out.println(Thread.currentThread().getPriority());
	}
	
}
