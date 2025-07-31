package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
//	WebElement emailTxtBox=driver.findElement(By.id("email"));
//	emailTxtBox.sendKeys("harshada@gmail.com");
	
	
	driver.findElement(By.id("email")).sendKeys("harshada@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("1234");
//	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	//driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.partialLinkText("Create ")).click();
}
}
