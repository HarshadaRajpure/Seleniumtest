package com.excelr.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPafeFactory {

	WebDriver driver;

	@FindBy(id = "Email")
	private WebElement emailtxtBox;

	@FindBy(id = "Password")
	private WebElement passw;

	@FindBy(xpath = "//input[@value=\"Log in\"]")
	private WebElement LoginBtn;

	public LoginPafeFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String un, String pass) {
		emailtxtBox.sendKeys(un);
		passw.sendKeys(pass);
		LoginBtn.click();
	}
}
