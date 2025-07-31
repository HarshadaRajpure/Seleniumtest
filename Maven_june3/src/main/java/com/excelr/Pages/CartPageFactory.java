package com.excelr.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageFactory {
	WebDriver driver;

	@FindBy(xpath = "(//input[@value=\"Add to cart\"])[6]")
	private WebElement btn1;

	@FindBy(xpath = "//ul[@class=\"option-list\"]/li[1]//label[1]")
	private WebElement btn2;

	@FindBy(xpath = "//input[@id=\"add-to-cart-button-75\"]")
	private WebElement btn3;

	public CartPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AddtoCart() throws InterruptedException {
		btn1.click();
		btn2.click();
		Thread.sleep(2000);
		btn3.click();
		Thread.sleep(2000);
	}

}
