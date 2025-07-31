package com.excelr.selenium.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		String actTitle=driver.getTitle();
		String actUrl=driver.getCurrentUrl();
		
		
		System.out.println("TestCase1");
		if(actTitle.length() > actUrl.length()) {
			System.out.println("Test case is paased");
		}
		else {
			System.out.println("Test case is failde");
		}
		
		Thread.sleep(6000);
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@data-testid=\"royal-login-button\"]"));
		
		System.out.println("Test case 2");
		if(loginButton.isDisplayed()) {
			System.out.println("Test case2 is passed & it is displayed");
		}
		else {
			System.out.println("Testcase2 failed");
		}
		if(loginButton.isEnabled()) {
			System.out.println("login button is enabled");
		}
		else {
			System.out.println("login button is not enabled");
		}
		loginButton.click();
		
		
		System.out.println("Test Case 3");
		WebElement forgottonPass=driver.findElement(By.linkText("Forgotten password?"));
		forgottonPass.click();
		
		String forgottenPasswordTitle="https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";
		
		if(forgottenPasswordTitle.contains("account1")) {
			System.out.println("Test Case failed");
		}
		else {
			System.out.println("Passed");
		}
		

		
		System.out.println("Test Case 4");
		
		WebElement searchButton=driver.findElement(By.name("did_submit"));
		if(searchButton.isDisplayed()) {
			System.out.println("search button is dispayed");
		}
		else {
			System.out.println("search button isnt displayed");
		}
		if(searchButton.isEnabled())
		{
			System.out.println("search button is enable");
		}else {
			System.out.println("It is not enable");
		}
	}

}
