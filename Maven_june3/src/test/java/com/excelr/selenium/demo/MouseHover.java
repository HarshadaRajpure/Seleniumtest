package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	
	WebElement Books=driver.findElement(By.xpath("//ul[@class=\"top-menu\"]/li[1]/a"));
	WebElement Apparel=driver.findElement(By.xpath("//ul[@class=\"top-menu\"]/li[4]/a"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(Books).build().perform();
	Thread.sleep(3000);
	act.moveToElement(Apparel).build().perform();
	
}
}
