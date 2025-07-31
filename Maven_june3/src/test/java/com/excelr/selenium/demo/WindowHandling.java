package com.excelr.selenium.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.irctc.co.in/nget/train-search");
	WebElement ale=driver.findElement(By.xpath("//div[@class=\"text-center col-xs-12\"]/button"));
	ale.click();
	
	driver.findElement(By.linkText("HOTELS")).click();
	
	String parentWindow=driver.getWindowHandle();
	System.out.println(parentWindow);
	
	
	Set<String> allWindows=driver.getWindowHandles();
	System.out.println("Total windows opern "+allWindows.size());
	
	System.out.println(allWindows);
	
	Iterator<String> itr=allWindows.iterator();
	while(itr.hasNext()) {
		String childWindow=itr.next();
		
		if(!parentWindow.equals(childWindow)) {
			driver.switchTo().window(childWindow);
			Thread.sleep(2000);
			driver.findElement(By.linkText("Bus Tickets")).click();
		}
	}
	TakesScreenshot
	driver.switchTo().window(parentWindow);
	
}
}
