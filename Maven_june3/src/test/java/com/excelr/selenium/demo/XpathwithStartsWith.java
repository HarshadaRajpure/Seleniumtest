package com.excelr.selenium.demo;

import java.util.Iterator;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathwithStartsWith {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
//	WebElement loginButton=driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]"));
//	loginButton.click();
	
//	WebElement forPass=driver.findElement(By.xpath("//a[contains(@id,\"u_0_6\")]"));
//	forPass.click();
	
//	driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	
//	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	
	
	//a[contains(@title,'Gujarati')]
	//a[starts-with(@title,'Gujarati')]
	//a[starts-with(@id,'u_0_a')]
	
}
}
