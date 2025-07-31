package com.excelr.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logoutpage {

WebDriver driver;

public Logoutpage(WebDriver driver) {
	this.driver = driver;
}


public void Logout() {
	driver.findElement(By.linkText("Log out")).click();
}


}
