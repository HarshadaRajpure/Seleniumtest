package com.excelr.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNAmeLocator {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	List<WebElement>  images=driver.findElements(By.tagName("img"));
	System.out.println(images.size());
	
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	
	for(int i=0;i<links.size();i++) {
		String link=links.get(i).getText();
		if(link.startsWith("C")) {
			System.out.println(link);
		}
		//System.out.println(links.get(i).getText()+"==>"+links.get(i).getAttribute("href"));
	}
	
	
	
	if(images.size()>links.size()) {
		System.out.println("Images are greater");
	}
	else {
		System.out.println("Links are greater");
	}
}
}
