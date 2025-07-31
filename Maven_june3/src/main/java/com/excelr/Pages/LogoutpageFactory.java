package com.excelr.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutpageFactory {
	WebDriver driver;

	@FindBy(linkText = "Log out")
	private WebElement logo;

	public LogoutpageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void Logout() {
		Actions act=new Actions(driver);
		act.moveToElement(logo).click().build().perform();
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//	wait.until(ExpectedConditions.elementToBeClickable(logo)).click();
		
		
	}


}
