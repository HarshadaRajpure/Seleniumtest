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

public class HybridDrivenTesting {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\excel\\OneDrive\\Desktop\\June3\\Book1.xlsx";

		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ksheet = wb.getSheet("KShhet");
		XSSFSheet dsheet = wb.getSheet("Dshhet");

		int krow = ksheet.getLastRowNum();
		int drow = dsheet.getLastRowNum();
		System.out.println(krow);
		System.out.println(drow);

		for (int r = 1; r <= drow; r++) {
			XSSFRow row = dsheet.getRow(r);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);

			for (int kr = 1; kr <= krow; kr++) {
				XSSFRow keyrow = ksheet.getRow(kr);
				XSSFCell method = keyrow.getCell(0);
				XSSFCell keys = keyrow.getCell(1);

				System.out.println(method + "=>" + keyrow);

				switch (keys.toString().toLowerCase()) {

				case "launch":
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://demowebshop.tricentis.com/login");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					break;

				case "login":
					driver.findElement(By.linkText("Log in")).click();
					driver.findElement(By.id("Email")).sendKeys(username.toString());
					Thread.sleep(2000);
					driver.findElement(By.id("Password")).sendKeys(password.toString());
					Thread.sleep(4000);
					driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
					System.out.println("Login successful..");
					break;

				case "cart":
					// driver.findElement(By.xpath("//input[@value=\"Add to cart\"][1]")).click();
					// Thread.sleep(4000);
					driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[6]")).click();
					Thread.sleep(4000);
					driver.findElement(By.xpath("//ul[@class=\"option-list\"]/li[1]//label[1]")).click();
					driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-75\"]")).click();
					Thread.sleep(2000);
					System.out.println("Items added to cart..");
					break;

				case "logout":
					WebElement logo = driver.findElement(By.linkText("Log out"));

					Actions act = new Actions(driver);
					act.moveToElement(logo).build().perform();
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.elementToBeClickable(logo)).click();

					System.out.println("Logged out successfully..");
				}
			}
		}
	}
}
