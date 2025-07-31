package com.excelr.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowser {
public static void main(String[] args) {
//	WebDriver driver=new FirefoxDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.facebook.com/");
	
	
	WebDriver driver=new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
}
}
