package com.excelr.selenium.demo;

import org.testng.annotations.Test;

public class TestNgGrop1 {

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("In test1");
	}
	
	@Test(groups = "sanity")
	public void test2() {
		System.out.println("In test2");
	}
	
	
	@Test(groups = "smoke")
	public void test3() {
		System.out.println("In test3");
	}
	

	@Test(groups = "regression")
	public void test4() {
		System.out.println("In test4");
	}
}
