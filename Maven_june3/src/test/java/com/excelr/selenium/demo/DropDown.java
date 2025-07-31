package com.excelr.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@class=\"_6ltg\"]/a")).click();

		WebElement day = driver.findElement(By.name("birthday_day"));

		Select sel = new Select(day);
		sel.selectByIndex(10);

		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue("11");

		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("2006");

		Thread.sleep(6000);
		driver.close();
	}
}
