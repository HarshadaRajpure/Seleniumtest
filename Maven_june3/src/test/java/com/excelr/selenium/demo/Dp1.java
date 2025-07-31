package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp1 {

	WebDriver driver;

	@BeforeClass
	public void Launch() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@DataProvider(name = "logindata")
	public Object[][] dpMethod() {
		return new Object[][] { { "standard_user", "secret_sauce" }, // Valid login
				{ "performance_glitch_user", "secret_sauce" }, { "locked_out_user", "secret_sauce" },

		};
	}

	@Test(dataProvider = "logindata")
	public void login(String username, String password) throws InterruptedException {

		driver.findElement(By.id("user-name")).sendKeys(username);

		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();

		System.out.println(username + "  " + password);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
