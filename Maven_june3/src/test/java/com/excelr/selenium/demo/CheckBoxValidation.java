package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxValidation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	
	WebElement checkBox=driver.findElement(By.id("RememberMe"));
	
	if(checkBox.isDisplayed()) {
		System.out.println("It is displayed ");
	}
	else {
		System.out.println("It is not displayed");
	}
	if(checkBox.isEnabled()) {
		System.out.println("It is enabled");
	}
	else {
		System.out.println("It is not enabled");
	}
	
	checkBox.click();
	if(checkBox.isSelected()) {
		System.out.println("check box is selected");
		
	}
	else {
		System.out.println("It is not slected");
	}
}
}
