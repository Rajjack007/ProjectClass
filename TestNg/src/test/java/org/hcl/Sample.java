package org.hcl;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static WebDriver driver;
	@BeforeClass
	private void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"), "Verify Url");
	}
	
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test(priority=-1)
	private void type() {
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("RajaRajan");
		Assert.assertEquals(txtUser.getAttribute("value"), "RajaRajan", "Verify User");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Password@123");
		SoftAssert s = new SoftAssert();
		s.assertEquals(txtPass.getAttribute("Value"), "password@123", "Verify Pass");
	}
	
	@Test
	private void btnLogin() {
		driver.findElement(By.name("login")).click();
	}
	
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterClass
	private void quitBrowser() {
		driver.quit();

	}
}