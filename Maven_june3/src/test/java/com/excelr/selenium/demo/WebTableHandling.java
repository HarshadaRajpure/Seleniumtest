package com.excelr.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id=\"countries\"]//tr"));
	System.out.println("Total available rows "+rows.size());
	
	
	List<WebElement> columns=driver.findElements(By.xpath("//table[@id=\"countries\"]//tr[1]/td"));
	System.out.println("Total availabel columns "+columns.size());
	
	
	
	for(int r=1;r<=rows.size();r++) {
		for(int c=1;c<=columns.size();c++) {
			String values=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]/td["+c+"]")).getText();
			System.out.println(values);
		}
		
		System.out.println();
	}
}
}
