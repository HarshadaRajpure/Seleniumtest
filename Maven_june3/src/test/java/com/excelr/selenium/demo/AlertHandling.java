package com.excelr.selenium.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();

		Alert al = driver.switchTo().alert();

		String msg = al.getText();
		System.out.println(msg);
		System.out.println("alert accepted");
		al.accept();
		Thread.sleep(6000);
		driver.close();
		JavascriptExecutor
	}
}
