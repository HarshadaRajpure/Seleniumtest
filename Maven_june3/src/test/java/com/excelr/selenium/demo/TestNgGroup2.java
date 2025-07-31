package com.excelr.selenium.demo;

import org.testng.annotations.Test;

public class TestNgGroup2 {

	@Test(groups = "smoke")
	public void testgropu21() {
		System.out.println("In testgropu21");
	}
	
	@Test(groups = "sanity")
	public void testgropu22() {
		System.out.println("In testgropu22");
	}
	
	
	@Test(groups = "smoke")
	public void testgropu23() {
		System.out.println("In testgropu23");
	}
	

	@Test(groups = "regression")
	public void testgropu24() {
		System.out.println("In testgropu24");
	}
}
