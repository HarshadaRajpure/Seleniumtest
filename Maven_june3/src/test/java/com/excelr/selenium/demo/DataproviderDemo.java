package com.excelr.selenium.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {

	@Test(dataProvider = "logindataset")
	public void login(String un,String pass) {
		
		System.out.println("Username "+un+" password "+pass);
	}
	
	
	@DataProvider(name="logindataset")
	public Object[][] dpmethod(){
		
		return new Object[][] {
			{"Admin","admin123"},
			{"smith","123"},
			{"HR","1234"},
			{"john","12"}
		};
	}
	
}
