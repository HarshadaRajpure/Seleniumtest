package com.excelr.selenium.demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {
public static void main(String[] args) throws Exception {
	
	String path="C:\\Users\\excel\\OneDrive\\Desktop\\June3\\Book1.xlsx";
	FileInputStream fis=new FileInputStream(path);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Data");
	
	XSSFRow row1=sheet.getRow(1);
	
	String un=row1.getCell(0).getStringCellValue();
	String pass=row1.getCell(1).getStringCellValue();
	
	System.out.println(un+" "+pass);
	
	XSSFRow row2=sheet.getRow(2);	
	
	String un2=row2.getCell(0).getStringCellValue();
	String pass2=row2.getCell(1).getStringCellValue();
	
	System.out.println(un2+" "+pass2);
}
}
