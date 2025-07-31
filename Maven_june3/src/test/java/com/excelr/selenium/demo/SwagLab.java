package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLab {

	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite connect with db");
	}
	
	@BeforeTest
	public void Launch() {
		System.out.println("Before Test ->Launches a browser");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@BeforeClass
	public void LaunchApplication() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Go to home page");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method execution");
	}
	
	@Test
	public void AddCart() throws InterruptedException {
		System.out.println("Item added to Cart");
		driver.findElement(By.xpath("//button[text()='Add to cart'][1]")).click();
		Thread.sleep(2000);
	}
	@AfterClass
	public void logout() throws InterruptedException {
		System.out.println("In logout");
		
		WebElement menu=driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(menu).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		System.out.println("logout done");
	}
	
	@AfterTest
	public void closeBrowser() throws Exception {
		Thread.sleep(4000);
		System.out.println("closed browser");
		driver.quit();
	}
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("closed a connection");
	}
}
