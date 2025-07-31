package com.excelr.selenium.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShooperStack {

	WebDriver driver;

	@Test(dataProvider = "dataset")
	public void Login(String email, String pass) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shoppersstack.com/user-signin");

		WebElement emailtxtBox=driver.findElement(By.xpath("//input[@name=\"Email\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(emailtxtBox).click().sendKeys(email).build().perform();
		WebElement passtxtbox=driver.findElement(By.xpath("//input[@name=\"Password\"]"));
		act.moveToElement(passtxtbox).click().sendKeys(pass).build().perform();

		driver.findElement(By.xpath("//button[@id=\"Login\"]/span[1]")).click();
		
		
	}

	@DataProvider(name="dataset")
	public Object[][] dpMethod() {
		return new Object[][] { { "data15@gmail.com", "Test@123" } };
	}
}
