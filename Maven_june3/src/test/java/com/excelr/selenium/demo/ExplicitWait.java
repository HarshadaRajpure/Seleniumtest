package com.excelr.selenium.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		WebDriverWait waDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement user = waDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("user-name")));
		user.sendKeys("standard_user");
		WebElement pass = waDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		pass.sendKeys("secret_sauce");

		WebElement loginButton = waDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		loginButton.click();

		waDriverWait.until(ExpectedConditions.titleContains("Labs"));
		System.out.println("Login succesful");

	}
}
