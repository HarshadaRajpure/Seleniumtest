package com.excelr.selenium.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screnshot {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	
	File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File location=new File(".//Screenshot/demo.png");
	
	try {
		Files.copy(screenshot, location);
		System.out.println("Screenshot is captured");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
}
}
