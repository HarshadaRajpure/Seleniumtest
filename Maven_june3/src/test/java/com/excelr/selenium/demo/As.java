package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/radio.html");
	
	WebElement checkbox1=driver.findElement(By.cssSelector("input[value=\"checkbox1\"]"));
	
	if(checkbox1.isDisplayed()) {
		System.out.println("check box1 is displayed");
	}
	else {
		System.out.println("Checkbox1 isnt displayed");
	}
	
	if(checkbox1.isEnabled()) {
		System.out.println("checkbox1 is enabaled");
	}
	else {
		System.out.println("checkbix1 isnt enabled");
	}
	
	checkbox1.click();
	
	if(checkbox1.isSelected()) {
		System.out.println("checkbox1 is selected");
	}
	else {
		System.out.println("checkbox1 isnt selectd");
	}
	
	WebElement checkBox2=driver.findElement(By.cssSelector("input[value=\"checkbox2\"]"));
	
	if(checkBox2.isDisplayed()) {
		System.out.println("check box2 is displayed");
	}
	else {
		System.out.println("Checkbox2 isnt displayed");
	}
	
	if(checkBox2.isEnabled()) {
		System.out.println("checkbox2 is enabaled");
	}
	else {
		System.out.println("checkbix2 isnt enabled");
	}
	
	checkBox2.click();
	
	if(checkBox2.isSelected()) {
		System.out.println("checkbox2 is selected");
	}
	else {
		System.out.println("checkbox2 isnt selectd");
	}
	
}
}
