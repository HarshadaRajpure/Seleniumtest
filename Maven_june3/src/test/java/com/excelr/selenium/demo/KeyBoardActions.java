package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	WebElement searchBar=driver.findElement(By.name("q"));
	
	Actions act=new Actions(driver);
	act.keyDown(Keys.SHIFT).sendKeys("hello selenium").keyUp(Keys.SHIFT).build().perform();
}
}
