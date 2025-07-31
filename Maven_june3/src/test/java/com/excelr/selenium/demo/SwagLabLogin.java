package com.excelr.selenium.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabLogin {
	static WebDriver driver;
public static void main(String[] args) throws Exception {
	 try {
		driver=new ChromeDriver();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	
	String path="C:\\Users\\excel\\OneDrive\\Desktop\\June3\\Book1.xlsx";
	
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet2");
	
	int lastRow=sheet.getLastRowNum();
	System.out.println(lastRow);
	
	for(int r=1;r<=lastRow;r++) {
		XSSFRow row=sheet.getRow(r);
		XSSFCell username=row.getCell(0);
		XSSFCell password=row.getCell(1);
		System.out.println(username+" "+password);
		
		
		driver.findElement(By.id("user-name")).sendKeys(username.toString());
		driver.findElement(By.id("password")).sendKeys(password.toString());
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Valid data Entered");
	}
	System.out.println("Invalid data entered");
	
	
	
}
}
