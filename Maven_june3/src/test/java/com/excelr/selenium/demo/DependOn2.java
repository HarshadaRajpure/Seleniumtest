package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class DependOn2 {

	
	WebDriver driver;
	@Test
	public void register() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("smith");
		driver.findElement(By.name("LastName")).sendKeys("kapoor");
		driver.findElement(By.name("Email")).sendKeys("ates1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		
		driver.findElement(By.id("register-button")).click();
		System.out.println("registration done");
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("In login method");
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		
	}
	
	ITestListener
}
