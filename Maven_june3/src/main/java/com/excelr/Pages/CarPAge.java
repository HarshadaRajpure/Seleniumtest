package com.excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarPAge {

	WebDriver driver;

	public CarPAge(WebDriver driver) {
		this.driver = driver;
	}

	public void AddToCart() throws Exception {
		driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[6]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul[@class=\"option-list\"]/li[1]//label[1]")).click();
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-75\"]")).click();
		Thread.sleep(2000);
		System.out.println("Items added to cart..");
	}

}
