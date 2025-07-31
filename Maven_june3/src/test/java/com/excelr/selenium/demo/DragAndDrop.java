package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com/droppable/");
	
	driver.switchTo().frame(0);
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
	
	//act.dragAndDrop(drag, drop).build().perform();
	
	act.clickAndHold(drag).release(drop).build().perform();
	
	Thread.sleep(6000);
	driver.quit();
}
}
