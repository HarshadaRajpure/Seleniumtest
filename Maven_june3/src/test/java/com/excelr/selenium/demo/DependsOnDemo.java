package com.excelr.selenium.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {

	@Test
	public void register() {
		System.out.println("test1 passed");
		Assert.assertFalse(true);
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("login");
		
	}
}
