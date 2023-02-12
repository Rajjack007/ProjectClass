package org.hex;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrows {
	WebDriver driver;
	@Parameters("browerName")
	@Test
	private void test1(String bName) {
		
		if (bName.contains("chrome")) {
			System.out.println("Chrome");
			
		}else if (bName.contentEquals("firefox")) {
			System.out.println("firefox");
		
		}else if (bName.equalsIgnoreCase("ie")) {
			System.out.println("IE");
		
		}else {
			System.out.println("Invalid");
		}
	}
	
}
