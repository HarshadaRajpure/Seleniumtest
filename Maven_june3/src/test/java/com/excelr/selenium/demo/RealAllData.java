package com.excelr.selenium.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RealAllData {
public static void main(String[] args) throws Exception {
	String path="C:\\Users\\excel\\OneDrive\\Desktop\\June3\\Book1.xlsx";
	
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Data");
	
	int LastRow=sheet.getLastRowNum();
	System.out.println(LastRow);
	
	for(int r=1;r<=LastRow;r++) {
		XSSFRow row=sheet.getRow(r);
		XSSFCell un=row.getCell(0);
		XSSFCell pass=row.getCell(1);
		
		System.out.println(un+ " " + pass);
	}
}
}
