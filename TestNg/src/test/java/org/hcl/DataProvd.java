package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvd {
	@Test(dataProvider="raj")
	private void type(String s, String s1) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(s);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(s1);
		driver.findElement(By.name("login")).click();
	}
	
	@DataProvider(name="raj")
	private Object[][] test() {
		Object obj[][] = new Object[][] {{"raj","raj@123"},{"Siva","Siva@123"},{"Jeeva","Jeeva@123"}};
		return obj;

	}

}
