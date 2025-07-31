package com.excelr.selenium.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
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

import com.excelr.Pages.CarPAge;
import com.excelr.Pages.LoginPage;
import com.excelr.Pages.Logoutpage;

public class HybridTest {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		LoginPage lp = new LoginPage(driver);
		CarPAge cp = new CarPAge(driver);
		Logoutpage lg = new Logoutpage(driver);

		String path = "C:\\Users\\excel\\OneDrive\\Desktop\\June3\\Book1.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet dSheet = wb.getSheet("Dshhet");
		XSSFSheet kSheet = wb.getSheet("KShhet");

		int dlastrow = dSheet.getLastRowNum();
		int klastrow = kSheet.getLastRowNum();

		for (int dr = 1; dr <= dlastrow; dr++) {
			XSSFRow drow = dSheet.getRow(dr);
			XSSFCell Username = drow.getCell(0);
			XSSFCell password = drow.getCell(1);

			System.out.println(Username + " " + password);
			for (int kr = 1; kr <= klastrow; kr++) {
				XSSFRow krow = kSheet.getRow(kr);
				XSSFCell Method = krow.getCell(0);
				XSSFCell keys = krow.getCell(1);

				System.out.println(Method + " " + keys);
				switch (keys.toString().toLowerCase()) {

				case "launch":
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://demowebshop.tricentis.com/login");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					break;

				case "login":
					lp.Login(Username.toString(), password.toString());

				case "cart":
					cp.AddToCart();
					break;

				case "logout":
					lg.Logout();
					System.out.println("Logged out successfully..");
				}
			}
		}
	}
}
