package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	
	driver.findElement(By.cssSelector("#Email")).sendKeys("harshada@gmail.com");
	driver.findElement(By.cssSelector(".password")).sendKeys("1234");
	driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
	
	
	
}
}
