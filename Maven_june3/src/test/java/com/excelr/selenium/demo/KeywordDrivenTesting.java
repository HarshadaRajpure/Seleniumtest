package com.excelr.selenium.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeywordDrivenTesting {
	public static WebDriver driver;
public static void main(String[] args) throws Exception {
	
	String path="C:\\Users\\excel\\OneDrive\\Desktop\\June3\\Book1.xlsx";
	
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet3");
	
	int lastRow=sheet.getLastRowNum();
	System.out.println("Last Row is "+lastRow);
	
	for(int r=1;r<=lastRow;r++) {
		XSSFRow row=sheet.getRow(r);
		XSSFCell method=row.getCell(0);
		XSSFCell keys=row.getCell(1);
		
		System.out.println(method+" "+keys);
		
		
		switch(keys.toString().toLowerCase()) {
		
		case "launch":
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			break;
		
		
		case "login":
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("ates1@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
			System.out.println("Login successful..");
			break;
			
		case "cart":
			//driver.findElement(By.xpath("//input[@value=\"Add to cart\"][1]")).click();
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[6]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//ul[@class=\"option-list\"]/li[1]//label[1]")).click();
			driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-75\"]")).click();
			Thread.sleep(2000);
			System.out.println("Items added to cart..");
			break;
			
		case "logout":
			WebElement logo=driver.findElement(By.linkText("Log out"));
			
			
			Actions act=new Actions(driver);
			act.moveToElement(logo).build().perform();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(logo)).click();
			
			System.out.println("Logged out successfully..");
			
			
		
		default:
			System.out.println("Invalid keywords..");
		}
	}
}
}
