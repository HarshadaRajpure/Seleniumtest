package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {

	WebDriver driver;

	@Test(dataProvider = "dataset")
	public void searchMethod(String brand, String model) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys(brand + " " + model);
		search.sendKeys(Keys.ENTER);
	}
	
	
	@DataProvider(name = "dataset")
	public Object[][] dpmethod(){
		return new Object[][] {
			{"Iphone","12"},
			{"Oneplus","7"},
			{"samsung","s24"},
			{"oppo","k13"}
		};
	}

}
