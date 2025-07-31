package com.excelr.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Url {
public static void main(String[] args) throws InterruptedException {
	//created an instance of chromedriver & stored into webdriver reference
	WebDriver driver=new ChromeDriver();
	
	//for maximize the window
	driver.manage().window().maximize();
	
	//launches the application
	driver.get("https://www.facebook.com/");
	
	
	//it pauses the execution for seconds
	Thread.sleep(4000);	
	
	//close the current window
	//driver.close();	
	
	driver.quit();
	
}
}
