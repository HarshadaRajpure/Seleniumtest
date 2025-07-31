package com.excelr.selenium.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg2 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("In berfoer test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("In before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In before method");
	}
	
	@Test
	public void test1() {
		System.out.println("In testcase1");
	}
	
	@Test
	public void test2() {
		System.out.println("In testcase2");
	}
	

	@AfterSuite
	public void afterSuite() {
		System.out.println("In after suite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("In after test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("In after class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("In after method");
	}
	
}
