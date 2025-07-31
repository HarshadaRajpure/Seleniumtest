package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_RightClick {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	WebElement emailtxtBox=driver.findElement(By.id("email"));
	emailtxtBox.sendKeys("excelr");
	Actions act=new Actions(driver);
	act.doubleClick(emailtxtBox).contextClick().build().perform();
}
}
