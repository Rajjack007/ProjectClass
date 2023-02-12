package org.hex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test(dataProvider="raj")
public class BaseClass {
	public static WebDriver driver;
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public void launchUrl() {
		driver.get("https://www.facebook.com/");
	}

	public void type(String s, String s1) {
		driver.findElement(By.id("email")).sendKeys(s);
		driver.findElement(By.id("pass")).sendKeys(s1);
	}
	
	public void btnClick() {
		driver.findElement(By.name("login")).click();
	}
	
	@DataProvider(name="raj")
	private Object[][] classA() {
		Object obj[][] = new Object[][] {{"Raja0707","Raja@123"},{"Siva","Siva@123"}};
		return obj;

	}
}
