package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://docs.oracle.com/javase/8/docs/api/");
	
	driver.switchTo().frame(0);
	driver.findElement(By.linkText("java.applet")).click();
	
	Thread.sleep(4000);
	driver.switchTo().defaultContent();
	Thread.sleep(4000);
	driver.switchTo().frame(1);
	driver.findElement(By.linkText("Applet")).click();
	Thread.sleep(4000);
	driver.switchTo().defaultContent();
	Thread.sleep(4000);
	driver.switchTo().frame(2);
	driver.findElement(By.linkText("MenuContainer")).click();
}
}
