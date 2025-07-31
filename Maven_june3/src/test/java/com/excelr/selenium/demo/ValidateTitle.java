package com.excelr.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String expectedTitle = "Facebook – log in or sign up";

		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)){
			System.out.println("title is matching..");
		}
		else {
			System.out.println("Title doest not matching..");
		}

	}
}
