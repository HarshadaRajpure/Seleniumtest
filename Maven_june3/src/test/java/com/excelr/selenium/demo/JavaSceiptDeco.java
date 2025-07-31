package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSceiptDeco {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/draggable/");
	
	driver.switchTo().frame(0);
	
	WebElement drag=driver.findElement(By.id("draggable"));
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].style.border='6px solid blue'",drag);
	
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,1000);");
	
}
}
