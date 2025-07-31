package com.excelr.selenium.demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(MyListener.class)
public class MyLister {

	@Test(successPercentage = 60,invocationCount = 5)
	public void test1() {
		System.out.println("In test1");
	}

	@Test
	public void test2() {
		System.out.println("In test2");
		Assert.assertFalse(true);
	}

	@Test(dependsOnMethods = "test2")
	public void test3() {
		System.out.println("In test3");
	}
}
