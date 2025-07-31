package com.excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Login(String un,String pass) throws InterruptedException {
		
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
	}
	
	

}
